package www.jcoding.kr.dndudtm12;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

import www.jcoding.kr.method2.MethodPracticeInterface;

public class MethodPractice1013 implements MethodPracticeInterface{

	/**
	 * "자바 재밌다"가 몇 번 출력될까요?
	 * 
	 * str : 출력할 문구
	 * number : 몇 번 출력 할것인가?
	 */
	@Override
	public void printString(String str, int number) {
		for(int i=0; i<number; i++) {
			System.out.println(str);
		}
	}

	/**
	 * number 까지 올라가면서
	 * 짝수 또는 홀수만 출력하는 프로그램
	 * 
	 * number : 몇 번 출력 할것인가?
	 * isEven : true 일 때 짝수만 출력, false 일 때 홀수만 출력 
	 */
	@Override
	public void printNumbers(int number, boolean isEven) {
		for(int i=0; i<number; i++) {
			if((i % 2 == 0) == isEven){
				System.out.println(i);
			}
		}
	}

	/**
	 * 실습 1
	 * 카운트다운을 출력하는 프로그램
	 * count 부터 0 까지 출력하는 함수다.
	 * 
	 * count : 카운트다운이 시작되는 숫자
	 */
	@Override
	public void countDown(int num) {
		// TODO: ? 에 알맞은 숫자 또는 변수를 입력해 함수를 완성 해주세요.
		int i = 0;
		for(i = 0; i>=num ; i--) {
			System.out.println(i);
		}
	}

	/**
	 * number 숫자만큼 크기의 정수형 배열을 만들고,
	 * 배열 안에 1~100 사이의 랜덤 숫자를 만들어 넣는 함수
	 * 
	 * @param number : 만들어질 배열의 크기
	 * @return 정수형 배열
	 */
	@Override
	public int[] getInputMakeArray(int number) {
		Random random = new Random();
		int[] array = new int[number];
		while(number > 0) {
//			배열의 가장 마지막 요소부터 차례차례 숫자를 입력한다.
//			random.nextInt( 숫자 ) => 숫자 만큼 범위 안에서 랜덤 숫자를 만든다.
//			예를들어 숫자가 100 이라면 0 ~ 99 까지의 범위 내에서 랜덤 숫자를 만든다.
			array[--number] = random.nextInt(100) + 1;
			
//			System.out.println("number: " + number);
//			System.out.println("array["+number+"] : " + array[number]);
		}
		return array;
	}
	
	/**
	 * 실습 2
	 * 
	 * number 숫자만큼 크기의 정수형 배열을 만들고,
	 * 배열 안에 1~100 사이의 랜덤 숫자를 만들어 넣는 함수
	 * 
	 * @param number : 만들어질 배열의 크기
	 * @return 정수형 배열
	 */
	@Override
	public int[] getInputMakeRandomArray(int number) {
		// TODO for문을 활용하여 getInputMakeArray 과 같은 역할을 하는 함수를 만들어 봅니다.
		return null;
	}

	/**
	 * 실습 3
	 * 
	 * 배열 data 에는 여러개의 숫자값들이 들어 있습니다.
	 * 이 데이터 내에서 ~이상 ~이하의 값이 몇 개 있는지 셈을 한뒤 return 한다.
	 * 
	 * @param start 
	 * @param end
	 * @return 정수
	 */
	@Override
	public int countFilteredData(int []data, int start, int end) {
		// TODO 배열에서 ~이상 ~이하의 값이 몇개 있는지 세는 함수를 완성 해주세요.
		int count = 0;
		
		return count;
	}
	
	/**
	 * 실습 4
	 * 
	 * @param array : 합계를 계산할 숫자들이 들어있는 정수형 배열
	 * @return 배열의 합계
	 */
	@Override
	public int sumOfArray(int[] array) {
		// TODO 반복문을 활용해 배열의 합계를 구합니다.
		return 0;
	}

	/**
	 * 실습 5
	 * 
	 * @param array : 평균을 계산할 숫자들이 들어있는 정수형 배열
	 * @return 배열의 평균
	 */
	@Override
	public double averageOfArray(int[] array) {
		// TODO sumOfArray 함수를 활용해 평균을 구합니다.
		return ? / (double)array.length;
	}

	/**
	 * 실습 6
	 * 
	 * @param level : 몇 층의 계단을 만들것인지 입력을 받는다.
	 * 예: level 이 5 일때
	  *
	  **
	  ***
	  ****
	  *****
	 * 
	 */
	@Override
	public void makePyramid(int level) {
		// TODO : 아래 코드를 완성하여 위와같은 모양이 나오도록 메소드를 완성하세요.
		for(int i=0; i<level; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 실습 7
	 * 
	 * number에 해당하는 구구단을 출력 해주세요.
	 * @param number : 구구단을 출력하고싶은 숫자.
	 */
	@Override
	public void guguDan(int number) {
		// TODO number에 해당하는 구구단을 출력하는 함수를 완성하세요.
		
	}

	/**
	 * 실습 8
	 * 
	 * 배열에서 일정한 데이터 이상의 값만 괄호값으로 표시되도록
	 * 반복문을 활용해 함수를 완성하세요.
	 * 
	 * 예) array 에 {79, 81, 56, 99, 63}
	 *    cutLIne 이 80이라면
	 *    출력은 아래와 같다.
	 *    79
	 *    (81)
	 *    56
	 *    (99)
	 *    63
	 */
	@Override
	public void filterData(int[] array, int cutLine) {
		// TODO: 함수를 완성 해주세요.
	}
}
