package javaConditionals;

import java.util.Scanner;

public class ComputingTaxesSlide23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter your Status :" +'\n' +"Press 1 for Single" +'\n' +"Press 2 for Married Filling Jointly"
				+'\n' + "Press 3 for Married Filling separately");
		int status = input.nextInt();
		System.out.println("Please enter your taxable income:");
	double income = input.nextDouble();
	double tax;
				 if (status == 1) {
					if(income>=0 && income>=8350) {
						tax = income * 0.10;
						System.out.println("Your Federal personal income is: $" +tax );
					}else if(income>=8351 && income<=33950){
						tax= income *0.15;
						System.out.println("Your Federal personal income is: $" +tax);
					}else if(income>=33951 && income<=82250){
						tax= income *0.25;
						System.out.println("Your Federal personal income is: $" +tax);
					}else if(income>=82251 && income<=171550){
						tax= income *0.28;
						System.out.println("Your Federal personal income is: $" +tax);
					}else if(income>=171551 && income<=372950){
						tax= income *0.33;
						System.out.println("Your Federal personal income is: $" +tax);
					}else {
						tax= income *0.35;
						System.out.println("Your Feredal personal income is: $" +tax);
					}
				 }
			     if (status == 2) {
			    	 if(income>=0 && income>=16700) {
							tax = income * 0.10;
							System.out.println("Your Federal personal income is: $" +tax );
						}else if(income>=16701 && income<=67900){
							tax= income *0.15;
							System.out.println("Your Federal personal income is: $" +tax);
						}else if(income>=67901 && income<=137050){
							tax= income *0.25;
							System.out.println("Your Federal personal income is: $" +tax);
						}else if(income>=137051 && income<=208850){
							tax= income *0.28;
							System.out.println("Your Federal personal income is: $" +tax);
						}else if(income>=208851 && income<=372950){
							tax= income *0.33;
							System.out.println("Your Federal personal income is: $" +tax);
						}else {
							tax= income *0.35;
							System.out.println("Your Feredal personal income is: $" +tax);
						}
			     }
			          
			        else if (status==3)
			        	if(income>=0 && income>=8350) {
							tax = income * 0.10;
							System.out.println("Your Federal personal income is: $" +tax );
						}else if(income>=8351 && income<=33950){
							tax= income *0.15;
							System.out.println("Your Federal personal income is: $" +tax);
						}else if(income>=33951 && income<=68525){
							tax= income *0.25;
							System.out.println("Your Federal personal income is: $" +tax);
						}else if(income>=68526 && income<=104425){
							tax= income *0.28;
							System.out.println("Your Federal personal income is: $" +tax);
						}else if(income>=104426 && income<=186475){
							tax= income *0.33;
							System.out.println("Your Federal personal income is: $" +tax);
						}else {
							tax= income *0.35;
							System.out.println("Your Feredal personal income is: $" +tax);
						}
				
	}
	

}
