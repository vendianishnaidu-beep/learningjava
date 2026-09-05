package day5;

import java.util.Scanner;

public class AFactorialOfGivenNumber {

    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Enter the num value :");
        int num = sc.nextInt();
        int fact = 1;
        //TODO complete logic
        // 5 -> 1 * 2 * 3 * 4 * 5 => 120
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " = " + fact);

        sc.close();
    }
}


