package www.jcoding.kr.dndudtm12;
import java.util.Arrays;
import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int input = sc.nextInt();
		System.out.println("mumber");
		int sum = sc.nextInt();
		int result = s02.solution(input, sum);
		System.out.println("___출력결과___");
		System.out.println(result);
		*/
		/*
		Solution72 s03 = new Solution72();
		int [] arr = {11,12,13,14,15,16,17,18,19,20};
		System.out.println(s03.getMax(arr));
		s03.getMin(arr);
		System.out.println(s03.getMin(arr));
		s03.solution(arr);
		int result = s03.solution(arr);
		System.out.println(s03.solution(arr));
		System.out.println(Arrays.toString(s03.solution2(arr)));
		*/
		/*
		Solution73 s04 = new Solution73(); 
		int [] arr = {4,7,2,9,3};
		int result = s04.solution(arr);
		int sum = s04.getMax(arr);
		s04.exceptMax(arr, result);
		System.out.println(s04.getMax(arr));
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(s04.exceptMax(arr, sum)));
		System.out.println("___출력결과___");
		System.out.println(result);
		*/
		
		Solution74 s05 = new Solution74();
		int [] input = {86,72,98,60,45};
		int [] result = s05.solution(input);
		System.out.println("___출력결과___");
		System.out.println(Arrays.toString(result));
		
		}
		
}
