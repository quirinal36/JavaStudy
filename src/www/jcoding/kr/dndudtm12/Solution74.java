package www.jcoding.kr.dndudtm12;
public class Solution74 {
	public int[] solution(int[] input) {
		int result[] = {0, 0, 0, 0, 0}; // A=0명, B=0명, C=0명, D=0명, F=0명 이기 때문에
		for(int i=0; i<input.length; i++) {
			if(input[i] >= 85) {
				result[0]++;
			}
			if(input[i] >= 70 && input[i] <= 84) {
				result[1]++;
			}
			if(input[i] >= 55 && input[i] <= 69) {
				result[2]++;
			}
			if(input[i] >= 40 && input[i] <= 54){
				result[3]++;
			}
			if(input[i] < 40) {
				result[4]++;
			}
			// TODO : 나머지 학점에 대한 처리를 해주세요.
		}
		return result;
	}
}
