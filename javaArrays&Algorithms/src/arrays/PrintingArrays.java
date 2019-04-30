package arrays;

import java.util.Arrays;

public class PrintingArrays {

	public static void main(String[] args) {
	
		int[] arr = {1, 2, 3, 4, 5};
	
		//Printing Array using enhanced for loop
		System.out.println("=======Method-1 ******* using forEach Loop=======");
	for(int element: arr) {
		System.out.println(element);
	}
	System.out.println("=======Method-2*****using for Loop=======");
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("=======Method-3*****using standard library Arrays=======");
	
		System.out.println(Arrays.toString(arr));

	}

}
