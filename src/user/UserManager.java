package user;

import java.util.Arrays;
/**
 * 用户管理
 * @author Administrator
 *
 */
public class UserManager {
	User[] arr=new User[10];
	
	private int size;
	
	public UserManager() {
		super();
		User root=new Root();
		this.add(root);
	}
	/**
	 * 在数组中添加元素
	 * @param user
	 * @return
	 */
	public boolean add(User user) {
		/**
		 * 判断要添加的这个元素的用户名是否与数组中其他元素的用户名相同
		 */
		User user1=this.seek(user.getUserName());
		if(user1!=null) {
			return false;
		}
		/**
		 * 判断数组是否需要扩容
		 */
		if(this.size+1>arr.length) {
			arr=Arrays.copyOf(arr, arr.length+arr.length>>1);
		}
		
		arr[this.size++]=user;
		return true;
	}
	/**
	 * 寻找数组中是否有相同用户名的元素
	 * @param userName
	 * @return
	 */
	public User seek(String userName) {
		for (int i = 0; i <this.size; i++) {
			if(arr[i].equals(userName)) {
				return arr[i];
			}
		}
		return null;
	}
	
	/*public DataWrap logIn(String userName,String userPwd) {
		User user=this.seek(userName);
		if(user==null) {
			 DataWrap wrap=new DataWrap(3,null);
			 return wrap;
		}
		
		
	}
	*/
	class DataWrap{
		private int code;//状态码  1.登陆成功  2.密码错误  3.用户不存在  4.账户被锁定
		private User user;
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public DataWrap(int code, User user) {
			super();
			this.code = code;
			this.user = user;
		}
		
	}
}
