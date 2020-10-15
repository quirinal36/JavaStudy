package www.jcoding.kr.method2;

import javax.swing.JOptionPane;

public class Main1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodPractice1013 mp = new MethodPractice1013();
		String input = JOptionPane.showInputDialog("숫자를 입력하세요.");
		int num = Integer.parseInt(input);
		mp.printNumbers(num,false);
		//mp.makePyramid(num);
	}

}
