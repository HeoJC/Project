package com.mustacchio.briiiqtt;

import java.sql.SQLException;

public class LikeItDAO extends DAO {

//	public boolean isLikeItAlreadyPressed(LikeIt likeIt) {
//		connect();
//		try {
//			conn.setAutoCommit(false);
//			pstmt = conn.prepareStatement("select is_liked from likes where id = ? and who_likes_it = ?");
//			pstmt.setString(1, likeIt.getId());
//			pstmt.setString(2, likeIt.getWhoLikesIt());
//			rs = pstmt.executeQuery();
//			if(rs.next()) { //값이 있다.
//				//0인지 1인지
//				String result = rs.getString(1);
//				if(/*0이면*/) {
//					pstmt = conn.prepareStatement("update likes set is_liked = '1' where id = ? and who_likes_it = ?");
//					pstmt.setString(1, likeIt.getId());
//					pstmt.setString(2, likeIt.getWhoLikesIt());
//					int r = pstmt.executeUpdate();
//				} else(result.equals(1)/*1이면*/) {
//					// 0으로 update 
//					pstmt = conn.prepareStatement("update likes set is_liked = '0' where id = ? and who_likes_it = ?");
//					pstmt.setString(1, likeIt.getId());
//					pstmt.setString(2, likeIt.getWhoLikesIt());
//					int r = pstmt.executeUpdate();
//				}
//				
//			} else { // 값이 없다.
//				// insert into
//				pstmt = conn.prepareStatement("insert into likes values ('1', ?, ?)");
//				pstmt.setString(1, likeIt.getId());
//				pstmt.setString(2, likeIt.getWhoLikesIt());
//				int r = pstmt.executeUpdate();
//				
//			}
//			System.out.println("bye");
//			String isLiked = rs.getString(1);
//			System.out.println(isLiked);
//			if (isLiked.equals("1")) {
//				System.out.println("1");
//				if (iDontLikeIt(likeIt)) {
//					return false;
//				}
//			} else {
//				System.out.println("a");
//				if (iLikeIt(likeIt)) {
//					return true;
//				}
//			}
//			conn.commit();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return false;
//	}

}