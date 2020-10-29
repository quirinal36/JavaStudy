package www.jcoding.kr.constructor;

public class Main1029 {

	public static void main(String[] args) {
		// 1. 생성자 1을 이용해 객체를 만든다.
		User user = new User();
		user.login = "leehg";
		user.password = "1111";
		System.out.println(user.toString());
		
		// 2. 생성자2를 이용해 객체를 만든다.
		String login = "leehg";
		User user2 = new User(login);
		user2.password = "1111";
		System.out.println(user2.toString());
		
		// 3. 생성자3을 이용해 객체를 만든다.
		String password = "1111";
		User user3 = new User(login, password);
		System.out.println(user3.toString());
		
	}

}
