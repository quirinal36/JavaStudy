package www.jcoding.kr.nana2365;

import java.util.Scanner;

public class Main1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodPractice1013 mp = new MethodPractice1013();
		
		

				//실습 4
				
				System.out.println("실습4 시작"); 
						
				//배열을 하나 생성		
				int[] array0 = {10, 20, 30, 40, 50};
				
				int arrSum = mp.sumOfArray(array0);
				System.out.println(arrSum);
		
				//실습 5
				double arrAvg = mp.averageOfArray(array0);
				System.out.println(arrAvg);
				
				
				//실습6
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자입력");				
				int level = sc.nextInt();
				
				mp.makePyramid(level);
		
				//실습 7
				

		
		
		sc.close();
		
	}

}
