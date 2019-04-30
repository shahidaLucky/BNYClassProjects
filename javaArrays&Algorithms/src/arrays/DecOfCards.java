package arrays;

import java.util.Arrays;

public class DecOfCards {

	public static void main(String[] args) {
		int dec[] = new int[52];
		for (int i = 0; i <= 51; i++) {
			dec[i] = i;
		}
		System.out.println(Arrays.toString(dec));
		// 52 cards
		for (int i = dec.length - 1; i > 0; i--) {
			// generating an index j randomly with 0 <=j <=i
			int j = (int) (Math.random() * (i + 1));
			// swap myList[i] with myList[j]
			int temp = dec[i];
			dec[i] = dec[j];
			dec[j] = temp;
		}
		int firstCard = dec[0];
		int secondCard = dec[1];
		int thirdCard = dec[2];
		int fourthCard = dec[3];
		// firstCard
		if (firstCard >= 0 && firstCard <= 12) {
			System.out.println("Its a Spades");
		} else if (firstCard > 13 && firstCard <= 25) {
			System.out.println("Its a Heart");
		} else if (firstCard > 26 && firstCard <= 38) {
			System.out.println("Its a Diamond");
		} else
			System.out.println("Its a Clubs");
		
		
		

	}

}
