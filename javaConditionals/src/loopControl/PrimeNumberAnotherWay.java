package loopControl;

public class PrimeNumberAnotherWay {

	public static void main(String[] args) {
		int num = 2;
		int divisor = 0;
		int count = 0;
		System.out.println("The first 20 prime numbers are: ");
		
		while(count <20) {
			for(int i =2; i<=num; i++) {
				if((num%i)== 0) {
					divisor++;
				}
			}
			if(divisor == 1) { // (divisor>1) will make the code to get the numbers who are not prime.
				System.out.println(num);
			}
			num++;
			divisor = 0;
		}

	}

}
