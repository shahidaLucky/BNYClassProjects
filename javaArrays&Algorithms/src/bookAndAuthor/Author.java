package bookAndAuthor;

import java.util.List;

public class Author {

	int authorId;
	String authorName;
	String authorEmail;
	// list for books
	List<Books> aBooks;

	public Author(int authorId, String authorName, String authorEmail) { // constructor
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorEmail = authorEmail;
	}

	void dropBooks(String dropBooks) {

		boolean deleted = false;

		for (int i = 0; i < aBooks.size(); i++) {
			// System.out.println("for: " + aBooks.get(i).bookName);
			if (aBooks.get(i).bookName.equals(dropBooks)) {
				aBooks.remove(aBooks.get(i));
				deleted = true;
			}
		}
		if (deleted) {
			System.out.println(dropBooks + ": Removed successfully");
		} else {
			System.out.println(dropBooks + " : The Book you are trying to drop is not in your list ! ");
		}
	}
	
	void findAuthor(String author, List<Author> authorList) {
		boolean found = false;
		for(int i=0; i<authorList.size(); i++) {
			if(authorList.get(i).authorName.equals(author)) {
				found = true;
			}
		}
		if(found) {
			System.out.println(" ! Found");
		}else {
			System.out.println("! Not found");
		}
		
	}

	// method to print
	void printAuthor() {
		System.out.println("The Author ID is :" + authorId);
		System.out.println("The Author is : " + authorName);
		System.out.println("Email is :" + authorEmail);
		for (Books b : aBooks) { // enhance for loop
			System.out.println("The books  are : " + b.bookName);
		}

	}

}
