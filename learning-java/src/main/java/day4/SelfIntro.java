package day4;
import java.util.*;
public class SelfIntro {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter your name : ");
        String name = sc.next();
        IO.println("Enter your age : ");
        int age = sc.nextInt();
        IO.println("Enter your village : ");
        String village = sc.next();



        IO.println("hi "  + name +  " your name is "+name+  " and your age is "+age+  " and your village is "+village);
    }
}
