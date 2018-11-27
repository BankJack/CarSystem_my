package user;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		UserManager m=new UserManager();
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.println("请选择：（1.登陆  2.退出）");
			int num = input.nextInt();
			if(num==1) {
				System.out.println("请输入用户名");
				String userName=input.next();
				System.out.println("请输入密码");
				String userPwd=input.next();
				
			}else if(num==2) {
				System.out.println("谢谢使用");
				break;
			}
		}
	}

}
