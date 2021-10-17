package co.yedam.cart;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mustacchio.briiiqtt.DAO;

public class CartDAO extends DAO{
	
	// 장바구니 불러오기
	public List<Cart> getCartList() {
		connect() ;
		List<Cart> list = new ArrayList<>() ;
		
		try {
			stmt = conn.createStatement() ;
			rs = stmt.executeQuery("select * from cart") ;
			while(rs.next()) {
				Cart cart = new Cart() ;
				cart.setId(rs.getString("id")) ;
				cart.setName(rs.getString("name")) ;
				cart.setPrice(rs.getInt("price")) ;
				cart.setP_size(rs.getString("p_size"));
				cart.setCount(rs.getInt("count")) ;
				cart.setDeliveryfee(rs.getInt("deliveryfee")) ;
				list.add(cart) ;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect() ;
		}		
		return list ;
	}
	
	// 장바구니에 입력 (구매하기 눌렀을 때)
	public Cart insertCart(Cart cart) {
		connect() ;
		int currId = 0 ;
		try {
			conn.setAutoCommit(false) ; 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			stmt = conn.createStatement() ;
			rs = stmt.executeQuery("select value from id_repository2 where name='cart'") ;
			if (rs.next()) {
				currId = rs.getInt("value") ;
			}
			currId++ ;
			pstmt = conn.prepareStatement("insert into cart values(?,?,?,?,?,?)") ;
			pstmt.setInt(1, currId) ;
			pstmt.setString(2, cart.getName()) ;
			pstmt.setInt(3, cart.getPrice()) ;
			pstmt.setString(4, cart.getP_size()) ;
			pstmt.setInt(5, cart.getCount()) ;
			pstmt.setInt(6, cart.getDeliveryfee()) ;
			int r = pstmt.executeUpdate() ;
			System.out.println(r + "건 입력") ;
			
			pstmt = conn.prepareStatement("update id_repository2 set value=? where name='cart'") ;
			pstmt.setInt(1, currId) ;
			pstmt.executeUpdate() ;
			
			conn.commit() ;
			cart.setId(String.valueOf(currId)) ;
			return cart ;
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback() ;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return null ;
		} finally {
			disconnect() ;
		}
	}
	
}
