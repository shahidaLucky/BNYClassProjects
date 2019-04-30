package arrays;

import java.util.Arrays;

public class SubjectString {

	public static void main(String[] args) {
		String subjects = "Math, English, Law";
		//String delimieterString = "|";
		String delimiter = ",";
	
		subjects = subjects.replaceAll("\\s*\\|\\s*", " ");
		String [] subjectArr = subjects.split(delimiter);
		
		System.out.println(Arrays.deepToString(subjectArr));
		
		

	}

}
