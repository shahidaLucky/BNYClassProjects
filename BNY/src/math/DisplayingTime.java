package math;

import java.awt.SecondaryLoop;
import java.util.Scanner;

public class DisplayingTime {

	public static void main(String[] args) {
		
		int seconds;
		int minutes;
		int remainingSeconds;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter a number for second : ");
		seconds = inputScanner.nextInt();
		
		minutes = seconds/60;  //Find minutes in second
		remainingSeconds = seconds%60; // seconds remaining
		
		System.out.println(seconds + " Second is "+minutes +" minutes and "+remainingSeconds + "  seconds" );

	}

}
