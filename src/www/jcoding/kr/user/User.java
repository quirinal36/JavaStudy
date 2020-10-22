package www.jcoding.kr.user;

import java.util.Date;

public class User {
	int age;
	Date birth;
	String login;
	String password;
	String password_confirm;
	String username;
	String phone;
	String email;
	
	
	@Override
	public String toString() {
		return "login: " + this.login +
				"\npassword: " + this.password +
				"\nusername: " + this.username +
				"\nphone: " + this.phone +
				"\nemail: " + this.email;
	}
}
