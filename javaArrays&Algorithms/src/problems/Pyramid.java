package problems;

public class Pyramid {

	public static void main(String[] args) {
		int numOfRows = 5;
		
		for(int i=0; i<numOfRows; i++) {
			for(int j=0; j<numOfRows-i ; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");//appending the starts
			}
			System.out.println();// printing the lines one after another
		}
	}

}
