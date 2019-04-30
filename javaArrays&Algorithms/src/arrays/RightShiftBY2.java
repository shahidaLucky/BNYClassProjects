package arrays;

import java.util.Arrays;

public class RightShiftBY2 {

	public static void main(String[] args) {
		int[] myList = {1,2,3,4,5,6,7,8};
		int shift = 10; //how many items to shift by
		int[] temp = new int[shift]; //create an array of length shift
		System.out.println(Arrays.toString(myList));
		if (shift >= myList.length) {  //if it's large adjust the shift
			shift = shift % myList.length;
		}
			//grab the items that will overflow
				for(int i = 0; i<shift;i++) {
					temp[i] = myList[(myList.length -shift)+i];
					}
			//shift the rest right
				for(int i = myList.length - shift - 1;i>=0;i--) {
					myList[i+shift] = myList[i];
				}
			//put the overflow in their new positions
				for(int i=0; i<shift;i++) {
					myList[i] = temp[i];
				}
	
				System.out.println(Arrays.toString(myList));


	}

}
