package day5;

import java.util.Scanner;

public class GreetingMessage {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Welcome to java world!");
        }

    }
}
