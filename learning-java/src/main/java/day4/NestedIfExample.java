package day4;
import java.util.Scanner;

public class NestedIfExample {

    static void main() {

        // Discount calculation: Accept bill amount from the user; if amount 1 to 10000 -> 10%,
        // 10001 to 20000 -> 20%, >20000 -> 30%, and if user has membership then give extra 5% discount

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double amount = sc.nextDouble();

        System.out.print("Do you have membership? (yes/no): ");
        String membership = sc.next();

        double discountPercent = 0;

        if (amount >= 1) {
            if (amount <= 10000) {
                discountPercent = validateAndCalculateMembershipDiscount(10, membership);
            } else if (amount <= 20000) {
                discountPercent = validateAndCalculateMembershipDiscount(20, membership);
            } else {
                discountPercent = validateAndCalculateMembershipDiscount(30, membership);
            }

            double discountAmount = amount * discountPercent / 100;
            double finalAmount = amount - discountAmount;

            System.out.println("Bill amount     : " + amount);
            System.out.println("Discount        : " + discountPercent + "%");
            System.out.println("Discount amount : " + discountAmount);
            System.out.println("Final amount    : " + finalAmount);
        } else {
            System.out.println("Invalid bill amount.");
        }

        sc.close();
    }

    private static double validateAndCalculateMembershipDiscount(double discount, String membership) {
        if ("yes".equalsIgnoreCase(membership)) {
            discount += 5;
        }
        return discount;
    }
}