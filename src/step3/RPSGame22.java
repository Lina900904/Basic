package step3;

import javax.swing.JOptionPane;

public class RPSGame22 {

	/**
	 * 가위바위보를 입력하여 승자를 화면에 출력하시오
	 * 
	 */
	public static void main(String[] args) {
		int brank = 0;
		int g = 0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("몇 판?"));

		while (true) {

			int a = (int) (Math.random() * 10);
			if (a >= 0 && a <= 2) {
				int b = Integer.parseInt(JOptionPane.showInputDialog("B: 바위0,가위1,보2 중 입력해봐"));
				int flag = b - a;
				switch (flag) {
				case 0:
					JOptionPane.showMessageDialog(null, "무승부");
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "A이김");
					break;
				default:
					JOptionPane.showMessageDialog(null, "B이김");
					brank++;
					break;
				}
				g++;
			}

			if (g == num) {
				JOptionPane.showMessageDialog(null, "B:" + num + "판" + brank + "승");
				break;
			}

		}

	}
}
