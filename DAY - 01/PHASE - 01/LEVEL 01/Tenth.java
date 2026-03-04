import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Its a Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Its a Lowercase");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Is a Digit");
        } else {
            System.out.println("Its A Special Character");
        }
        sc.close();
    }
}
