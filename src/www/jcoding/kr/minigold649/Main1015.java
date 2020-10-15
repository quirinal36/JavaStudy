package www.jcoding.kr.minigold649;

import java.util.Scanner;
import java.util.Arrays;

public class Main1015 {

	public static void main(String[] args) {
		MethodPractice1013 mp = new MethodPractice1013();
		Scanner s = new Scanner(System.in);
		
		// 카운트 다운 함수
		System.out.println("카운트 다운을 시작할 숫자를 입력해주세요.");
		System.out.print("-> ");
		int ct = s.nextInt();
		mp.countDown(ct);
		
		
		// 랜덤숫자 함수
		System.out.println("1~100 까지의 숫자를 랜덤으로 말해드립니다.");
		System.out.println("몇번 할건지 숫자를 입력해주세요.");
		System.out.print("-> ");
		int ra = s.nextInt();
		int result[] = mp.getInputMakeRandomArray(ra);
		System.out.println(Arrays.toString(result));
		
		
		// ~이상 ~이하 갯수 함수
		System.out.println("숫자 몇 이상을 할지 입력해주세요.");
		System.out.print("-> ");
		int start = s.nextInt();
		System.out.println("숫자 몇 이하를 할지 입력해주세요.");
		System.out.print("-> ");
		int end = s.nextInt();
		int result2 = mp.countFilteredData(result , start , end);
		System.out.println("총 숫자 " + result.length + "개 중 " + result2 + "개가 " + start + "이상 " + end + "이하입니다.");
		System.out.println("숫자들중 " + (double)result2 / (double)result.length * 100 + "%가 " + start + "이상 " + end + "이하입니다.");
		s.close();
	}

}
