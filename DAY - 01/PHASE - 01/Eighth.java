//Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
public class Eighth {
    public static void main(String[] args) {
        int temp = 16;

        if (temp <= 15) {
            System.out.println("Its Cold");
        } else if (temp <= 30) {
            System.out.println("Its Warm");
        } else {
            System.out.println("Its Hot");
        }
    }
}
