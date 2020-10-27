package www.jcoding.kr.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MemberControl {
	final static char[] NUMS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	final static char[] SIGNS = {
			'!', '@', '#', '$', 
			'%', '^', '&', '*', 
			'(', ')', '_', '=', 
			'+', '/', '<', ',', 
			'.', '>', '?', '{', 
			'}', '[', ']', '\\', 
			'|', ';', ':', '\'', 
			'\"', '`', '~'};
	final static char[] LOWERCASE = {
			'a', 'b', 'c', 'd',
			'e', 'f', 'g', 'h',
			'i', 'j', 'k', 'l',
			'm', 'n', 'o', 'p',
			'q', 'r', 's', 't',
			'u', 'v', 'w', 'x',
			'y', 'z'};
	final static char[] UPPERCASE = {
			'A', 'B', 'C', 'D',
			'E', 'F', 'G', 'H',
			'I', 'J', 'K', 'L',
			'M', 'N', 'O', 'P', 
			'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X',
			'Y', 'Z'};
	
	/**
	 * 8글자 이상의 영문자(1개이상의 대문자) 숫자, 특수문자를 조함하여 작성 되었는지 판별하는 함수
	 * 
	 * @param pwd : 판별할 입력 문자열
	 * @return 모든 조건에 맞다면 true, 그렇지 않다면 false
	 */
	public boolean isValid(String pwd) {
		boolean result = true;
		
		return result;
	}
	/**
	 * 입력된 두개의 비밀번호가 서로 같은지 판별하는 함수
	 * 
	 * @param input1 : 첫 번째 입력된 비밀번호
	 * @param input2 : 두 번째 입력된 비밀번호
	 * @return : 두 비밀번호가 동일하다면 true, 다르다면 false
	 */
	public boolean confirmPassword(String input1, String input2) {
		boolean result = true;
		// input1 과 input2가 서로 같은지 검사한다.
		// result = input1.equals(input2);
		return result;
	}
	
	/**
	 * 전화번호에서 하이픈( - )을 없애는 함수다.
	 * 
	 * @param input : 전화번호 (예: 010-1111-2222)
	 * @return 전화번호 (예: 01011112222)
	 */
	public String removeHyphen(String input) {
		String result = "";
		// 첫 번째 하이픈의 위치
		int hipenIndex01 = input.indexOf("-");
		// 두 번째 하이픈의 위치
		int hipenIndex02 = input.lastIndexOf("-");
		
		// 하이픈이 두개 다 존재한다면 하이픈을 제외한 숫자로만 문자열을 만든다.
		if(hipenIndex01 > 0 && hipenIndex02 > 0) {						// input = "010-1111-2222"; result = "";
			result = input.substring(0, hipenIndex01);					// result = "010"
			result += input.substring(hipenIndex01 + 1, hipenIndex02);	// result = "0101111"
			result += input.substring(hipenIndex02 + 1);				// result = "01011112222"
		}
		return result;
	}
	
	/**
	 * 이메일의 형식이 맞는지 확인하고, 
	 * 맞으면 true를 틀리면 false를 리턴한다.
	 * 
	 * @param input : 이메일주소
	 * @return 형식에 맞으면 true, 틀리다면 false
	 */
	public boolean isValidEmail(String input) {
		boolean result = false;
		int index01 = input.indexOf("@");		// @기호가 존재한다면 그 위치를 찾는다.
		
		int index02 = input.indexOf(".");		// naver.com 같이 도메인명이 존재하는지 찾는다.

		if(index01 > 0 && index02 > index01) {	// 도메인명이 @ 기호보다 뒤에 위치하는지 판별한다.
			result = true;
		}
		return result;
	}
	
	/**
	 * user 정보를 파일로 저장한다.
	 * 
	 * @param user : 회원가입 정보가 저당 되어있는 객체
	 */
	public void export(User user) {
		File file = new File("user.txt");
		System.out.println(file.getAbsolutePath());
		
		FileOutputStream stream = null;
		try {
			stream = new FileOutputStream(file);
			stream.write(user.toString().getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
