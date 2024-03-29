package gitstudy;

public class MatrixCalculator {

	public static void main(String[] args) {
		int[][] a = { { 1, 0, 2 },
					{ -1, 3, 1 } };
		int[][] b = { { 3, 2, 1 }, 
					{ 1, 1, 0 } };
		int[][] c = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[j][k];
				}
			}
		}
		for (int i = 0; i<2; i++) {
			for (int j =0; j<2; j++) {
				System.out.print(c[i][j]);
			}
			System.out.println("");
		}
	}

}
