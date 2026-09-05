package day5;

import java.util.Scanner;

public class BreakExample {

    static void main() {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            IO.println(i);
        }
    }
}
