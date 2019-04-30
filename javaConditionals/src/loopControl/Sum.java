package loopControl;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
//	       Scanner scan = new Scanner(System.in);
//	       System.out.println("Please enter: ");
//	        String str = scan.nextLine();
//	        scan.close();
//	        
//	        int hours   = Integer.parseInt(str.substring(0,2));
//	        int minutes = Integer.parseInt(str.substring(3,5));
//	        int seconds = Integer.parseInt(str.substring(6,8));
//
//	        /* Convert to 24-hour format */
//	        if (str.substring(8, 10).equals("PM") && hours != 12) {
//	            hours += 12;
//	        } else if (str.substring(8, 10).equals("AM") && hours == 12) {
//	            hours = 0;
//	        }
//
//	        System.out.format("%02d:%02d:%02d", hours, minutes, seconds);
		int arr[][] = new int[4][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];

		int i, j, k = 0;
		for (i = 0; i < 4; i++) {
		for (j = 0; j < i + 1; j++) {
		arr[i][j] = k;
		k++;
		}
		}
		for (i = 0; i < 4; i++) {
		for (j = 0; j < i + 1; j++) {
		System.out.print(" " + arr[i][j]);
		k++;
		}
		System.out.println();
		}



    } 

				
	}


