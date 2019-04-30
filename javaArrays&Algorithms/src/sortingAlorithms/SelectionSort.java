package sortingAlorithms;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = {100, 5, 3, 4,101, 1, -1,100, 4, -8, 2 };
		sorter(num);
		System.out.println(Arrays.toString(num));

	}

	static void sorter(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int minIndex = minFinder(i, num);
			int temp = num[i];
			num[i] = num[minIndex];
			num[minIndex] = temp;
		}
	}

	static int minFinder(int startInex, int[] num) {
		int min = num[startInex];
		int minIndex = startInex;

		for (int i = startInex + 1; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
