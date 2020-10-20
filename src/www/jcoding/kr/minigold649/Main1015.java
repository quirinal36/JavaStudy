package www.jcoding.kr.minigold649;

import java.util.Scanner;
import java.util.Arrays;

public class Main1015 {

	public static void main(String[] args) {
		MethodPractice1013 mp = new MethodPractice1013();
		Scanner s = new Scanner(System.in);
		
		// 카운트 다운
		System.out.println("카운트 다운을 시작할 숫자를 입력해주세요.");
		System.out.print("-> ");
		int ct = s.nextInt();
		mp.countDown(ct);
		
		
		// 랜덤숫자
		System.out.println();
		System.out.println("1~100 까지의 숫자를 랜덤으로 말해드립니다.");
		System.out.println("몇번 할건지 숫자를 입력해주세요.");
		System.out.print("-> ");
		int ra = s.nextInt();
		int result[] = mp.getInputMakeArray(ra);
		System.out.println(Arrays.toString(result));
		
		
		// ~이상 ~이하 갯수
		System.out.println("숫자 몇 이상을 할지 입력해주세요.");
		System.out.print("-> ");
		int start = s.nextInt();
		System.out.println("숫자 몇 이하를 할지 입력해주세요.");
		System.out.print("-> ");
		int end = s.nextInt();
		int result2 = mp.countFilteredData(result , start , end);
		System.out.println("총 숫자 " + result.length + "개 중 " + result2 + "개가 " + start + "이상 " + end + "이하입니다.");
		System.out.println("숫자들중 " + (double)result2 / (double)result.length * 100 + "%가 " + start + "이상 " + end + "이하입니다.");
		
		
		// 배열의 합계
		int plus = mp.sumOfArray(result);
		System.out.println();
		System.out.println(Arrays.toString(result) + " <- 숫자들에 합은 " + plus + "입니다.");
		
		
		// 배열의 평균
		double avg = mp.averageOfArray(result);
		System.out.println();
		System.out.println(Arrays.toString(result) + " <- 숫자들의 평균은 " + avg + "입니다.");
		
		
		// 계단 갯수
		System.out.println();
		System.out.println("계단 몇개를 만드실건가요?");
		System.out.print("-> ");
		int st = s.nextInt();
		System.out.println();
		mp.makePyramid(st);
		
		
		// 구구단
		System.out.println();
		System.out.println("구구단 몇단을 하고싶으신가요?");
		System.out.print("-> ");
		int g = s.nextInt();
		System.out.println();
		mp.guguDan(g);
		
		
		// 일정값 표시
		System.out.println(Arrays.toString(result));
		System.out.println("이 숫자들 중 몇 이상을 괄호치게 나타내겠습니까?");
		int cut = s.nextInt();
		System.out.println();
		mp.filterData(result , cut);
		
		s.close();
	}

}
