
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Sides");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Please Fill the valid Numbers Greater than 0");
        } else if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Its Equilateral");
            } else if (a == b || c == a || b == c) {
                System.out.println("Isosceles");
            } else if (a != b && b != c && c != a) {
                System.out.println("This is Scalene ");
            }
        } else {
            System.out.println("The Not Form the Triangle");
        }
        sc.close();
    }
}