package loopControl;

import java.util.Random;
import java.util.Scanner;

public class repeatAdditionSlide20 {

	public static void main(String[] args) {
		//creating instance of random class
		//Random rand = new Random();
		
		// Generate two single digit integers
		//int num1 = rand.nextInt(50);
		//int num2 = rand.nextInt(50);
		//System.out.println("What is : " +num1 + "+" +num2+ "?");
		
		int num1 = 10;
		int num2 = 10;
		System.out.println("What is : " +num1 + "+" +num2+ "?");
		
		// Generating Scanner to take input from student
		Scanner input = new Scanner(System.in);
		int result1 = input.nextInt();
		int result2 = num1 + num2;
		
		while(!(result1==result2)) {
			System.out.print("Your answer is not correct, try again: ");
		    result1= input.nextInt();
		}
		System.out.print("Your answer is Correct! ");


	}

}
