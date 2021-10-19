package com.mustacchio.briiiqtt;

import java.sql.SQLException;

public class LikeItDAO extends DAO {

	public boolean isLikeItAlreadyPressed(LikeIt likeIt) {
		connect();
		try {
			pstmt = conn.prepareStatement("select is_liked from likes where id = ? and who_likes_it = ?");
			pstmt.setString(1, likeIt.getId());
			pstmt.setString(2, likeIt.getId());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String isLiked = rs.getString(1);
				if (isLiked.equals("1")) {
					return true;
				} else {
					return false;
			}}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}
	
	public boolean iLikeIt(LikeIt likeIt) {
		connect();
		try {
			pstmt = conn.prepareStatement("update likes set is_liked = '0' where id = ? and who_likes_it = ?");
			pstmt.setString(2, likeIt.getId());
			pstmt.setString(3, likeIt.getWhoLikesIt());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String whoLikesIt = rs.getString(2);
				if (likeIt.getWhoLikesIt().equals(whoLikesIt)) {
					return true;
				}
			}
			return false;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

}
