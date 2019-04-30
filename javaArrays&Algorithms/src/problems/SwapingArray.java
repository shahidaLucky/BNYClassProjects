package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,7,8,0,5};
		System.out.println("The Original Array is :" +Arrays.toString(nums));
		
		for(int i=0, j =nums.length-1; i<nums.length/2; i++,j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		System.out.println("The new Array is : "+Arrays.toString(nums));
	}

}
