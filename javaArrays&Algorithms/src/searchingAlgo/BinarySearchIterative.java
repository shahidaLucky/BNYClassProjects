 package searchingAlgo;

public class BinarySearchIterative {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 6, 8, 10, 14, 21, 40 };
		int key = 10;
		int result = binarySearch(arr, key);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);

	}

	// Java implementation of iterative Binary Search
	// Returns index of key if it is present in arr[],
	// else return -1
	public static int binarySearch(int[] arr, int key) {
		int startIndex = 0;
		int endIndex = arr.length - 1;

		while (startIndex <= endIndex) {
			int midIndex = startIndex + (endIndex - startIndex) / 2;

			// Check if x is present at mid
			if (arr[midIndex] == key)
				return midIndex;

			// If x greater, ignore left half
			if (arr[midIndex] < key)
				startIndex = midIndex + 1;

			// If x is smaller, ignore right half
			else
				endIndex = midIndex - 1;
		}

		// if we reach here, then element was
		// not present
		return -1;
	}
}
