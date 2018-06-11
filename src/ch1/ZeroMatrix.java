package ch1;

import java.util.Arrays;

public class ZeroMatrix {

	public static void main(String[] args) {

	}

	public  void makerow_col_zero(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		boolean[] row = new boolean[m];
		boolean[] col = new boolean[n];
		
		System.out.println(" Original Matrix: " );
		for (int i = 0; i < m; i++)
		      System.out.println(Arrays.toString(matrix[i]));
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j< n; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
				
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (row[i] ||col[j] ) {
					matrix[i][j] = 0;
				}
				
			}
		}
		System.out.println(" Zero Matrix: "+"\n" );
		for (int i = 0; i < m; i++)
		      System.out.println(Arrays.toString(matrix[i]));
	}

}
