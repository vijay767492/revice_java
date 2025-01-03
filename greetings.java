package revice_java;
import java.util.Scanner;

public class greetings {


    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=ss.nextLine();
        System.out.println("Hello "+name);
        
    }
}
