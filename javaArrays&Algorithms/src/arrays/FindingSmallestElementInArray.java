package arrays;

public class FindingSmallestElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {7, -1, 5,1, -9, 3};
		double min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		System.out.println("The smallest number in the Array is: " +min);

	}

}
