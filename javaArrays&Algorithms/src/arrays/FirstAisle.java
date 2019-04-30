package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAisle {
// This is Shorter form  of Airplane Seating problem
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What are the alredy booked tickets? Please separate them by comms: ");
		String bookedSeats = scanner.nextLine();
		String delimiter = ",";

		bookedSeats = bookedSeats.replaceAll("\\s+", "");
		String[] bookedSeatsArr = bookedSeats.split(delimiter);
		
		seatMaker(numOfRow, numOfColumn, bookedSeatsArr);
	}
	public static void seatMaker(int numOfRow, int numOfColumn, String[] bookedSeatArr) {
		boolean [][] allSeats = new boolean [numOfRow][numOfColumn];
		
		for(int i=0; i<allSeats.length; i++) {
			for(int j=0; j<10; j++) {
				allSeats[i][j] = true;
			}
		}
	}
		
		boolean[][] seats = new boolean[26][10];
		//String[] bookedSeatArr = { "A4", "A10", "C5", "D3", "E6", "F8" };

		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < 10; j++) {
				seats[i][j] = true;
			}
		}
		for (int i = 0; i < bookedSeatArr.length; i++) {
			String temp = bookedSeatArr[i];
			int row = Integer.valueOf(getRow(temp.charAt(0)));
			int column = Integer.valueOf(temp.substring(1)) - 1;
			seats[row][column] = false;
		}

		System.out.println(Arrays.deepToString(seats));

		for (int i = 0; i < seats.length; i++) {
			int j = 0;
			if (seats[i][j] && seats[i][j + 1] && seats[i][j + 2]) {
				count++;
			}
			if ((seats[i][j + 3] && seats[i][j + 4] && seats[i][j + 5])
					|| (seats[i][j + 4] && seats[i][j + 5] && seats[i][j + 6])) {
				count++;
			}

			if (seats[i][j + 7] && seats[i][j + 8] && seats[i][j + 9]) {
				count++;
			}
		} // end of for loop

		System.out.println("The available seat is : " + count);

	}
	public static int getRow(char c) { //  Method
		return (int) (c - 'A');
	}
}
