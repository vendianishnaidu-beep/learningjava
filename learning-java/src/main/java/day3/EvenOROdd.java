package day3;
import java.util.*;

public class EvenOROdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter the num :");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            IO.println("Given number " + num + " is EVEN");
        } else {
            IO.println("Given number " + num + " is ODD");
        }
    }
}
