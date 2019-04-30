package loopControl;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
	
		int gcd=1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first number: ");
		int num1 = input.nextInt();
		System.out.println("What is your second number: ");
		int num2 = input.nextInt();
		
		for(int i = 1; i<=num1 && i<=num2; i++) {
			if(num1%i == 0 && num2%i == 0) {
				gcd=i;
			}
		}
		System.out.println("The greatest common divisor of " +num1+ " and " +num2+ " is : "+ gcd);
        input.close();
	}

}
