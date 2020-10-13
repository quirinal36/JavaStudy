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
		double avg = 0.0;
		int sum = 0;
		for(int n : arr) {
			sum += n;
		}
			avg = sum / arr.length;
		return avg;
	}

	@Override
	public int max(int[] arr) {
		// TODO arr 안의 모든 값들 중 가장 큰 값을 찾아 return 한다.
		int max = 0;
		int n = 0;
		for(n=0; n < arr.length; n++) {
			if(arr[n]>max) {
				max = arr[n];
			}
		}

		return max;
	}

	@Override
	public int min(int[] arr) {
		// TODO arr 안의 모든 값들 중 가장 작은 값을 찾아 return 한다.
		int n = 0;
		int min = arr[n];
		for(n=0; n < arr.length; n++) {
			if(arr[n]<min) {
				min = arr[n];
			}
		}

		return min;
	}

	@Override
	public String left(String input, int num) {
		// TODO input 의 첫 글자 부터 num 개의 글자를 return 한다.
		String result = input.substring(0, num);
		return result;
	}

	@Override
	public String right(String input, int num) {
		// TODO input 의 마지막 글자 부터 num 개의 글자를 return 한다.
		String result = input.substring(input.length() - num);
		return result;
	}

	@Override
	public String mid(String input, int start, int num) {
		// TODO input 의 start 번째 글자부터 num 개의 글자를 return 한다.
		String result = input.substring(start,start + num);
		return result;
	}

	public static void main(String[] args) {
		Practice p = new Practice();

		int[] data = {50, 60, 70, 80, 90};
		String phoneNum = "010-5679-0072";

		int sumResult = p.sum(data);
		System.out.println("합계: " + sumResult);

		double avg = p.average(data);
		System.out.println("평균: " + avg);

		System.out.println("최댓값: " + p.max(data));
		System.out.println("최소값: " + p.min(data));

		String phone01 = p.left(phoneNum, 3);
		System.out.println("처음 세글자: " + phone01);

		String phone02 = p.mid(phoneNum, 4, 4);
		System.out.println("가운데 네글자: " + phone02);

		String phone03 = p.right(phoneNum, 4);
		System.out.println("마지막 네글자: " + phone03);
	}
}
