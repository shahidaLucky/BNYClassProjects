package arrays;

import java.util.Arrays;

public class CopyingArray {

	public static void main(String[] args) {
		int[] list1 = {1,2,3,4};
		int[] list2 = {9,8,7,6};
		
		list2 = list1;
		 
		list2[2] = 99;
		
		System.out.println(Arrays.toString(list2));
		System.out.println(Arrays.toString(list1));
		
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println("**************Copying using loop****************");
		int[] sourceArray = {2,3,1,5,10};
		int[] targetArray = new int[sourceArray.length];
		
		for(int i=0; i<sourceArray.length;i++) {
			targetArray[i] = sourceArray[i];
		}
	}

}
