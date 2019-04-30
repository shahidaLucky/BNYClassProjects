package loopControl;

public class PrimeNumbers {

	public static void main(String[] args) {
		int primeCounter=0;
		int testNum = 2;
		while(primeCounter < 20) {
			if((testNum == 2)|| (testNum == 3) || (testNum == 5) || (testNum == 7)) {
			primeCounter++;
			System.out.println(testNum);
			}
			else if ((testNum % 2 == 0) || (testNum % 3 == 0) || (testNum % 5 == 0) || (testNum % 7 == 0)) {
				
			}else {
				primeCounter++;
				System.out.println(testNum);
			}
			testNum++;
		}
	}

}
