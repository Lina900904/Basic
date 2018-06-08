package step5;

import javax.swing.JOptionPane;

enum Butt {
	EXIT, INPUT, LIST
}

public class Salary {

	public static void main(String[] args) {

		String[][] mtx = new String[5][5];
		String[] d = new String[5];
		String[] n = new String[5];
		int[] s = new int[5];
		int[] b = new int[5];
		int[] sum = new int[5];

		Butt[] buttons = { Butt.EXIT, Butt.INPUT, Butt.LIST };
		
		String[] arr = { "부서", "성명", "본봉", "수당", "합계" };
		while (true) {

			Butt select = (Butt) JOptionPane.showInputDialog(null, // frame)
					"부서별 합계", // frame title
					"기능을 선택하세요", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // array of choices
					buttons[1]// default
			);
			switch (select) {

			case EXIT:
				return;
			case INPUT:

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 5; j++) {
						if (j == 4) {
							mtx[i][j] = String.valueOf(Integer.parseInt(mtx[i][2]) + Integer.parseInt(mtx[i][3]));

						} else {
							mtx[i][j] = JOptionPane.showInputDialog(arr[j]);

						}
					}

				}

				break;
			case LIST:
				String result = " 부서  성명  본봉 수당 합계 \n";

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 5; j++) {
						result += mtx[i][j] + " ";

					}
					result += "\n";
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			default:
				return;

			}

		}

	}
}
