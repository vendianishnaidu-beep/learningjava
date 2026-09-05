package day5;

import java.util.Scanner;

public class MultiplicationOfTable {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Enter the num:");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            IO.println(num + " * " + i + " = " + num * i);
        }
    }
}
