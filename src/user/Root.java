package user;

public class Root extends User {
	Root() {
		super("root","root","");
	}
	/**
	 * 单例模式之饿汉式
	 */
	private static Root aa=new Root();
	/**
	 * 单例模式获取超级管理员
	 * @return
	 */
	 static Root getAa() {
		return aa;
	}
	
}
