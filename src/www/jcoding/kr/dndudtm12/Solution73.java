package www.jcoding.kr.dndudtm12;

public class Solution73 {
	public int solution(int[] arr) {
		int result = 0;
		
		int max = getMax(arr);
		int []arr2 = exceptMax(arr, max);
		int second = getMax(arr2);
		result = sub(max, second);
		
		return result;
	}
	
	public int getMax(int[] arr) {
		int result = 0;
		// TODO : 전달받은 배열에서 가장 큰 수를 찾습니다.
		int n = 0;
		for(n=0; n < arr.length; n++) {
			if(arr[n] > result) {
				result = arr[n];
			}
		}
		return result;
	}
	
	public int[] exceptMax(int[] arr, int maxValue) {
		int[] result = new int[arr.length-1];
		// TODO : result 배열을 가장 큰 값(maxValue)를 제외한 배열로 만들어 주세요.
		int i = 0;
		for(int n = 0;n < arr.length; n++) {
			if(arr[n] != maxValue) {
				result[i++] = arr[n];
			}
		}
		return result;
	}
	
	public int sub(int first, int second) {
		return first - second;
	}
}
