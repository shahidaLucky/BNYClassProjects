/**
 * 
 */
package javaConditionals;

import java.util.Random;
import java.util.Scanner;

public class MathLearningTool {

	public static void main(String[] args) {
	// creating instance of Random class
		Random rand = new Random(); 
		  
	        // Generate random integers 1-50 
	        int number1 = rand.nextInt(50); 
	        int number2 = rand.nextInt(50); 
	        System.out.println("What is : " +number1 + " + " +number2+"?");
	        Scanner input1 = new Scanner(System.in); 
	        int result1 = input1.nextInt();
	        int result2 = number1+number2;
	        
	        if(result1==result2) {
	        	System.out.println("Correct!");
	        }else {
	        	System.out.println("You enter wrong! Try again");
	        }
	  
	}

}
