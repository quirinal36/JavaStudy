package www.jcoding.kr.method;

public class Practice implements MethodInterface{

	@Override
	public int sum(int[] arr) {
		// TODO arr 안의 모든 값들의 합계를 계산해 return 한다.
		int sum = 0;
		for(int n : arr) {
			sum += n;
		}
		return sum;
	}

	@Override
	public double average(int[] arr) {
		// TODO arr 안의 모든 값들의 평균을 계산해 return 한다.
		double avg = sum(arr) / arr.length;
		return avg;
	}

	@Override
	public int max(int[] arr) {
		// TODO arr 안의 모든 값들 중 가장 큰 값을 찾아 return 한다.
		int result = 0;
		for(int n : arr) {
			if(n > result) {
				result = n;
			}
		}
		return result;
	}

	@Override
	public int min(int[] arr) {
		// TODO arr 안의 모든 값들 중 가장 작은 값을 찾아 return 한다.
		int result = max(arr);
		for(int n : arr) {
			if(n < result) {
				result = n;
			}
		}
		return result;
	}

	@Override
	public String left(String input, int num) {
		// TODO input 의 첫 글자 부터 num 개의 글자를 return 한다.
		String result;
		result = input.substring(0, num);
		return result;
	}
	
	@Override
	public String right(String input, int num) {
		// TODO input 의 마지막 글자 부터 num 개의 글자를 return 한다.
		String result = input.substring(input.length() - num, input.length());
		return result;
	}
	
	
	@Override
	public String mid(String input, int start, int num) {
		// TODO input 의 start 번째 글자부터 num 개의 글자를 return 한다.
		return input.substring(start, start+num);
	}
	
	public static void main(String[] args) {
		// continue 와 break
		// continue : 계속하다
		// break : 멈추다
		for(int i=0; i<10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}
