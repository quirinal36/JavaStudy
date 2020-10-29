package www.jcoding.kr.minigold649;

import java.util.Arrays;
import java.util.Scanner;

// 이진 검색 
class BinSearch {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;			// 검색 범위의 첫 인덱스
		int pr = n - 1;		// 검색 범위의 끝 인덱스

		while (pl <= pr) {
			int pc = (pl + pr) / 2;		// 중앙 요소의 인덱스
			if (a[pc] == key)
				return pc;				// 검색 성공!
			else if (a[pc] < key)
				pl = pc + 1;			// 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1;			// 검색 범위를 앞쪽 절반으로 좁힘
		} 

		return -1;						// 검색 실패!
	}
	/**
	 * 연습문제 Q5
	 * 
	 * @param a
	 * @param n
	 * @param key
	 * @return
	 */
	static int binSearchX(int[] a, int n, int key) {
		int index = 0;
		// TODO: 연습문제 Q5 구현부
		// 1. binSearch 메소드를 활용해 찾는 값이 몇 번째에 있는지 구하여 index 변수에 저장한다.
		// 2. 배열 a에서  index 앞번호의 값이 key와 같은지 확인하고, 같다면 index 값을 -1만큼 수정한다.
		// 2-1. 2번 단계를 a[index]와 key값이 서로 같지 않을 때까지 반복한다.
		index = binSearch(a , n , key);
		if (index != -1) {
		for (int i = index ;  ; i--) {
			if (a[i -1] == key) {
				index--;
			} else {
				break;
			}
		}
		return index;
		} else {
			return -1;
		}
				
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int arr[] = {1 , 3 , 5 , 7 , 7 , 7 , 7 , 8 , 8 , 9 , 9};
		System.out.print("숫자 -> ");
		int key = stdIn.nextInt();
		int idx = binSearchX(arr , arr.length , key);
		if (idx != -1) {
		System.out.println(key + "의 처음 idx : " + idx);
		} else {
			System.out.println("해당 값이 없습니다.");
		}
/*		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		int[] x = new int[num];				// 요솟수가 num인 배열

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]：");			// 첫 요소 입력
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			while(x[i] < x[i-1]) {
				System.out.print("x[" + i + "]：");
				x[i] = stdIn.nextInt();
			} // 바로 앞의 요소보다 작으면 다시 입력
		}

		System.out.println(Arrays.toString(x));
		System.out.print("검색할 값：");		// 키값을 입력
		int ky = stdIn.nextInt();

		int idx = binSearch(x, num, ky);	// 배열x에서 값이 ky인 요소를 검색

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
		} */
	}
}