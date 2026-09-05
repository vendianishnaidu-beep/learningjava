package day4;

import java.util.Scanner;

public class ElectricityBillCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of units:");
        int units = sc.nextInt();

        // 1 to 100 = 2 rupees
        // 101 to 200 = 3 rupees
        // 201 to 300 = 5 rupees
        // Above 300 = 7 rupees

        int amount = 0;

        if (units <= 100) {
            amount = units * 2;
        }
        else if (units <= 200) {
            amount = (100 * 2) + ((units - 100) * 3);
        }
        else if (units <= 300) {
            amount = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }
        else {
            amount = (100 * 2) + (100 * 3) + (100 * 5)
                    + ((units - 300) * 7);
        }

        System.out.println("Your total units = " + units);
        System.out.println("Your total bill = ₹" + amount);

        sc.close();
    }
}
