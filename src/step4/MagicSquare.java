package step4;

public class MagicSquare {

	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 1;

		for (int i = 0; i < 5; i++) {
			for(int j = 2;j<3;j++) {
				mtx[i][j]=k;
			}
			
			
			}

		

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mtx[i][j] + " ");
			}
			System.out.println();
		}
	}
}
