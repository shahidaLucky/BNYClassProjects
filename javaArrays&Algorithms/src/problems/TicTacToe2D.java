package problems;

public class TicTacToe2D {

	public static void main(String[] args) {
	
		int [][] m = new int [3][3];
		int sum = 0;
		boolean winner = false;
		
		//initialize the matrix with 0
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				m[i][j]= 0;
			} // end of inner loop
		
		// 1 ---Winner By Diagonal Left
		sum = m[0][0] + m[1][1] + m[1][2];
		if (sum == 9) {
			System.out.println("X is the winner !");
			winner = true;
		} // end of if
		else if (sum == 15) {
			System.out.println("O is the winner !");
			winner = true;
		} // end of else if
		
		if (winner == false) {
			// 2 ---Winner By Diagonal Right
			sum = m[0][2] + m[1][1] + m[2][0];
			if (sum == 9) {
				System.out.println("X is the winner !");
				winner = true;
			} // end of if
			else if (sum == 15) {
				System.out.println("O is the winner !");
				winner = true;
			} // end
			
			if (winner == false) {
				// 3 ---Winner By Horizontal (Row)
				//for (int i = 0; i <= 2; i++) {
					sum = 0;
					for (int j = 0; j <= 2; j++) {
						sum = sum + m[i][j];
					} // end of inner loop
					if (sum == 9) {
						System.out.println("Winner is X");
						winner = true;
						break;
					} // end of if
					else if (sum == 15) {
						System.out.println("Winner is O !");
						winner = true;
						break;
					} // end of else if
				} // end of outer for loop
			
				if (winner == false) {
					// 4 ---Winner By Vertical (Column)
					for (int j = 0; j <= 2; j++) {
						sum = 0;
						//for (int i = 0; i <= 2; j++) {
							sum = sum + m[i][j];
						} // end of inner loop
						if (sum == 9) {
							System.out.println("Winner is X");
							winner = true;
							break;
						}//end of if
						else if (sum == 15) {
							System.out.println("Winner is O !");
							winner = true;
							break;
						}//end of else if
					}//end of outer for loop
				}//end of  outer if
			}// 
		} // end of outer if------
	}// end of main method
}}// end of class
