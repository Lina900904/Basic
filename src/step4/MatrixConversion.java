package step4;

public class MatrixConversion {

	public static void main(String[] args) {
		int A[][] = new int[5][3];
		int B[][] = new int[3][5];

		int k = 0;
		int row = 0;
		int col = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				k++;
				A[i][j] = k;
			
			}
		}
		

		for (int l = 0; l < 3; l++) {
			for (int m = 0; m < 5; m++) {
				k++;

				B[l][m] = k;

			}

		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		for (int l = 0; l < 3; l++) {
			for (int m = 0; m < 5; m++) {
				System.out.print(B[l][m] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
