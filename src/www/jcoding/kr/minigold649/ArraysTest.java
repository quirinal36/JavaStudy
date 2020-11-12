package www.jcoding.kr.minigold649;

import java.util.Arrays;
import java.util.List;

public class ArraysTest {
	
	public static void main(String[] args) {
		
		int iarray[] = {50, 40, 30, 20, 10};
		String sarray[] = new String[5];
		
		System.out.println(Arrays.toString(iarray));
		Arrays.sort(iarray);
		System.out.println(Arrays.toString(iarray));
		
		Arrays.fill(sarray, "HI!!");
		System.out.println(Arrays.toString(sarray));
		
		List<String> City = Arrays.asList("a","b");
		for (int i = 0 ; i < City.size() ; i++) {
			System.out.println(City.get(i));
		}
	}

}
