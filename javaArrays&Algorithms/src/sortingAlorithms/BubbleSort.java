package sortingAlorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] num = { 10, 5, 20, 15, 20, 35 };
		bSort(num); // invoking method bSort and passing the argument
		System.out.println(Arrays.toString(num));
	}

	public static void bSort(int[] num) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < num.length - 1; j++) {
				System.out.println("Iteration: " +j);
				System.out.println(Arrays.toString(num));
				if (num[j] > num[j + 1]) {
					temp = num[j]; // swap elements
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
	}
}
