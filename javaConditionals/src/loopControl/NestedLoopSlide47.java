package loopControl;

import java.util.Scanner;

public class NestedLoopSlide47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter your number:");
		int userInput = input.nextInt();
		int num = 1;
		for(int i=1; i<=10; ++i) {
		
			for(int j=1; j<=10; ++j) {
				
			num= i*j;
			System.out.println("Multiplication Table :" +i + "*" +j+ "=" +num);
			}
			System.out.println("============================");
		}
	}

}
