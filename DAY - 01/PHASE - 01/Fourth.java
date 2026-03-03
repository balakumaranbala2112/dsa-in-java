// Check if a number is divisible by BOTH 3 and 5.

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The No. is Divisible by Both 3 and 5");
        } else if (num % 3 == 0) {
            System.out.println("The No. is Only divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println("The No. is Only divisible by 5");
        } else {
            System.out.println("The No. is Not divisible by Both");
        }
        sc.close();
    }
}
