package revice_java;
import java.util.*;

public class StartPattern {
    public static void main(String[] args) {
        Scanner vv=new Scanner(System.in);
        System.out.println("please enter the number of rows");
        int number = vv.nextInt();
        for (int i = 1; i <= number; i++) {
          
            for (int j=0;j<number;j++){
                System.out.print("*");
            }
            System.out.println();
            }
           
        }
    }
