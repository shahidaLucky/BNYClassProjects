package arrays;

import java.util.Arrays;

public class RandomShufflingSlide38 {

	public static void main(String[] args) {

		int myList[] = { 3, 4, 5, 6, 7, 8, 9 };

		for (int i = myList.length - 1; i > 0; i--) {
			// generating an index j randomly with 0 <=j <=i
			int j = (int) (Math.random() * (i + 1));

			// swap myList[i] with myList[j]
			int temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
			System.out.println(j);
		}
		System.out.println(Arrays.toString(myList));
	}

}
