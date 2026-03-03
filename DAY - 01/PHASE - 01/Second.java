// Check if a number is even or odd.

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
           System.out.println("The number is Odd"); 
        }
        sc.close();
    }
}
