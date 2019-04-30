package arrays;

import java.util.Arrays;

import javax.xml.transform.Templates;

/*Right shift by two */
public class ShifthingElementsSlide {

//	public static void main(String[] args) {
//
//		int myList[] = { 1, 2, 3, 4, 5, 6 };
////		int myList[] = {  2, 3, 4, 5, 6, 1 };
//		int temp = myList[0];
//
//		for (int i = 1; i < myList.length; i++) {
//			myList[i - 1] = myList[i];
//		}
//		myList[myList.length - 1] = temp;
//		System.out.println(Arrays.toString(myList));
//	}

	public static void main(String[] args) {

		int myList[] = { 4, 6, 7, 8 };
//		int myList[] = { 8, 4,6,7 };
		int temp = myList[myList.length - 1];

		for (int i = myList.length - 1; i > 0; i--) {
			myList[i] = myList[i - 1];
		}

		myList[0] = temp;
		System.out.println(Arrays.toString(myList));
	}

}
