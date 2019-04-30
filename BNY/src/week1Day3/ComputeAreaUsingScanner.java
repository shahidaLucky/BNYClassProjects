/**
 * 
 */
package week1Day3;
import java.util.Scanner;
public class ComputeAreaUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double Area;
		
		//System.out.println("Please enter the radius:  "); we can use it here too.
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius:  ");
		radius = input.nextDouble();
		
		Area = radius*radius*3.14159;
		
		System.out.println("The area is :  " + Area);
		
		 //
		Math Problem 
		double res = Math.exp(2.0);
		System.out.println(res);
		
		double pi = Math.PI;
		System.out.println(pi);
		
	}

}
