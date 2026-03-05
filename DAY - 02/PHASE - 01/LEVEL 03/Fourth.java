

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both are Even");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both are odd");
        } else if (num1 % 2 == 0 || num2 % 2 == 0) {
            System.out.println("One is even and One is Odd");
        }
        sc.close();
    }
}
