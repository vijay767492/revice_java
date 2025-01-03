package revice_java;
import java.util.*;

public class fun_factorial {
    public static int facto(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner vv = new Scanner(System.in);
        int n;

        // Keep prompting for input until a positive number is entered
        while (true) {
            System.out.print("Please enter the number for which you want the factorial: ");
            n = vv.nextInt();

            if (n >= 0) { // Valid input
                break;
            } else {
                System.out.println("Negative number entered. Please enter a positive number.");
            }
        }

        // Calculate and display factorial
        System.out.println("The factorial of " + n + " is: " + facto(n));
    }
}
