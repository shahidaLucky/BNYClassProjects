package loopControl;

import java.util.Scanner;

public class greatestCommonDivisorSlide48 {

	public static void main(String[] args) {
		 //int gcd = 1;
		 int k = 4;
		// Create a Scanner
		 Scanner input = new Scanner(System.in);
		 // Prompt the user to enter two integers
		 System.out.print("Enter first integer: ");
		 int gcdNum1 = input.nextInt();
		 System.out.print("Enter second integer: ");
		 int gcdNum2 = input.nextInt(); 
		
		 while (gcdNum1 == 0) {
	            gcdNum1 = 0;
	        }
	        while (gcdNum2 > gcdNum1) {
	            int gcd = gcdNum1 % gcdNum2;
	        }
	        System.out.print(gcdNum1 + gcdNum2);
	    }
	
//		 while(k <=n1 && k=n2) {
//			 if(n1 % k == 0 && n2 % k == 0) {
//				 gcd= k;
//				 k++;
//			 }
//		 }
//		 System.out.println("The greatest common divisor for " + n1 +
//		 " and " + n2 + " is " + gcd); 
//        input.close();
	}


