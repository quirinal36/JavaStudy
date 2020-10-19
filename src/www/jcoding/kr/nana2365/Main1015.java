package www.jcoding.kr.nana2365;

import java.util.Arrays;
import java.util.Scanner;

public class Main1015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodPractice1013 mp = new MethodPractice1013(); //생성자. 함수와 달리 new가 붙는다
		
		/* mp.printString("자바재밌다", 5);
		
		mp.printNumbers(10, false);
	
		//실습1
		mp.countDown(10); //함수호출
		
		
				/*   Scanner sc = new Scanner(System.in);
				   	 int number = sc.nextInt();
					 mp.countDown(number);
					
					 sc.close();  와 같다 */ 
		
		
		System.out.println("실습2 While문 시작. 숫자 입력");

		
		//실습2 while문
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// 1. 정수형 배열을 만든다.
		int [] result;
		
		// 2. 함수를 이용해 랜덤숫자가 저장된 배열을 돌려받는다.
		result = mp.getInputMakeArray(number);
		
		// 3. 정수형 배열을 출력한다.
		System.out.println(Arrays.toString(result));
		
		System.out.println("실습2 for문 시작. 숫자 입력");
		
		//실습 2 for문
		number = sc.nextInt();
		//[] result;
		result = mp.getInputMakeRandomArray(number);
		System.out.println(Arrays.toString(result));
		
		System.out.println("실습3 시작"); 
		
		//실습 3
		//1. start 값을 입력 받는다.
		int start = sc.nextInt();
		
		//2. end 값을 입력 받는다.
		int end = sc.nextInt();
		
		//3. result 배열안에 start 이상 end 이하의 값이 몇개 인지 알려주는 함수를 실행한다.
		int cnt = mp.countFilteredData(result, start, end);
		System.out.println(cnt + "개 입니다.");
		
		//test
	
		
		
		
		
		sc.close();

	}

}
