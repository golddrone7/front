package com.exam.biz;

import java.util.ArrayList;

import com.exam.dao.EmpDao;
import com.exam.entity.EmpEntity;

public class EmpBiz {

	public int insertEmp(EmpEntity emp) {
		EmpDao dao = new EmpDao();
		int n=dao.insertEmp(emp);
		
		
		return n;
	}

	public ArrayList<EmpEntity> listEmp() {
		
		EmpDao dao = new EmpDao();
		ArrayList<EmpEntity> list = dao.listEmp();
		
		return list;
	}

	public int updateEmp(EmpEntity entity) {
		EmpDao dao = new EmpDao();
		int n = dao.updateEmp(entity);
		return n;
	}

	public int deleteEmp(EmpEntity entity) {
		EmpDao dao = new EmpDao();
		int n = dao.deleteEmp(entity);
		
		return n;
	}

	public int updateEmp2(EmpEntity entity) {
		EmpDao dao = new EmpDao();
		int n = dao.updateEmp2(entity);
		return n;
	}

	public int deleteEmp2(EmpEntity entity) {
		EmpDao dao = new EmpDao();
		int n = dao.deleteEmp2(entity);
		return n;
	}
	
	
	
}
