package day4;

import java.util.Scanner;

public class IncomeTaxCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        }
        else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        }
        else if (income <= 1000000) {
            tax = (250000 * 0.05)
                    + ((income - 500000) * 0.10);
        }
        else if (income <= 3000000) {
            tax = (250000 * 0.05)
                    + (500000 * 0.10)
                    + ((income - 1000000) * 0.20);
        }
        else {
            tax = (250000 * 0.05)
                    + (500000 * 0.10)
                    + (2000000 * 0.20)
                    + ((income - 3000000) * 0.30);
        }

        System.out.println("Your income = ₹" + income);
        System.out.println("Your income tax = ₹" + tax);

        sc.close();
    }
}
