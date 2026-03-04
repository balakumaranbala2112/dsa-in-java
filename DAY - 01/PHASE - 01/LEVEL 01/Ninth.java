import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || ch >= 'a' && ch <= 'z') {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Its a Vowel");
            } else {
                System.out.println("It is a Consonant");
            }
        } else {
            System.out.println("Not an alphabet character");
        }
        sc.close();
    }
}