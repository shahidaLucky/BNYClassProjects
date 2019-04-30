package arrays;

import java.util.Arrays;

public class DecOfCard {

	public static void main(String[] args) {
		int dec[] = new int[52];
		for (int i = 0; i <= 51; i++) {
			dec[i] = i;
		}
		//System.out.println(Arrays.toString(dec));
		// 52 Cards
		for(int i =dec.length-1; i>0; i--) {
			// Generating an index j randomly with 0 <=j <=i
			int j = (int)(Math.random()*(i+1));
			//swap myList[i] with myList[j]
			int temp = dec[i];
			dec[i] = dec[j];
			dec[j] = temp;
		}
		int firstRandomCard = dec[0];
		int secondRandomCard = dec[1];
		int thirdRandomCard =dec[2];
		int forthRandomCard = dec[3];
		for(int i=0; i<4; i++) {
			System.out.println("The Random Card number is :"+dec[i]);
			if(dec[i]>=0 && dec[i]<=12) {
				System.out.println("This is a Spades");
			}else if(dec[i]>=13 && dec[i]<=25) {
				System.out.println("This is a Hearts");
			}else if(dec[i]>=26 && dec[i]<=38) {
				System.out.println("This is a Diamond");
			}else if(dec[i]>=39 && dec[i]<=51) {
				System.out.println("This is Hearts");
			}else {
				System.out.println("This is not a Card Type");
			}	
		}
		for(int i=0; i<4; i++) {
			
			
		}
				System.out.println("The random Card numbers are:" +firstRandomCard+" " +secondRandomCard+" "+thirdRandomCard+" "+forthRandomCard+ '\n'+" And The type of the cards are: ");
	}
}
