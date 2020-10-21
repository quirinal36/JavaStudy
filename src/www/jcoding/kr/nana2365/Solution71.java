package www.jcoding.kr.nana2365;

import java.util.Scanner;

public class Solution71 {
	public int solution(int n, int m) {
		int result = 0;
		result = func_a(m) - func_a(n-1);
		return result;
	}
	
	public int func_a(int num) {
		int sum = 0;
		int i = 0;
		
		// sum : 1 부터 num 까지의 합계
		while(i<=num) {
			sum = sum + i; 
			i++;
		}
		return sum;
	}
	
	public int getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("please input number >>");
		int input = sc.nextInt();
		
		sc.close();
		
		return input;
	}
}
