package javaConditionals;
import java.util.Random;
import java.util.Scanner;

public class LotteryProblem {

	public static void main(String[] args) {
		// Create  Scanner
        Scanner s = new Scanner(System.in);
        //generate 2 digit random  lottery  number
        int lottery = (int) (Math.random() * 100);
   
        //generating first and second digit of lottery
        int firstDigit = lottery / 10;
        int secondDigit = lottery % 10;
        System.out.println(firstDigit + secondDigit);
    

        //prompt user to input digits 
        System.out.print("Enter two Digit  number:");
        int userInput = s.nextInt();
        int digit1 = userInput / 10;
        int digit2 = userInput % 10;
        
        // compare lottery and userInput
        if (digit1 == firstDigit && digit2 == secondDigit) {
            System.out.println("You  just won $10,0000");
        } else if (digit1 == secondDigit && digit2 == firstDigit) {
            System.out.println("Congratulations! You  have  won $3,000");
        } else if (digit1 == firstDigit
                || digit1 == secondDigit
                || digit2 == firstDigit
                || digit2 == secondDigit) {
            System.out.println("Congratulations! You have won $1,000");
        } else {
            System.out.println("Sorry ! You  have  not won anything");
        }
        System.out.println("lottery number is :  " + " "  + lottery + " and     your input is : " + userInput);

}
}