package loopControl;
import java.util.Scanner;

public class guessingNumbers {

	public static void main(String[] args) {
		
		// Generating a random number to be guessed 
		int number = (int)(Math.random() *101);
		System.out.println("The random number is : " +number);
		
		// Taking input
		Scanner input = new Scanner(System.in);
		System.out.println("Please Guess a number between 0 and 100");
		
		int guess = 0;
		while(guess !=number) {
			System.out.println("\nPlease Enter your Guess: "); // prompt the user to guess the number
			guess = input.nextInt();
			if(guess == number) 
			System.out.println("*****Yes it is the number and its matched! " +number);
			else if(guess > number )
				System.out.println("Your guess is too high.");
			else 
				System.out.println("Your guess is too low");
			}
	}
}
