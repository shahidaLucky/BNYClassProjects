package arrays;

import java.util.Arrays;

public class ArrayStringReverse {

	public static void main(String[] args) {

		String myText = "I see i and j in my dream";
		char[] myChars = myText.toCharArray();

//		System.out.println("The original Array is :" + Arrays.toString(myChars));
//		System.out.println(Arrays.toString(myChars));
//		System.out.println(myChars.length);
		for (char x : myChars) {
			System.out.println(x);
		}

	}
}
