package www.jcoding.kr.dndudtm12;

public class Solution72 {
	public int getMax(int[] arr) {
		int result = 0;
		// TODO: 배열에 들어있는 값들 중 가장 큰 점수를 골라주세요.
		int n = 0;
		for(n=0; n < arr.length; n++) {
			if(arr[n]>result) {
				result = arr[n];
			}
		}
		return result;
	}
	
	public int getMin(int[] arr) {
		int result = 0;
		// TODO: 배열에 들어있는 값들 중 가장 작은 점수를 골라주세요.
		int n = 0;
		result = arr[n];
		for(n=0; n < arr.length; n++) {
			if(arr[n]<result) {
				result = arr[n];
			}
		}
		
		return result;
	}
	
	public int solution(int[] arr) {
		int result = 0;
		int max = getMax(arr);
		int min = getMin(arr);
		
		// TODO: 가장 높은점수(max)와 가장 낮은점수(min)을 제외한 나머지 점수들의 합을 구하세요.
		for(int n=0 ; n < arr.length; n++) {
			if(arr[n] != max && arr[n] != min) {
				result += arr[n];
			}
		}

		return result;
	}
	public int[] solution2(int[] arr) {
		int []result = new int[arr.length-2];
		int max = getMax(arr);
		int min = getMin(arr);
		int i = 0;
		// TODO: 가장 높은점수(max)와 가장 낮은점수(min)을 제외한 나머지 점수들의 합을 구하세요.
		for(int n=0 ; n < arr.length; n++) {
			if(arr[n] != max && arr[n] != min) {
				result[i++] = arr[n];
			}
		}

		return result;
	}
}
