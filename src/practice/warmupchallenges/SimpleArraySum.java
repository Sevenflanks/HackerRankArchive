package practice.warmupchallenges;

import java.util.Scanner;
import java.util.stream.Stream;

public class SimpleArraySum {

    public static void main(String[] args) {

        try(Scanner scan = new Scanner(System.in)) {
            scan.nextLine();
            System.out.println(Stream.of(scan.nextLine().split(" ")).mapToInt(Integer::valueOf).sum());
        }

    }

}
