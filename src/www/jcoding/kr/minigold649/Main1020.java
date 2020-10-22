package www.jcoding.kr.minigold649;

import java.util.Arrays;

public class Main1020 {

	public static void main(String[] args) {
		// 객체를 생성한다 : Solution01 이라는 클래스 내부에 들어있는 함수를 불러서 쓸 수 있도록 객체 생성
	/*	Solution01 s01 = new Solution01();
		
		
		// 사용자에게 배열을 직접 입력 받는다.
		int array[] = s01.getInput();
		
		
		// 인접한 두 숫자의 차를 계산하여 결과값을 리턴한다.
		int result[] = s01.solution(array);
		
		
		// 결과값을 화면에 출력한다.
		System.out.println(Arrays.toString(result)); */
		
		// Solution71
	/*	Solution71 s71 = new Solution71();
		
		int n = s71.getInput();
		int m = s71.getInput();
		
		int nm = s71.solution(n , m);
		System.out.println(n + "부터 " + m + "까지의 합은 " + nm + "입니다."); */
		
		// Solution72
	/*	Solution72 s72 = new Solution72();
		
		int n[] = {50 , 23 , 80 , 92 , 30};
		int n2 = s72.solution(n);
		
		int max = s72.getMax(n);
		int min = s72.getMin(n);
		
		System.out.println(Arrays.toString(n));
		System.out.println("제일 낮은 점수는 " + min + "이고 제일 큰 점수는 " + max + "이다.");
		System.out.println("모든 점수의 합에서 제일 큰 점수와 작은 점수를 빼면 " + n2 + "이다."); */
		
		// Solution73
	/*	Solution73 s73 = new Solution73();
		
		int vi[] = {235 , 134 , 80 , 392 , 140};
		int vi2 = s73.solution(vi);
		
		System.out.println(Arrays.toString(vi));
		System.out.println(vi2); */ 
		
		// Solution74
		Solution74 s74 = new Solution74();
		
		int scores[] = {64 , 35 , 27 , 95 , 32};
		int abcdf[] = s74.solution(scores);
		
		System.out.println("A B C D F");
		System.out.println(Arrays.toString(abcdf)); 
	}

}
