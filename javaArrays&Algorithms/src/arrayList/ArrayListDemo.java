package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> students = new ArrayList<String>();
		students.add("Lucy");
		students.add("Vernon");
		students.add("Lucy");

		System.out.println(students.size());
		System.out.println(students);

		students.remove("Lucy");
		System.out.println(students);

		students.add(0, "Nilda");
		System.out.println(students);

		students.add(1, "Shahparan");
		System.out.println(students);

		System.out.println(students.get(0)); // getting element by index
		System.out.println(students.indexOf("Nilda"));

		students.add("Shahparan");
		System.out.println(students);

		System.out.println(students.contains("Shahparan"));
		System.out.println(students.lastIndexOf("Nilda"));

		System.out.println(students.set(1, "Marcial"));// replacing shahparan by marcial at index 1.
		System.out.println("List: " + students);// replacing

		// List to Array Conversion
		System.out.println("\n####----------- Converting List to Array  --------- #######");
		String[] arr = new String[students.size()];
		students.toArray(arr);
		System.out.println("List to Array: " + Arrays.toString(arr));

		// Array to List Conversion
		System.out.println("\n####-----------  Converting Array to List  --------- #######");
		List<String> newList = new ArrayList<String>();
		newList = Arrays.asList(arr);
		System.out.println("Array to List: " + newList);

		// List is only for Objects
		Integer[] numbers = { 1, 2, 3, 4 };
		List<Integer> numList = new ArrayList<>();
		numList = Arrays.asList(numbers);
		System.out.println("int to list" + numList);

		int x = 5;
		Integer y = 5;

		char a = 'a';// convering Primitives to Cgaracter phass
		Character b = 1;

		a = b; // un-boxing

		// Wrapper Class ----> un-coxing
		// Primitives -------------Wrapper class ----->

		// Removing all elements
		// students.clear();
		// System.out.println(students);

		// print all element using Lambda exp.
		students.forEach(p -> {
			System.out.println(p);
		}); // Doing Iteration using Lambda expression -- (P is for printing )

		// Add List to list
		System.out.println("\n####-----------  Add List to List  --------- #######");
		List<String> ins = new ArrayList<String>();
		ins.add("Shahparan");
		ins.add("Young");
		students.addAll(ins);
		System.out.println(students);
		// generic but can add all types of object
		System.out.println("\n####-----------  Generic can add all type of Object  --------- #######");
		List<Object> rIT = new ArrayList<>();
		rIT.add(2);
		rIT.add("String");
		System.out.println(rIT);

	}

}
