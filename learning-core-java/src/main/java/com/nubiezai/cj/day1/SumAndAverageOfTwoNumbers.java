package com.nubiezai.cj.day1;

import java.util.Scanner;

public class SumAndAverageOfTwoNumbers {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num1 :");
        int num1 = sc.nextInt();

        System.out.println("Enter the num2 :");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        float avg = sum / 2.0f;

        System.out.println("The sum of "+num1+" and "+num2 +" is "+sum+" and average is "+avg);
    }
}
