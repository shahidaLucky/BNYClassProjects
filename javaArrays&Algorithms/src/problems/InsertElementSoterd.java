package problems;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementSoterd {

	public static void main(String[] args) {
		
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
        
        System.out.print("Enter the element you want to insert:");
        int element = input.nextInt();
        
        for(int i =0; i<arrSize; i++) {
        	if(element>userArray[i] && element<userArray[i+1]) {
        		int index = userArray[i+1]-1;
        		for(int j=(arrSize-1); j<=(index-1); j--) {
        			userArray[i+1]= userArray[i];
        		}
        		userArray[index-1] = element;
        		
        	}input.close();
        }
        
        
        // for right shift
        for(int i = (arrSize-1); i >= (index-1); i--)
        	//for(int i= arrSize-1; i>pos-1;i--)
        {
            userArray[i+1] = userArray[i];
        		//userArray[i] = userArray[i-1];
            
        }
        userArray[index-1] = element;
        System.out.print("After insertion the new Array is : "+ Arrays.toString(userArray));

	}

}
