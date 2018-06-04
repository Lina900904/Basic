package step3;

import javax.swing.JOptionPane;

public class RPSGame {

	/**
	 * 가위바위보를 입력하여 승자를 화면에 출력하시오
	 * 
	 * */
	public static void main(String[] args) {
	
		while(true) {
			int a = Integer.parseInt(JOptionPane.showInputDialog("A: 바위0,가위1,보2 중 입력해봐"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("B: 바위0,가위1,보2 중 입력해봐"));
			int flag = b-a;
			switch(flag) {
			case 0:
				JOptionPane.showMessageDialog(null, "무승부");
				break;
			case 1: 
				JOptionPane.showMessageDialog(null,"A이김");
				break;
			default: 
				JOptionPane.showMessageDialog(null,"B이김");
				break;
			}
			


		}
	}

}
