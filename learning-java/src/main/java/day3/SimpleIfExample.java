package day3;

import java.util.Scanner;

public class SimpleIfExample {

    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Enter the age :");
        int age = sc.nextInt();

        if (age < 0) {
            age = -age;
        }
        IO.println("Entered age is :" + age);
    }
}
