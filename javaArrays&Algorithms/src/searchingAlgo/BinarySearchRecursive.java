package searchingAlgo;

public class BinarySearchRecursive {

	// Main method to test above
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 10, 40 };
		int key = 10;
		int startIndex = 0;
		int endIndex = arr.length - 1;

		int result = binarySearch(arr, key, startIndex, endIndex);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}

	// Java implementation of recursive Binary Search
	// Returns index of key if it is present in arr[],
	// else return -1
	public static int binarySearch(int[] arr, int key, int startIndex, int endIndex) {

		int midIndex = (startIndex + endIndex) / 2;

		if (endIndex < startIndex) {
			System.out.println("First-1");
			return -1;
		}

		if (key < arr[midIndex]) {
			return binarySearch(arr, key, startIndex, midIndex - 1);
		}

		if (key > arr[midIndex]) {
			return binarySearch(arr, key, midIndex + 1, endIndex);
		}

		if (key == arr[midIndex]) {
			System.out.println("Second-1");
			return midIndex;
		}

		return -1;
	}

}
