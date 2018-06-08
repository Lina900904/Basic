package step4;

public class Diagonal {

	public static void main(String[] args) {
		
int[][] mtx = new int[5][5];
		int k = 0;

		for (int s = 0; s < 9; s++) {
			for(int i=0;i<5;i++) {
				int j=s-i;
				if(j>=0&&j<5) {
					k=k+1;
					mtx[i][j]=k;;
				
			}
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
