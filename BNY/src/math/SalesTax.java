package math;

import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		
	double salesTaxRate= 8.875;
	double number = 100;
	double salesTax;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your number : ");
	number=input.nextDouble();
	salesTax = (salesTaxRate/100d)*number;
	
	System.out.printf("The sales tax is : $%,.2f%n  ", salesTax);
	

	}

}
