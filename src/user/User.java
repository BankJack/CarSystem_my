package user;

public abstract class User {
	
	private String userName;
	private String userPwd;
	private String phone;
	//庄户的状态 1.正常   2.锁定
	private int status=1;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public User() {
		super();
	}
	
	public User(String userName, String userPwd, String phone) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.phone = phone;
	}
	
	
}
