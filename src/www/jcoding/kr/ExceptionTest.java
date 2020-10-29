package www.jcoding.kr;

public class ExceptionTest {

	public static void main(String[] args) {
		// try ~ catch 문법이 없을 경우
		/*
		int [] arr = new int[5];
		for(int i=0; i<=5; i++) {
			arr[i] = i+1;
		}
		*/
		
		// try ~ catch 문법을 활용 할경우 - 1 
		int [] arr2 = new int[5];
		for(int i=0; i<=5; i++) {
			try {
				System.out.println("값을 입력하는 중입니다...");
				arr2[i] = i+1;
				System.out.println("arr2[" + i +"] = " + arr2[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("잠시만요~! 배열의 길이를 벗어난 접근입니다.");
			}
		}
		
		// try ~ catch 문법 활용하기 - 2
		int [] arr3 = new int[5];
		try {
			for(int i=0; i<=5; i++) {
				System.out.println("값을 입력하는 중입니다...");
				arr3[i] = i+1;
				System.out.println("arr3[" + i +"] = " + arr3[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잠시만요~! 배열의 길이를 벗어난 접근입니다.");
		}
	}

}
