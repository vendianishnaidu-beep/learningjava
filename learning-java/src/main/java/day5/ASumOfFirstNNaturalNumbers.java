package day5;

import java.util.Scanner;

public class ASumOfFirstNNaturalNumbers {

    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Enter the N value :");
        int N = sc.nextInt();
        int sum = 0;
        //TODO complete logic
        sum = (N * (N + 1)) / 2;
        IO.println("The sum of first "+N+" natural numbers is :"+sum);
    }
}
