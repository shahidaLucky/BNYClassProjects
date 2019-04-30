package bookAndAuthor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {

		Author a1 = new Author(001, "Gary Cornell", "gary@gmail.com");
		Author a2 = new Author(002, "Allen", "allen@gmail.com");
		Author a3 = new Author(003, "Evan", "evan@gmail.com");
		Author a4 = new Author(004, "Gorge", "gorge@gmail.com");
		
		
		List<Author> authorLists = new ArrayList<Author>();
		authorLists.add(a1);
		authorLists.add(a2);

		a1.printAuthor();

		Books b1 = new Books(01, 1234, "Core Java");
		Books b2 = new Books(02, 2345, "Python");
		Books b3 = new Books(03, 4345, "JavaScript");
		Books b4 = new Books(04, 6745, "HTML");

		List<Books> bList = new ArrayList<Books>();
		bList.add(b2);
		bList.add(b3);
		bList.add(b4);

		// List of book for author1
		List<Books> bListA1 = new ArrayList<Books>();
		bList.add(b1);
		bList.add(b2);

		// List of book for author2
		List<Books> bListA2 = new ArrayList<Books>();
		bList.add(b3);
		bList.add(b4);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which book you want to drop? ");
		String dropBString = input.nextLine();
		a1.dropBooks(dropBooks);
		//s1.dropCourse(dropCourse);

	}

}
