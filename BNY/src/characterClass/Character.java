package characterClass;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*if (Character.isDigit('9')) {
		System.out.println("This is a digit");	
		}else {
			System.out.println("This is not a digit");
		}
	}*/
		String s = "MAx is a boy ";
		String s1 = " Living in NYC";
		//trim
		System.out.println(s.trim());
		//Concat
		System.out.println(s.concat(s1));
		//charAt
		System.out.println(s.charAt(2));
		String m = "Welcome to Java";
		//System.out.println("The lenght of message" +m+ "is" m.length());
		System.out.println("Test".toLowerCase());
		
		System.out.println("Enter : ");
		Scanner input = new Scanner(System.in);
		
		String s4 = input.nextLine();
		String s2 = input.next();
		String s3 = input.next();
		
		System.out.println(s4);
		System.out.println(s2);
		System.out.println(s3);
		//String s2 = input.next();
		
		
	}
}
