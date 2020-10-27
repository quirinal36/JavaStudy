package www.jcoding.kr.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// 선형 검색
class SeqSearchTester {
	// 배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색 
	static int seqSearch(Integer[] a, int n, int key) {
		int i = 0;

		while (true) {
			if (i == n)
				return -1;		// 검색 실패!(-1을 반환)
			if (a[i] == key)
				return i;		// 검색 성공!(인덱스를 반환)
			i++;
		}
	}
	static Integer[] insertData(int start, int end) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		
		final int size = end - start;
		List<Integer> result = new ArrayList<Integer>();
		
		while(result.size() < size) {
			int next = start + rand.nextInt(size);
			if(result.contains(next))continue;
			result.add(next);
		}
		
		return result.toArray(new Integer[size]);
	}
	public static void main(String[] args) {
		System.out.println("--------- 순차검색입니다 ---------");
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		Integer[] x = insertData(0, num);		// 요솟수가 num인 배열
		
		/*
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}
		 */
		
		System.out.print("검색할 값：");		// 키 값을 입력
		int ky = stdIn.nextInt();

		long start = System.nanoTime();
		int idx = seqSearch(x, num, ky);	// 배열x에서 키 값이 ky인 요소를 검색
		long end = System.nanoTime();
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
		
		System.out.println("걸린시간 : " + ((end - start)*0.000001) +"초");
	}
}
