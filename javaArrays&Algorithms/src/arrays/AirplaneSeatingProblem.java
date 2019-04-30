package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class AirplaneSeatingProblem {

	public static void main(String[] args) {
		String[][] seats = { { "A1", "A2", "A3", "", "A4", "A5", "A6", "A7", "", "A8", "A9", "A10" },
				{ "B1", "B2", "B3", "", "B4", "B5", "B6", "B7", "", "B8", "B9", "B10" },
				{ "C1", "C2", "C3", "", "C4", "C5", "C6", "C7", "", "C8", "C9", "C10" },
				{ "D1", "D2", "D3", "", "D4", "D5", "D6", "D7", "", "D8", "D9", "D10" },
				{ "E1", "E2", "E3", "", "E4", "E5", "E6", "E7", "", "E8", "E9", "E10" },
				{ "F1", "F2", "F3", "", "F4", "F5", "F6", "F7", "", "F8", "F9", "F10" } };

//	String[] bookedSeats = { "A4", "A10", "C5", "D3", "E6", "F8" };
		ArrayList<String> bookedSeats = new ArrayList<String>(Arrays.asList("A4", "A10", "C5", "D3", "E6", "F8"));

		int seatRequired = 3;

		// adding empty row/road
		bookedSeats.add("");
		ArrayList<ArrayList<String>> togetherSeatContainer = new ArrayList<ArrayList<String>>();
		HashSet<String> togetherSeatContainerUnique = new HashSet<String>();
		// iterating over each row
		// bad bad bad: O (n^3)
		for (int r = 0; r < seats.length; r++) {
			// iterating over each column/seat
			for (int c = 0; c < seats[r].length; c++) {
				ArrayList<String> togetherSeats = new ArrayList<String>();
				String seat = seats[r][c];
				togetherSeats.add(seat);
				boolean isBooked = bookedSeats.contains(seat);
				if (isBooked == false) {
					// if three seat required together, we
					// If A1 is empty, we have to check next to
					for (int x = 1; x < seatRequired; x++) {
						int targetIndex = c + x;
						if (targetIndex < seats[r].length) {
							String nextSeat = seats[r][c + x];
							boolean nextIsBooked = bookedSeats.contains(seats[r][targetIndex]);
							if (nextIsBooked) {
								break;
							} else {
								togetherSeats.add(nextSeat);
							}
						}
					}
				}
				if (togetherSeats.size() >= seatRequired) {
					togetherSeatContainer.add(togetherSeats);
					togetherSeatContainerUnique.addAll(togetherSeats);
				}
			}
		}

		System.out.println("Available Orientations:");
		for (ArrayList<String> x : togetherSeatContainer) {
			System.out.println(x.toString());
		}
		System.out.println("Total Ticket Can be sold:" + togetherSeatContainerUnique.size());

	}

}
