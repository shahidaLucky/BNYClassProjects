package arrays;

public class TwoDArrayRandomNumbers {

	public static void main(String[] args) {
		int rows = 3;
		int columns = 4;
		int value = 0;
		int [][] myArray = new int [rows][columns];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns ;j++) {
				myArray[i][j] = (int)(Math.random()*(i+10));
				System.out.print(myArray[i][j]+" ");
			}
			System.out.println(" ");
		}


	}

}
