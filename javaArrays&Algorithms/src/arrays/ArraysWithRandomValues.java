package arrays;

import java.util.Scanner;

public class ArraysWithRandomValues {

	public static void main(String[] args) {
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the number :");
		length = input.nextInt();
		
		int arr[] = new int [length];
		
		for(int i = 0; i<arr.length; i++) {
		arr[i] = (int)(Math.random()*100);
		}
		// for printing 
		for(int i=0; i<arr.length; i++)
			System.out.println("Number " + (i+1) + ":" + arr[i]);

	}

}
