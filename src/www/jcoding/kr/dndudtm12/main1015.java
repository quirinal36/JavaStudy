package www.jcoding.kr.dndudtm12;
import java.util.Arrays;
import java.util.Scanner;

public class main1015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodPractice1013 mp = new MethodPractice1013();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//mp.getInputMakeRandomArray(number);
		int [] result;
		result = mp.getInputMakeArray(number);
		//System.out.println(Arrays.toString(result));
		//mp.countDown(number);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int cnt = mp.countFilteredData(result, start, end);
		System.out.println(cnt + " 개 입니다");
		sc.close();
	}

}
