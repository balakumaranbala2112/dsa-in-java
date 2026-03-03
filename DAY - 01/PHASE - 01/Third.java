// Check if a number is divisible by 5. 

import java.util.Scanner;

public class Third {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int num = sc.nextInt();

    if ( num % 5 == 0 ) {
        System.out.println("The Number is Divisible By 5");
    } else {
        System.out.println("The Number is Not Divisible By 5");
    }
    sc.close();
 }   
}
