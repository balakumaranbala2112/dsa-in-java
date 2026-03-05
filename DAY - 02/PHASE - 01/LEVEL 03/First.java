
import java.util.Scanner;

class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt(); // 123

        boolean[] seen = new boolean[10];
        // [f,f,f,f,f,f,f,f,f,f]
        boolean isDistinct = true;

        while (num > 0) {
            int digit = num % 10; // 3

            if (seen[digit]) {
                isDistinct = false;
                break;
            }
            seen[digit] = true;
            num = num / 10;
        }
        if (isDistinct) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}