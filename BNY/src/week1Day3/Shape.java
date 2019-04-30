package week1Day3;

import java.util.Scanner;

public class Shape {

	double radius;
	double length;
	double weidth;
	
	public Shape(double radius) {
		this.radius = radius;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is the circle radius ? ");
		
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		Shape circle = new Shape(radius);
		
		double area = circle.radius*circle.radius*3.14159;
		System.out.println("The area of circle is :  " +area);
	}

}
