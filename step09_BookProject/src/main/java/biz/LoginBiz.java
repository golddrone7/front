package biz;

import dao.LoginDao;

public class LoginBiz {

	public LoginBiz() {
		// TODO Auto-generated constructor stub
	}
							//		userid, userpwd
	public boolean getLoginUser(String id, String pass) {
		LoginDao dao = new LoginDao();
		boolean dto = dao.getLoginUser(id,pass);
		
		return dto;
	}

}
