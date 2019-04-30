package arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		int[][] numberArray = new int[6][5];
		numberArray = new int[][] { { 10, 12, 43, 11, 22 }, { 20, 45, 56, 1, 33 }, { 30, 67, 32, 14, 44 },
				{ 40, 12, 87, 14, 55 }, { 50, 86, 66, 13, 66 } };

		int rows = 6;
		int columns = 5;
		int i, j;
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				System.out.print(numberArray[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
