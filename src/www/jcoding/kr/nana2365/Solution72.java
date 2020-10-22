package www.jcoding.kr.nana2365;

public class Solution72 {
	public int getMax(int[] arr) {
		int result = 0;
				
		// TODO: 배열에 들어있는 값들 중 가장 큰 점수를 골라주세요.

		for(int i=0; i<arr.length; i++){
		    if(arr[i] > result){
		       result = arr[i];
		      }
		   }
		return result;
	}
	
	public int getMin(int[] arr) {
		int result =getMax(arr);
		// TODO: 배열에 들어있는 값들 중 가장 작은 점수를 골라주세요.
		
		for(int i=0; i<arr.length; i++){
		    if(arr[i] < result){
		       result = arr[i];
		      }
		   }
		return result;
	}
	
	public int solution(int[] arr) {
		int result = 0;
		int max = getMax(arr);
		int min = getMin(arr);
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	
		// TODO: 가장 높은점수(max)와 가장 낮은점수(min)을 제외한 나머지 점수들의 합을 구하세요.
	
		for(int i =0; i<arr.length; i++) {
			if(arr[i]<max && arr[i]>min) {
				result = result + arr[i];
			}
		}
		return result;
	}
}
