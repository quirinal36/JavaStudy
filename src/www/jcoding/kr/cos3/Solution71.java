package www.jcoding.kr.cos3;

import java.util.Scanner;

public class Solution71 {
	public int solution(int n, int m) {
		int result = 0;
		result = func_a(m) - func_a(n-1);
		return result;
	}
	
	public int func_a(int num) {
		int sum = 0;
		
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