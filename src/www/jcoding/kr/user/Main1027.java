package www.jcoding.kr.user;

import java.util.Scanner;

public class Main1027 {

	public static void main(String[] args) {
		User user = new User();
		MemberControl control = new MemberControl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--- 회원가입 ---");
		System.out.print("아이디:");
		user.login = sc.next();
		
		boolean confirm = false;
		boolean isValid = false;
		
		while(confirm == false || isValid == false) {
			System.out.println("(8글자 이상의 영문자(1개이상의 대문자) 숫자, 특수문자를 조함하여 작성 해주세요.");
			System.out.print("비밀번호:");
			user.password = sc.next();
			System.out.print("비밀번호 확인:");
			user.password_confirm = sc.next();
			confirm = control.confirmPassword(user.password, user.password_confirm);
			isValid = control.isValid(user.password);
			
			if(confirm == false) {
				System.out.println("입력된 비밀번호가 일치하지 않습니다. 다시 입력 해주세요.");
			}else if(isValid == false) {
				System.out.println("사용할수 없는 비밀번호입니다.");
			}
		}
		System.out.print("이름:");
		user.username = sc.next();
		
		System.out.print("휴대전화:");
		boolean validPhone = false;
		while(validPhone == false) {
			user.phone = sc.next();
			if(user.phone.contains("-")) {
				user.phone = control.removeHyphen(user.phone);
			}
			if(user.phone.length() < 10) {
				System.out.println("잘못된 형식의 전화번호를 입력 하셨습니다. 다시 입력 해주세요.");
			}else {
				validPhone = true;
			}
		}
		
		boolean validEmail = false;
		while(validEmail == false) {
			System.out.print("이메일:");
			user.email = sc.next();
			validEmail = control.isValidEmail(user.email);
			if(validEmail == false) {
				System.out.println("잘못된 이메일 주소를 입력했습니다. 다시 업력 해주세요.");
			}
		}
		
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println("아래 정보가 맞는지 확인하세요.");
		System.out.println(user.toString());
//		control.export(user);
		sc.close();
	}

}
