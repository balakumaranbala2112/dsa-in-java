//Take a number and print whether it’s positive, negative, or zero.

import java.util.Scanner;

class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
         
        if (num > 0) {
            System.out.println("The Number is Positive");
        } else if (num < 0) {
            System.out.println("The Number is Negative"); 
        } else {
            System.out.println("The No. is Zero."); 
        }
        scanner.close();
    }
}