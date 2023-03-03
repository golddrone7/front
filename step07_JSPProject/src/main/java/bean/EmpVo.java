package bean;

//vo dto bean(웹에서 동작하는 객체) 다 같은 말
public class EmpVo {
	private String name;
	private String phone;
	private String addr;
	
	public EmpVo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public EmpVo(String name, String phone, String addr) {
		super();
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
