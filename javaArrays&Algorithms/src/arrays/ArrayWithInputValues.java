package arrays;

import java.util.Scanner;
public class ArrayWithInputValues {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("Enter number " + (i+1) + " :   " );
			arr[i] = input.nextInt();
		}
		//For Printing 
		for(int i = 0; i<5 ; i++)
			System.out.println("Number " + ":  " +arr[i]);

	}
}
