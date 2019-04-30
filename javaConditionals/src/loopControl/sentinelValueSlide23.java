package loopControl;

import java.util.Scanner;

public class sentinelValueSlide23 {

	public static void main(String[] args) {
		
		int sum=0;
		
		//Creating scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int userInput = input.nextInt();
		while(userInput !=0) {
			sum = userInput +sum;
			System.out.println("Please enter another integer: ");
			userInput = input.nextInt();
			System.out.println("Please enter the numbers:" +(sum+userInput));
		}
		System.out.println("The sum of integers = " +sum);
		input.close();

	}

}
