package step3;

import javax.swing.JOptionPane;

public class Calc4 {
	public static void main(String[] args) {

		int result1 = 0;
	
		while (true) {
			String num1 = JOptionPane.showInputDialog("첫번째숫자");
			switch (JOptionPane.showInputDialog("연산자입력")) {
			case "=":
				JOptionPane.showMessageDialog(null, "");
				break;
			case "+":
				String num2 = JOptionPane.showInputDialog("두번째 숫자");
				result1 = Integer.parseInt(num2);
				String result2 = "+"+result1;
				break;
			
			default:
				break;
			}

		}
	}
}