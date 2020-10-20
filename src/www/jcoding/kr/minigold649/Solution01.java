package www.jcoding.kr.minigold649;

import javax.swing.JOptionPane;
import java.util.*;

public class Solution01 {
	
	public int[] solution(int[] input) {
		int[] result = new int[input.length - 1];
		for (int i = 0 ; i < input.length - 1 ; i++) {
			result[i] = input[i] - input[i + 1];
		}
		return result;
	}
	
	public int[] getInput() {
		// 다이얼로그를 띄워 입력받는다.
		String numberStr = JOptionPane.showInputDialog("숫자를 몇 개 입력하시겠습니까?");
		int number = Integer.parseInt(numberStr);
		int arr[] = new int[number];
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(number > 0) {
			number--;
			System.out.print("please input>>");
			int inputNum = sc.nextInt();
			arr[i++] = inputNum;
		}
		
		sc.close();
		
		return arr;
	}
}
