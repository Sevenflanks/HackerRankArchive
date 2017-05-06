package tutorials.daysofcode30;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DataTypes {

    public static void main(String[] args) {

        try(Scanner scan = new Scanner(System.in)) {
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            final Pattern DOUBLE_PATTERN = Pattern.compile("\\d*+.\\d+");
            final Pattern INTEGER_PATTERN = Pattern.compile("\\d+");

            for (int j = 0; j < 3; j++) {
                String text = scan.nextLine();
                if (DOUBLE_PATTERN.matcher(text).matches()) {
                    System.out.println(d + Double.valueOf(text));
                } else if (INTEGER_PATTERN.matcher(text).matches()) {
                    System.out.println(i + Integer.valueOf(text));
                } else {
                    System.out.println(s + text);
                }

            }

        }

    }

}
