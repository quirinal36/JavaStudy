package www.jcoding.kr.minigold649;

import java.util.Arrays;

public class Main1020 {

	public static void main(String[] args) {
		// 객체를 생성한다 : Solution01 이라는 클래스 내부에 들어있는 함수를 불러서 쓸 수 있도록 객체 생성
		Solution01 s01 = new Solution01();
		
		
		// 사용자에게 배열을 직접 입력 받는다.
		int array[] = s01.getInput();
		
		
		// 인접한 두 숫자의 차를 계산하여 결과값을 리턴한다.
		int result[] = s01.solution(array);
		
		
		// 결과값을 화면에 출력한다.
		System.out.println(Arrays.toString(result));
	}

}
