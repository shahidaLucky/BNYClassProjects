package loopControl;

import java.util.Scanner;

public class FloatingLoop {

	public static void main(String[] args) {
	  double value = 1.0;
	  int count= 0;
	  Scanner input = new Scanner(System.in);
	  int myValue= 0;
	  
	  while(value !=0) {
		  value -=0.1;
		  count++;
		  myValue = input.nextInt();
		  System.out.println(value + " " +count);
	  }
	}

}
