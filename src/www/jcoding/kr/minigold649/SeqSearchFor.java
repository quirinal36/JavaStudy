package www.jcoding.kr.minigold649;

import java.util.Scanner;
// 선형 검색 (for문)

class SeqSearchFor {
	// 배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색 
	static int seqSearch(int[] a, int n, int key) {
		for (int i = 0 ; i < n; i++) {
			if (key == a[i]) {
				return i;
			}
		}
		return -1;					// 검색 실패!(-1을 반환)
	}
	
	/**
	 * 연습문제 Q3
	 * 
	 * @param a
	 * @param n
	 * @param key
	 * @param idx
	 * @return
	 */
	static int searchIdx(int[]a, int n, int key, int[] idx) {
		// TODO: Q3 연습문제를 구현 합니다.
		int count = 0;
		for (int i = 0 ; i < n ; i++) {
			if (a[i] == key) {
				idx[count] = i;
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int arr[] = {1 , 9 , 2 , 9 , 4 , 6 , 7 , 9};
		System.out.println("찾고싶은 숫자");
		System.out.print("-> ");
		int key = stdIn.nextInt();
		int count = searchIdx(arr , arr.length , key , new int[arr.length]);
		System.out.println(key + "의 갯수는 " + count);

/*		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		int[] x = new int[num];					// 요솟수 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.print("찾는 값：");				// 킷값을 읽어 들임
		int ky = stdIn.nextInt();

		int idx = seqSearch(x, num, ky);		// 배열x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	*/	
	}
}