/**
 * 
 */
package week1Day3;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1;
		double number2;
		double sum;
		
		Scanner input =  new Scanner(System.in);
		System.out.println("Please enter the first number :  ");
		number1 = input.nextDouble();
		System.out.println("Please enter the second number :  ");
		number2 = input.nextDouble();
		
		sum = number1+number2;
		System.out.println("The sum is : " +sum);
		
	}

}
