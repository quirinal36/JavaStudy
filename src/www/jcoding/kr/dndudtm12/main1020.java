package www.jcoding.kr.dndudtm12;
import java.util.Arrays;
//import java.util.Scanner;

public class main1020 {
	
	public static void main(String[] args) {
		/*
		// 객체를 생성한다. : Solution01 이라는 클래스 내부에 들어있는 함수를 불러서 쓸수있도록 객체를 생성
		Solution01 s01 = new Solution01();
		//사용자에게 배열을 직접 입력받는다.
		int array[] = s01.getInput();
		//인접한 두 숫자에 차를 계산하여 결과값을 리턴한다.
		int result[] = s01.solution(array);
		//결과값을 화면에 출력한다.
		System.out.println(Arrays.toString(result));
		*/
		/*
		Solution71 s02 = new Solution71();
		int input = s02.getInput();
		int sum = s02.func_a(input);
		System.out.println(sum);
		int result = s02.solution(input, sum);
		System.out.println(result);
		*/
		/*
		Solution72 s03 = new Solution72();
		int [] arr = {11,12,13,14,15,16,17,18,19,20};
		System.out.println(s03.getMax(arr));
		s03.getMin(arr);
		System.out.println(s03.getMin(arr));
		s03.solution(arr);
		System.out.println(s03.solution(arr));
		*/
		Solution73 s04 = new Solution73(); 
		int [] arr = {11,12,13,14,15,16,17,18,19,20};
		s04.getMax(arr);
		int result = s04.getMax(arr);
		System.out.println(result);
		s04.exceptMax(arr, result);
		s04.solution(arr);
		System.out.println(s04.solution(arr));
		}
}
