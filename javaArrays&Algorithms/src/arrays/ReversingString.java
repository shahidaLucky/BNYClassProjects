package arrays;

public class ReversingString {

	public static void main(String[] args) {
		String myString = "I Love Java";
		StringBuilder reverseString = new StringBuilder();

		String[] words = myString.split(" ");

		for (int i = 0; i < words.length; i++) {
			String reverseWord = new StringBuilder(words[i]).reverse().toString(); // step 2
			reverseString.append(reverseWord + " ");
		}
//reverseString.setCharAt(2,  'm');
		System.out.println(reverseString.toString().trim());

		//Another way 
		
//		String string = "Java Basics";
//		StringBuilder sb = new StringBuilder();
//		for(int i = string.length()-1;i>=0; i++) {
//			sb.append(string.charAt(i));
//		}System.out.println(sb.toString());
	}

}
