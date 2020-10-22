package www.jcoding.kr.minigold649;

import java.util.Arrays;

public class Solution73 {
	public int solution(int[] arr) {
		int result = 0;
		
		int max = getMax(arr);
		int arr2[] = exceptMax(arr, max);
		int second = getMax(arr2);
		result = sub(max, second);
		
		return result;
	}
	
	public int getMax(int[] arr) {
		int result = 0;
		// TODO : 전달받은 배열에서 가장 큰 수를 찾습니다.
		for (int i = 0 ; i < arr.length ; i++) {
			if (result < arr[i]) {
				result = arr[i];
			}
		}
		
		//System.out.println(result);
		return result;
	}
	
	public int[] exceptMax(int[] arr, int maxValue) {
		int[] result = new int[arr.length-1];
		// TODO : result 배열을 가장 큰 값(maxValue)를 제외한 배열로 만들어 주세요.
		int i2 = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			
			if (arr[i] < maxValue) {
				result[i2] = arr[i];
				i2++;
			}
		}
		
		//System.out.println(Arrays.toString(result));
		return result;
	}
	
	public int sub(int first, int second) {
		return first - second;
	}
}
