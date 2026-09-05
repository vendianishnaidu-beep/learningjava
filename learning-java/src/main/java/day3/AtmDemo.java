package day3;
import java.util.*;
public class AtmDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your balance : ");
        double balance = sc.nextDouble();
        System.out.println("enter your withdrawal amount : ");
        double amount = sc.nextDouble();
        if (amount <= balance) { // condition: true here
            System.out.println("Please collect your cash: Rs." + amount);
            balance = balance - amount;
        }
        else {
            IO.println("insufficient amount");
        }
        System.out.println(" you have Balance: Rs." + balance);
    }
}
