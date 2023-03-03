package com.book.biz;

import com.book.dao.LoginDao;
import com.book.entity.LoginEntity;

public class LoginBiz {

	public boolean getLoginUser(LoginEntity entity) {
		boolean isLogin = false;
		LoginDao dao = new LoginDao();
		if(entity.getUserid().equals("") || entity.getUserpwd().equals("")
				|| entity == null)
			return false;
			
		isLogin = dao.getLoginUser(entity);
		
		return isLogin;
	}

}
