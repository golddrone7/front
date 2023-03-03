<%@page import="javax.naming.NamingException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:useBean id="ob" class="register.RegisterEntity" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="ob"/>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=ob.getMem_name() %>님 회원가입 되셨습니다.!

<%
/* create table member(
id varchar2(10) primary key,
passwd varchar2(10) not null,
name varchar2(20) not null,
email varchar2(30),
phone varchar2(15),
zipcode varchar2(5),
addr varchar2(70)); */
		try{
		Connection conn=null;
		DataSource ds=null;
		
		Context context = new InitialContext();
		Context env = (Context)context.lookup("java:comp/env");
		ds=(DataSource)env.lookup("jdbc/ora");
	//	ds=(DataSource)env.lookup("java:comp/env/jdbc/ora");
	
		conn=ds.getConnection();
		} catch(NamingException e){}	
		  catch(SQLException e){}
	//java:comp/env
	// 설정된 엔트리와 자원(Resource)은
	// JNDI namespace의 java:comp/env 부분에 놓이게 되고
	// 자원에 대해 접근하려면 lookup("java:comp/env")을 통해
	// 로컬리소스에 접근
	
	
/* try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "edu","1234");
		conn.setAutoCommit(false);
		String sql = "insert into member values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, ob.getMem_id());
		pstmt.setString(2, ob.getMem_passwd());
		pstmt.setString(3, ob.getMem_name());
		pstmt.setString(4, ob.getMem_email());
		pstmt.setString(5, ob.getMem_phone());
		pstmt.setString(6, ob.getMem_zipcode());
		pstmt.setString(7, ob.getMem_addr());
		int n = pstmt.executeUpdate();
		
		if(n>0){
			conn.commit();
			System.out.println(n +"건의 데이터가 추가되었습니다.");
		}
		
		pstmt.close();
		conn.close();
	} catch(Exception e){
		System.out.println("예외 발생");
	}
 */
%>





</body>
</html>