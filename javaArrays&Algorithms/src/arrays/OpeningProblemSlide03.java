package arrays;

public class OpeningProblemSlide03 {

	public static void main(String[] args) {
		
	int arr[] = new int[100];
		// variables
		int higher=0;
		int total= 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			total += arr[i];
		}
		// Calculating Average
		double avg = total/arr.length;
		System.out.println(avg);
		
		for(int j=0; j<arr.length;j++ ) {
			if(arr[j]>avg) {
				higher++;
			}
		}
		System.out.println(higher);

	}
}
