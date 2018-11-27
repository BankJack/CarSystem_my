package user;

public class NormalUser extends User {

	private String idCard;
	private int aginest=3;
	
	
	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public int getAginest() {
		return aginest;
	}

	public void setAginest(int aginest) {
		this.aginest = aginest;
	}

	public NormalUser() {
		super();
	}

	public NormalUser(String userName, String userPwd, String phone) {
		super(userName, userPwd, phone);
	}

}
