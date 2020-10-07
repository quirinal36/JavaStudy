package www.jcoding.kr;

import java.util.Arrays;
import java.util.Scanner;

import www.jcoding.kr.cos3.Solution01;
import www.jcoding.kr.cos3.Solution71;
import www.jcoding.kr.cos3.Solution72;
import www.jcoding.kr.cos3.Solution73;
import www.jcoding.kr.cos3.Solution74;

public class MainClass {

	public static void main(String[] args) {
		/* Solution01 : 인접한 배열의 차 구하기 */
		/*
		Solution01 sol = new Solution01();
		int arr[] = sol.getInput();
		int result[] = sol.solution(arr);
		
		System.out.println("_____출력 결과_____");
		for(int item : result) {
			System.out.println(item);
		}
		*/
		
		/* Solution71 N 부터 M까지의 합 */
		/*
		Solution71 sol71 = new Solution71();
		Scanner sc = new Scanner(System.in);
		System.out.print("please input number >>");
		int m = sc.nextInt();
		System.out.print("please input number >>");
		int n = sc.nextInt();
		int result = sol71.solution(m, n);
		System.out.println("_____출력 결과_____");
		System.out.println(result);
		sc.close();
		*/
		
		/* Solution72 총점 */
		/*
		Solution72 sol72 = new Solution72();
		int n[] = {50, 35, 78, 91, 85};
		int result = sol72.solution(n);
		System.out.println("_____출력 결과_____");
		System.out.println(result);
		*/
		
		/* Solution73 공항방문객 */
		/*
		Solution73 sol = new Solution73();
		int n[] = {4, 7, 2, 9, 3};
		int result = sol.solution(n);
		System.out.println("_____출력 결과_____");
		System.out.println(result);
		*/
		
		/* Solution74 학점 계산 */
		Solution74 sol = new Solution74();
		int[] scores = {86, 72, 98, 60, 45};
		int[] result = sol.solution(scores);
		System.out.println("_____출력 결과_____");
		System.out.println(Arrays.toString(result));
	}

}
