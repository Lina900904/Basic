package step4;

public class MatrixVertical2 {

	public static void main(String[] args) {
		int k = 0;
		int b = 0;
	
		int[][] mtx = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				mtx[i][j] = 0;
			}

			for (int n = 4 - i; n < 5; n++) {
				mtx[i][n] +=n;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}
