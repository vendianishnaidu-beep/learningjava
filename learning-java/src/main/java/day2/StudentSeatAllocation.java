package day2;

import java.util.Scanner;

public class StudentSeatAllocation {

    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter the no of students :");
        int count = sc.nextInt();
        System.out.println("Enter the room capacity :");
        int capacity = sc.nextInt();
        int requiredRoomsCount = count / capacity;
        if(count % capacity != 0){
            requiredRoomsCount++;
        }
        System.out.println("To accommodate "+count+" student(s) with room capacity "+capacity+" required rooms are  "+requiredRoomsCount);
    }
}
