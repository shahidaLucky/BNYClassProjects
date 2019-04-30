package sortingAlorithms;

import java.util.Arrays;

public class BubbleSortSimpleWay {

	public static void main(String[] args) {
		int[] myList = { 10, 25, 24, 67, 89, 12, 34 };
		boolean isSorted = true;
        System.out.println("Unsoretd Array:  " +Arrays.toString(myList));
		while (isSorted) {
			isSorted = false;
			for (int i = 0; i < myList.length-1; i++) {
				System.out.print("\n Iteration: " + i);
				System.out.print(Arrays.toString(myList));
				if (myList[i] > myList[i + 1]) { // if u want to sort in Descending way use '<' instead of '>'
					int swap = myList[i];
				    myList[i] = myList[i+1];
					myList[i+1] = swap;
					isSorted = true;
				}
				System.out.println("  -> isSorted  = " +isSorted);
			}
		}
		System.out.println("\n Sorted Array: " +Arrays.toString(myList));

	}

}
