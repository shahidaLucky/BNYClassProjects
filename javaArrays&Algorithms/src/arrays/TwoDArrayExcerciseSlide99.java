package arrays;

public class TwoDArrayExcerciseSlide99 {

	public static void main(String[] args) {
		int rows = 3;
		int columns = 4;
		int value = 0;
		int [][] myArray = new int [rows][columns];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns ;j++) {
				value += 10;
				myArray[i][j] = value;
				System.out.print(myArray[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
