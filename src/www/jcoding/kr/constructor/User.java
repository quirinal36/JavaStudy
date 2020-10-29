package www.jcoding.kr.constructor;

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

	// 생성자 (1)
	public User() {
 
	}
	// 생성자 (2)
	public User(String input1) {
		// User 클래스의 login 이라는 정보가 지정된 채로 객체를 만들기 위함
		this.login = input1;
	}
	// 생성자 (3)
	public User(String input1, String input2) {
		this.login = input1;
		this.password = input2;
	}
	@Override
	public String toString() {
		return "____User 정보____\n" +
				"login: " + this.login +
				"\npassword: " + this.password +
				"\nusername: " + this.username +
				"\nphone: " + this.phone +
				"\nemail: " + this.email +
				"\n_______________";
	}
}
