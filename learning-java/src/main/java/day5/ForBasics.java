package day5;

public class ForBasics {

    static void main() {
        // Count upto 1 -> 5
        for (int i = 1; i <= 5; i++) {
            IO.print(i + " ");
        }
        IO.println();

        // Count down 10 -> 1

        for (int i = 10; i >= 1; i--) {
            IO.print(i + " ");
        }
        IO.println();

        // Step of 5 multiples of 5 upto 50

        for (int i = 5; i <= 50; i += 5) {
            IO.print(i + " ");
        }
        IO.println();

    }
}