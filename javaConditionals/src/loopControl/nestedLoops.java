package loopControl;

public class nestedLoops {

	public static void main(String[] args) {
	for(int i=1; i<=5; ++i) {
		System.out.println("This is Outer Loop");
		for(int j=1; j<=2; ++j) {
			System.out.println("**********This is Inner Loop");
		}
	}
	}
}
