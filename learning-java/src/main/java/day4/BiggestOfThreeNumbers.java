package day4;

public class BiggestOfThreeNumbers {

    static void main() {

        int num1 = 10;
        int num2 = 28;
        int num3 = 25;
        int big = biggest(num1, num2, num3);
        IO.println("Biggest of " + num1 + "," + num2 + " and " + num3 + " is " + big);
    }
    private static int biggest(int num1, int num2, int num3) {
        //return (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
        return Math.max(Math.max(num1,num2),num3);
    }
}
