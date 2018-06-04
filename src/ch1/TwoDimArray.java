package ch1;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[10][10];
		PrintMatrix(array);
		FibonnaciPopulateMatrix(array);
		
		PrintMatrix(array);
	}

	private static void FibonnaciPopulateMatrix(int[][] array) {
		array[0][0] = 1;
		array[0][1] = 1;
		array[1][0] = 1;
		for(int i = 0; i< array.length; i++)
		{
			for(int j= 0; j<array[0].length; j++)
			{
				if(i> 0 && j > 0)
					array[i][j] = array[i-1][j] + array[i][j-1];
			}
		}
	}

	private static void PrintMatrix(int[][] array) {
		for(int i = 0; i< array.length; i++)
		{
			for(int j= 0; j<array[0].length-1; j++)
			{
				System.out.print(array[i][j] + ", ");
			}
			System.out.println(array[i][array[0].length-1]);
		}
	}

}
