package day5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

    static void main() {

        int gnum = ThreadLocalRandom.current().nextInt(1, 7);
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess the number between 1-6 only ");
            int num = sc.nextInt();
            if (gnum == num) {
                System.out.println("Congratulations, you guessed number in " + i + " attempt(s) ");
                break;
            } else {
                if (i == 3) {
                    System.out.println("Wrong Guess, Max number attempts reached. The number is "+gnum);
                } else {
                    System.out.println("Wrong guess, try again");
                }
            }
        }
        IO.println("Thanks for playing dice game.....");
    }
}
