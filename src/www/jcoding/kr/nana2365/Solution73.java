package www.jcoding.kr.nana2365;

import java.util.Arrays;

public class Solution73 {
	public int solution(int[] arr) {
		int result = 0;
		
		int max = getMax(arr);
		System.out.println("max:" +max);
		int []arr2 = exceptMax(arr, max);
		System.out.println(Arrays.toString(arr2));
		int second = getMax(arr2);
		System.out.println("second:"+second);
		result = sub(max, second);
		
		return result;
	}
	
	public int getMax(int[] arr) {
		int result = 0;
		// TODO : 전달받은 배열에서 가장 큰 수를 찾습니다.
		
		for(int i=0; i<arr.length; i++){
		    if(arr[i] > result){
		       result = arr[i];
		      }
		   }
		return result;
	}
	
	public int[] exceptMax(int[] arr, int maxValue) {
		int[] result = new int[arr.length-1];
		// TODO : result 배열을 가장 큰 값(maxValue)를 제외한 배열로 만들어 주세요.
		int i = 0;
		for(int j =0; j<arr.length; j++) {
			if(arr[j] < maxValue) {
				System.out.println(arr[j]);
				result[ i ] = arr[j];
				i=i+1;
			}
		}
		
		return result;
	}
	/*
	  
	 */
	
	public int sub(int first, int second) {
		return first - second;
	}
}
