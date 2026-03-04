//Take three sides and check if they form a valid triangle. 

import java.util.Scanner;

class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Sides");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Please Fill the valid Numbers Greater tha 0");
        } else {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("They Form a Valid Triangle");
            } else
                System.out.println("The Not Form the Triangle");
        }
        sc.close();
    }
}