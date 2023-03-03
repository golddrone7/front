package common;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JdbcTemplate {
	
	public static Connection getConnection() {
		Connection conn = null;
		DataSource ds = null;
		
		try {
			Context context = new InitialContext();
			Context env=(Context)context.lookup("java:comp/env");
			ds = (DataSource)env.lookup("jdbc/ora");
			
			conn=ds.getConnection();
			conn.setAutoCommit(false);
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void close(ResultSet rs) {
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void close(Connection conn) {
		if(isConnection(conn)) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
	}

	public static void close(PreparedStatement pstmt) {
		if(pstmt!=null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void commit(Connection conn) {
		if(isConnection(conn))
		try {
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		if(isConnection(conn))
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static boolean isConnection(Connection conn) {
		boolean valid = true;
		try {
			if(conn.isClosed() || conn ==null)
				valid= false;
		} catch (SQLException e) {
			valid=false;
			e.printStackTrace();
		}
		return valid;
	}

	public JdbcTemplate() {
	}
	
	
}
