package step4;

public class Triangle {

	public static void main(String[] args) {
		int[][] mtx = new int[7][4];
		int k = 0;
		int a =3;
		int b =4;

		for (int i = 0; i < 4; i++) {
			if(i<1) {
				a++;
				b--;		
			}else {
				a--;
				b++;
			}
			for (int j =a-1 ; j <= b; j++) {
				k++;
				mtx[j][i] = k;
			}
		}

		/*
		 * for (int i = 0; i < 5; i++) { if (i == 0) { for (int j = 3; j < 4; j++) {
		 * k++; mtx[j][i]=k; } } else if (i == 1) { for (int j = 2; j < 5; j++) { k++;
		 * mtx[j][i]=k; }
		 * 
		 * } else if (i == 2) { for (int j = 1; j < 6; j++) { k++; mtx[j][i]=k; } } else
		 * if(i==3) for (int j = 0; j < 7; j++){ k++; mtx[j][i]=k; }
		 * 
		 * }
		 */

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mtx[i][j] + " ");
			}
			System.out.println();
		}

	}

}
