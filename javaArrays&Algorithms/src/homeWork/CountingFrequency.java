package homeWork;

import java.util.Scanner;

public class CountingFrequency {

	public static void main(String[] args) {

		int counter[] = new int[50];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string : ");
		String str = input.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			counter[(int) str.charAt(i)]++;
		}
		// Printing frequency of characters
		for(int i=0; i<50; i++) {
			if(counter[i] !=0) {
				System.out.println("The character " + (char)i +" :  has occure for  " + counter[i]+"  times" );
				input.close();
			}
		}
	}

}
