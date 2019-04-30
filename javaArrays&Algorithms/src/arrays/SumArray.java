package arrays;

import java.util.Arrays;

public class SumArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		//Declaring and initializing a variable to hold the sum after each iteration
		int total = 0;
		
		//for loop to iterate through the array and sum all elements
		for(int i = 0; i<arr.length ; i++) {
			total += arr[i];
		}
		System.out.println("The total is : " +total);
		   //------------------Override the array with new element---------
		for(int j = 0; j<arr.length; j++) {
			
			arr[j] = total-arr[j];
		}
		System.out.println("The new Array is : "+Arrays.toString(arr));
	}
   
	
}

