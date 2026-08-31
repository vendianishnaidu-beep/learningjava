package com.nubiezai.cj.day1;

import java.util.Scanner;

public class EMICalculator {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter loan tenure (months): ");
        int months = sc.nextInt();


        double monthlyRate = annualRate / 12 / 100;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate , months)) / (Math.pow(1 + monthlyRate , months) -1) ;

        double totalPayment = emi * months;
        double totalInterest = totalPayment - principal;

        System.out.println("\n----- EMI Details -----");
        System.out.printf("Monthly EMI      : %d%n", Math.round(emi));
        System.out.printf("Total Payment    : %d%n", Math.round(totalPayment));
        System.out.printf("Total Interest   : %d%n", Math.round(totalInterest));

        sc.close();


    }
}
