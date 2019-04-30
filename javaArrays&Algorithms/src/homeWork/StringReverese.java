package homeWork;

public class StringReverese {

	public static void main(String[] args) {
		String s = "Hello Welcome To Java World";
		String strArray[]= s.split(" ");
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				sb.insert(i, " ");
			}
		}
		sb.append("");
		System.out.println(sb);
	}
}
