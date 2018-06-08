package example;

import javax.swing.JOptionPane;

public class Test1 {

	public static void main(String[] args) {
		int[][] mtx = new int[3][6];
		String[] name = new String[1];
		int[] num = new int[3];
		String[] sum = new String[1];
		String result = "";
		int qs = Integer.parseInt(JOptionPane.showInputDialog("1. 종료 2.입력 3.결과보기"));

		while (true) {
			switch (qs) {
			case 1:
				return;
			case 2:
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 6; j++) {
						if(i<3) {
							String n = JOptionPane.showInputDialog("이름/첫번째/두번째/세번째/네번째");
							String[] arr = n.split("/");
							mtx[i][j] = Integer.parseInt(arr[j]);
							
						}else {
							String n = JOptionPane.showInputDialog("이름/첫번째/두번째/세번째/네번째");
							String[] arr = n.split("/");
							sum[0] = arr[1] + arr[2] + arr[3] + arr[4];
						}
						
					}
				
				}

				break;

			default:
				result = "이름|숫자1|숫자2|숫자3|숫자4|합계\n";

				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 6; j++) {
						mtx[i][5] = Integer.parseInt(sum[0]);
						result += mtx[i][j];

						JOptionPane.showMessageDialog(null, result);
					}
				}
				break;

			}
			JOptionPane.showMessageDialog(null," ");
		}
		
	

	}

}
