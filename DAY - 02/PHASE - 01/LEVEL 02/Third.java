// Check if a number is divisible by 5. 

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Mark: ");
        int mark = sc.nextInt();

        if (mark >= 0 && mark <= 100) {
            if (mark >= 90) {
                System.out.println("A");
            } else if (mark >= 80) {
                System.out.println("B");
            } else if (mark >= 70) {
                System.out.println("C");
            } else if (mark >= 60) {
                System.out.println("D");
            } else {
                System.out.println("fail");
            }
        } else {
            System.out.println("Enter Valid Inputs");
        }

        sc.close();
    }
}
