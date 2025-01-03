package revice_java;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner vv = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = vv.nextInt(); 

        // Loop for each row
        for (int i = 0; i < a; i++) {
            // Print '1' for the first column
            System.out.print("1 ");
            // Loop to print '2's for the remaining columns
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("2 "); // Print '2' with a space
            }
            // Move to the next line after each row
            System.out.println();
        }

        // No scanner close
        vv.close(); // This line is  
    }
}