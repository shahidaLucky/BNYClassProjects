package loopControl;

import java.util.Scanner;

public class slide22MathTool {

	public static void main(String[] args) {
		int questions =5;
	    int count;
		
		
		// taking input
		Scanner input = new Scanner(System.in);
		System.out.println("Please answer the following questions:");
		
		while(count < questions) {

		int num1 = (int) (Math.random() *10);
		int num2 = (int) (Math.random() *10);
		
				 System.out.print("\nWhat is the value of : " + num1 + " - " + num2 + " = "); //  Prompt the student to answer “What is number1 – number2?”
				 int answer = input.nextInt();
				 if (num1 - num2 == answer) {
				 System.out.println("You are correct!");
				 count++;
				 }
				 else { System.out.println("Your answer is wrong");
					 }
				 }
	}
}
}


