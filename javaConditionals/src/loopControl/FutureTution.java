package loopControl;

public class FutureTution {

	public static void main(String[] args) {
		double tuition = 10000; 
		 int year = 0;
		 while (tuition < 20000) {
		 tuition = tuition * 1.07;
		 year++;
		 }

		 System.out.println("Tuition will be doubled in "
		 + year + " years"); 

	}

}
