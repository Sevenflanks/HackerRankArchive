package tutorials.daysofcode30;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {

		try(Scanner scan = new Scanner(System.in)) {
			double mealCost = scan.nextDouble(); // original meal price
			int tipPercent = scan.nextInt(); // tip percentage
			int taxPercent = scan.nextInt(); // tax percentage

			int totalCost = (int) Math.round(
					mealCost +
					(mealCost * tipPercent / 100) +
					(mealCost * taxPercent / 100)
			);

			// Print your result
			System.out.println("The total meal cost is " + totalCost + " dollars.");
		}
	}

}
