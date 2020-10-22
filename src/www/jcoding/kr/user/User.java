package www.jcoding.kr.user;

public class User {
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
