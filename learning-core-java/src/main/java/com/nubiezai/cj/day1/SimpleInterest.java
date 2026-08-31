package com.nubiezai.cj.day1;

import java.util.Scanner;

public class SimpleInterest {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate of interest (%): ");
        double rate = sc.nextDouble();


        System.out.print("Enter time (years): ");
        double time = sc.nextDouble();


        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal amount   :"+principal);
        System.out.println("Interest reate %   :"+rate);
        System.out.println("Time in year       :"+time);
        System.out.println("Simple Interest is :"+simpleInterest);

    }
}
