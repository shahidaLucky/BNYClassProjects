package searchingAlgo;

public class LinearSearch {
	// Why this called linear search
	// First What is Big O Notation?
	// Big O Notation is the time complexity  of a block of code
	// Total Input: 8
	// Best Case: 1
	// Worst Case: 8

	public static void main(String[] args) {
		int[] myLists = { 3, 4, 1, 9, 7, 3, 2, 8 };
		int toFind = 9;
		int findIndex = LinearSearch.search(myLists, toFind);
		if(findIndex >= 0) {
			System.out.println(toFind + " Found at Index:" + findIndex);
		}else {
			System.out.println("Sorry, " + toFind + " not found");
		}
	}
	
	public static int search(int[] lists, int compareNumber) {
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] == compareNumber) {
				return i;
			}
		}
		return -1;
	}
}
