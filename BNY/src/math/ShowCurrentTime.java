package math;

public class ShowCurrentTime {

	public static void main(String[] args) {
		
		// Obtain the total miliseconds since midnight, January 1, 1970
		
	long totalMiliSeconds = System.currentTimeMillis();
	
	//Obtain the total secons since midnight, Jan 1, 1971
	long totalSeconds = totalMiliSeconds/1000;
	
	// Compute the current second in the minute in the hour
	 long currentSecond = (int)(totalSeconds % 60);
	 // Obtain the total minutes
	 long totalMinutes = totalSeconds / 60;
	 // Compute the current minute in the hour
	 long currentMinute = (int)(totalMinutes % 60);
	 // Obtain the total hours
	 long totalHours = totalMinutes / 60;
	 // Compute the current hour
	 long currentHour = (int)(totalHours % 24);
	 // Display results
	 System.out.println("Current time is " + currentHour + ":"
	 + currentMinute + ":" + currentSecond + " GMT");

	}

}
