package com.in.method;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet(name = "List", urlPatterns = { "/list.do" })
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		
		
		//4. db에 저장
				Connection conn=null;
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","edu", "1234");
					conn.setAutoCommit(false);
					System.out.println("연결 성공~");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				PreparedStatement pstmt = null;
				PrintWriter out =response.getWriter();
				
				String sql="select * from users order by num desc";
				ResultSet rs = null;
				out.append("<html><head><title>InsertServlet</title></head>");
				out.append("<body>");
				out.append("<h3>List Servlet</h3><br><br>");
					try {
						pstmt = conn.prepareStatement(sql);
						rs = pstmt.executeQuery();
						out.append("<table border='1' width='350px'>");
						out.append("<tr><td>이름</td><td>번호</td><td>주소</td></tr>");
						
						while(rs.next()) {
							
							String name = rs.getString("name");
							String phone = rs.getString("phone");
							String addr = rs.getString("addr");
							out.append("<tr><td> " + name + "</td>");
							out.append("<td> " + phone + "</td>");
							out.append("<td> " + addr + "</td></tr>");
						}
						out.append("</table>");
						out.append("<a href='/servlet/test/dbTest.html'>처음화면</a>");
						out.append("</body></html>");
						
					} catch (SQLException e) {
						System.out.println("1111");
						e.printStackTrace();
					}
	
	}
}
