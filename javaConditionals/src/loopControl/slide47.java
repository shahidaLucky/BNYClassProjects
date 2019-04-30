package loopControl;

import java.util.Scanner;
// Problem: Write a program that uses

// nested for loops to print a

// multiplication table.

public class slide47 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.println("How high will your multiplication table go?");

		int mymax = input.nextInt();

		try {

		for (int i = 1; i <=mymax; ++i) {

		System.out.printf("%-4d : ", i);

		for ( int j = 1; j<= 10 ; ++j ) {

		System.out.printf("%-5s ", i*j);

		}

		System.out.println("\n");

		}

		} //end of try

		catch (Exception e) {

		System.out.println("Something went wrong" + e);

		} //end of catch

		input.close();

		} //end of main, end of class;

	}


