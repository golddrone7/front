package com.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static common.JdbcTemplate.*;
import com.book.entity.LoginEntity;

public class LoginDao {

	public boolean getLoginUser(LoginEntity entity) {
		boolean isLogin = false;
		ResultSet rs = null;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "select * from member";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				if(entity.getUserid().equals(rs.getString("userid"))
						&& entity.getUserpwd().equals(rs.getString("userpwd"))) {
					isLogin = true;
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn);
			close(pstmt);
			close(rs);
		}
		
		
		
		return isLogin;
	}

}
