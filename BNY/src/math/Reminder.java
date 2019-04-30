/**
 * 
 */
package math;

/**
 * @author shahida.lucky
 *
 */

// Problem : How many hours and second 229 has?

public class Reminder {

	public static void main(String[] args) {
		// Declearing variables
		int inputMintues = 229;
		int outputMin;
		int outputHr;

		// Do the Equation
		
		outputHr = inputMintues/60; // 229/60= 3 reminder is 49
		outputMin = inputMintues%60; // to show how many minutes used this "%" operator means reminder
		
		// output
		
		System.out.println(inputMintues + "    min is "     +outputHr +"  hours " +outputMin +"  mins");
	}

}
