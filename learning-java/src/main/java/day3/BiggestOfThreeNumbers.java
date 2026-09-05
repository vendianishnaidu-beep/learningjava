package day3;
import java.util.*;
public class BiggestOfThreeNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 value : ");
        int num1 = sc.nextInt();
        System.out.println("enter the num2 value : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3 value : ");
        int num3 = sc.nextInt();


        if(num1 > num2 && num1 > num3){
            System.out.println("Biggest of  number among three numbers  is  : "+num1);
        }else if(num2 > num3){
            System.out.println("Biggest of  number among three numbers  is  : "+num2);
        }else{
            System.out.println("Biggest of  number among three numbers is  : "+num3);
        }
    }
}
