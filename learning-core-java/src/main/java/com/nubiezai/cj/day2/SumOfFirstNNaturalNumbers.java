package com.nubiezai.cj.day2;

import java.util.Scanner;

/**
 *  class has main method, which accept n value from the user and finds sum of first 'n' natural numbers
 */
public class SumOfFirstNNaturalNumbers {

    static void main() {

        Scanner sc  = new Scanner(System.in);
        IO.println("Enter the N value :");
        int n = sc.nextInt();
        int sum = (n * (n + 1))/2;
        IO.println("The sum of first "+n+" natural numbers is :"+sum);

    }
}


