package math;

import java.util.Scanner;

public class LoanCalculator {

	public static void main(String[] args) {
		
		double monthlyPayment;
		double interestRate;
		double numberOfYears;
		double loanAmount;
		
		
		// Initialize the input through console
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the interest rate:  ");
		interestRate= input.nextDouble();
	 
		// Taking input for Loan amount
		System.out.println("Please enter the Loan Amount:  ");
		loanAmount= input.nextDouble();
		
		// Taking input for numberOfYears
				System.out.println("Please enter the number of years:  ");
				numberOfYears= input.nextDouble();
		
		// Calculate the monthlyPayments
		       
	monthlyPayment=(loanAmount*(interestRate/1200))/(1-(1/(Math.pow(1+interestRate/1200,numberOfYears*12))));
	
	System.out.println("Monthly Payment is : " +monthlyPayment);
	double totalPayment = monthlyPayment*60;
	System.out.println("Total payment is : " +totalPayment);

	}

}
