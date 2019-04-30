package javaConditionals;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a year: ");  
		int year = input.nextInt();
		int animal = year%12;
		
		switch (animal) {
		case 0:
			System.out.println("Your Birth year is Monkey: ");
			break;
		case 1:
			System.out.println("Your Birth year is Rooster: ");
			break;
		case 2:
			System.out.println("Your Birth year is Dog: ");
			break;
		case 3:
			System.out.println("Your Birth year is Pig: ");
			break;
		case 4:
			System.out.println("Your Birth year is Rat: ");
			break;
		case 5:
			System.out.println("Your Birth year is OX: ");
			break;
		case 6:
			System.out.println("Your Birth year is Tiger: ");
			break;
		case 7:
			System.out.println("Your Birth year is Rabbit: ");
			break;
		case 8:
			System.out.println("Your Birth year is Dragon: ");
			break;
		case 9:
			System.out.println("Your Birth year is Snake: ");
			break;
		case 10:
			System.out.println("PYour Birth year is Horse:");
			break;
		case 11:
			System.out.println("PYour Birth year is Sheep:");
			break;

		default:
			System.out.println("Something else !!!!!");
			break;
		}

	}

}
