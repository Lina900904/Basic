package step4;

public class SandGlass {

	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0;
		int a = 0;
		int b = 5;

		for (int i = 0; i < 5; i++) {
			if (i <3 ) {
				a++;
				b--;
			} else {
				a--;
				b++;
			}
			for (int j = a-1; j <=b; j++) {
				k++;
				mtx[i][j] = k;
			}

		}

		/*
		 * for (int i = 0; i < 5; i++) { if (i == 0 || i == 4) { for (int j = 0; j < 5;
		 * j++) { k++; mtx[i][j] = k; } } else if (i == 1 || i == 3) { for (int j = 1; j
		 * <4; j++) { k++; mtx[i][j] = k; } } else { for (int j = 2; j < 3; j++) { k++;
		 * mtx[i][j] = k; } }
		 * 
		 * }
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mtx[i][j] + " ");
			}
			System.out.println();
		}

	}

}
