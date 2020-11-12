package www.jcoding.kr.minigold649;

import java.util.Arrays;
import java.util.Scanner;
// 이진 검색 
class BinSearchTester {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;			// 검색 범위의 첫 인덱스
		int pr = n - 1;		// 검색 범위의 끝 인덱스

		do {
			int pc = (pl + pr) / 2;		// 중앙 요소의 인덱스
			if (a[pc] == key)
				return pc;				// 검색 성공!
			else if (a[pc] < key)
				pl = pc + 1;			// 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1;			// 검색 범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);

		return -1;						// 검색 실패!
	}
	static int[] insertDataSort(int start, int end) {
		int result[] = new int[end - start];
		int i=0;
		while(i < (end-start)) {
			result[i++] = i;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("--------- 이진검색입니다 ---------");
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		int[] x = insertDataSort(0, num);				// 요솟수가 num인 배열

		System.out.print("검색할 값：");		// 키값을 입력
		int ky = stdIn.nextInt();

		long curTime01 = System.currentTimeMillis();
		long start = System.nanoTime();
		System.out.println("start: " + start);
		int idx = binSearch(x, num, ky);	// 배열x에서 값이 ky인 요소를 검색
		long end = System.nanoTime();
		long curTime02 = System.currentTimeMillis();
		System.out.println("end: " + end);
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
		
		System.out.println("걸린시간 : " + ((end - start)*0.000001) +"초");
	}
}