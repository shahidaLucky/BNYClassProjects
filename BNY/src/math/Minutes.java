/**
 * 
 */
package math;
import java.util.Scanner;

public class Minutes {

	
	public static void main(String[] args) {
		
		int inputMin;
		int outputHr;
		int outputMin;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the minute");
		inputMin = input.nextInt();
		
		outputHr = inputMin/60; // 229/60= 3 reminder is 49
		outputMin = inputMin%60; // to show how many minutes used this "%" operator means reminder
		
		System.out.println(inputMin + "    min is "     +outputHr +"  hours " +outputMin +"  mins");

	}

}
