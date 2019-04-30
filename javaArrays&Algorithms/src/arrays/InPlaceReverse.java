package arrays;

import java.util.Arrays;

public class InPlaceReverse {

	public static void main(String[] args) {
		int [] numArr = {10,20,30,35,40,50};
		
		int[] revArr = new int [numArr.length];
		// 10-> 50
		//20-> 40
		//30->35
		// Using Temp Array
		System.out.println("********Using Temporary Array Reverse *********************** ");
		for(int i =0, j=numArr.length-1; i<numArr.length; i++,j--) {
			revArr[j] = numArr[i];
			System.out.println("The value of i is: "+i);
			System.out.println("The value of j is: "+j);
		}
		System.out.println(Arrays.toString(revArr));
		
		System.out.println("********Not Using Temporary Array Reverse-- Using Swaping *********************** ");
		
		int [] numArr1 = {10,20,30,40,50};
		
		Integer a = 5;
		a= 10;
	}

}
