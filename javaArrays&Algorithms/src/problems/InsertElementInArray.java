package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {

		//Scanner input = new Scanner(System.in);
//		System.out.println("Please Enter the size of the Array: ");
//		//int arrSize = input.nextInt();// user input
//
//		int arr[] = new int[arrSize + 1]; // creating a new array
//		System.out.println("Please Enter Array Elements : ");
//
//		for (int i = 0; i < arrSize; i++) {
//			arr[i] = input.nextInt();
//		}
//		// For Printing
//		for (int i = 0; i < arrSize; i++) {
//			System.out.println("The User Created Array is :");
//		}
//
//		// Asking to provide new array position
//		System.out.println("Please Enter position for new element: ");
//		int newArrPosition = input.nextInt();
//
//		// Asking to provide new array Element
//		System.out.println("Please Enter new element: ");
//		int newArrElement = input.nextInt();

		
        
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        
        int arrSize = input.nextInt();
        int userArray[] = new int[arrSize+1];
        
        System.out.println("Enter all the elements of the Array:");
        for(int i = 0; i < arrSize; i++)
        {
            userArray[i] = input.nextInt();   
        }
        System.out.println("The User Created Array is :" + Arrays.toString(userArray));
        
        System.out.print("Enter the position where you want to insert a new element:");
        int pos = input.nextInt();
        
        System.out.print("Enter the element you want to insert:");
        int element = input.nextInt();
        // for right shift
        for(int i = (arrSize-1); i >= (pos-1); i--)
        	//for(int i= arrSize-1; i>pos-1;i--)
        {
            userArray[i+1] = userArray[i];
        		//userArray[i] = userArray[i-1];
            
        }
        userArray[pos-1] = element;
        //userArray[pos] = element;
        System.out.print("After insertion the new Array is : "+ Arrays.toString(userArray));
//        for(int i = 0; i < arrSize; i++)
//        {
//           // System.out.print(userArray[i]);
//        }
        //System.out.print("\n The newly created Array is : "+ Arrays.toString(userArray));
	}

}
