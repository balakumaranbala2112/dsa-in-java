
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No: ");
        int num = sc.nextInt();

        int ones = num % 10;
        System.out.println(ones);
        int tens = (num / 10) % 10;
        System.out.println(tens);
        int hundreds = num / 100;
        System.out.println(hundreds);

        if (tens > ones && tens > hundreds) {
            System.out.println("Middle is Greater");
        } else if ((tens < ones) && (tens < hundreds)) {
            System.out.println("Less");
        } else {
            System.out.println(
                    "Neither");
        }

        sc.close();
    }
}