package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.exam.entity.EmpEntity;
import static common.JdbcTemplate.*;

public class EmpDao {
	
	/*
	 * create table emp(
eno number(6) primary key,   --사원번호
ename varchar2(10)not null,  --사원이름
phone varchar2(15),          --연락처
dept varchar2(20));          --부서명

--시퀀스만들기
create sequence seq_eno increment by 1 start with 1
nocycle nocache;
	*/
	public int insertEmp(EmpEntity emp) {
		int n =0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into emp values(seq_eno.nextval,?,?,?)";
		//DB에 저장해주세요
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getEname());
			pstmt.setString(2, emp.getPhone());
			pstmt.setString(3, emp.getDept());
			n = pstmt.executeUpdate();
			if(n>0) {
				commit(conn);
			}
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return n;
	}

	public ArrayList<EmpEntity> listEmp() {
		PreparedStatement pstmt = null;
		EmpEntity emp = null;
		ResultSet rs = null; 
		Connection conn = getConnection();
		String sql = "select * from emp";
		ArrayList<EmpEntity> list = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				if(list==null)
					list = new ArrayList<>();
				emp = new EmpEntity();
				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
				emp.setPhone(rs.getString("phone")); 
				emp.setDept(rs.getString("dept"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		return list;
	}

	public int updateEmp(EmpEntity entity) {
		int n=0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "update emp set phone=?, dept=? where ename=? and eno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, entity.getPhone());
			pstmt.setString(2, entity.getDept());
			pstmt.setString(3, entity.getEname());
			pstmt.setInt(4, entity.getEno());
			n = pstmt.executeUpdate();
			System.out.println(n);
			if(n>0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return n;
	}

	public int deleteEmp(EmpEntity entity) {
		int n=0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "delete from emp where eno=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, entity.getEno());
			n = pstmt.executeUpdate();
			if(n>0)
				commit(conn);
			
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(conn);
			close(pstmt);
		}
		return n;
	}

	public int updateEmp2(EmpEntity entity) {
		int n=0;
		Connection conn=getConnection();
		PreparedStatement pstmt = null;
		
		String sql="update emp set phone=?, dept=? where eno=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, entity.getPhone());
			pstmt.setString(2, entity.getDept());
			pstmt.setInt(3, entity.getEno());
			n = pstmt.executeUpdate();
			if(n>0)
				commit(conn);
			
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		
		
		return n;
	}

	public int deleteEmp2(EmpEntity entity) {
		int n =0;
		Connection conn=getConnection();
		PreparedStatement pstmt = null;
		
		String sql="delete from emp where eno=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, entity.getEno());
			n = pstmt.executeUpdate();
			if(n>0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return n;
	}
}
