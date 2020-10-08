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
		return 0;
	}

	@Override
	public int max(int[] arr) {
		// TODO arr 안의 모든 값들 중 가장 큰 값을 찾아 return 한다.
		return 0;
	}

	@Override
	public int min(int[] arr) {
		// TODO arr 안의 모든 값들 중 가장 작은 값을 찾아 return 한다.
		return 0;
	}

	@Override
	public String left(String input, int num) {
		// TODO input 의 첫 글자 부터 num 개의 글자를 return 한다.
		return null;
	}

	@Override
	public String rignt(String input, int num) {
		// TODO input 의 마지막 글자 부터 num 개의 글자를 return 한다.
		return null;
	}

	@Override
	public String mid(String input, int start, int num) {
		// TODO input 의 start 번째 글자부터 num 개의 글자를 return 한다.
		return null;
	}
	
	public static void main(String[] args) {
		Practice p = new Practice();
		
		int[] data = {50, 60, 70, 80, 90};
		String phoneNum = "010-5679-0072";
		
		int sumResult = p.sum(data);
		System.out.println("합계: " + sumResult);
	}
}
