package sortingAlorithms;

import java.util.Arrays;

public class BubbleSortForLoop {

	public static void main(String[] args) {
		
		double[] arr = {0.2, 1.4, 2.9, 1.3, 4, 0.1};

		for (int i = 0; i < arr.length- 1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) 
				if (arr[j] > arr[j + 1]) {
					double temp;
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}System.out.println(Arrays.toString(arr));
		}

	}


