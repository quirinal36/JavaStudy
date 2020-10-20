package www.jcoding.kr.minigold649;

public class Solution74 {
	public int[] solution(int[] input) {
		int result[] = {0, 0, 0, 0, 0}; // A=0명, B=0명, C=0명, D=0명, F=0명 이기 때문에
		for(int i=0; i<input.length; i++) {
			if(input[i] >= 85) {
				result[0]++;
			}
			// TODO : 나머지 학점에 대한 처리를 해주세요.
		}
		return result;
	}
}
