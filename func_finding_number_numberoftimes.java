package revice_java;
import java.util.*;
public class func_finding_number_numberoftimes {
    // public static numbers(int pov,int neg,int zero){

    // }
public static void main(String[] args) {
  
    int pov=0;
    int neg=0;
    int zero=0;

    while(true){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number (or type 'exit' to quit): ");
        if (sc.hasNext("exit")){
            break;}

       if (sc.hasNextInt()){
        int num=sc.nextInt();
            if (num>0){
                pov++;
            }
            else if (num<0){
                neg++;
            }
            else if (num==0){
                zero++;

            }
           } else{
            System.out.println("Invalid input. Please enter a number.");
        }
    System.out.println("Number of positive numbers: "+pov);
    System.out.println("Number of negative numbers: "+neg);
    System.out.println("Number of zeros: "+zero);
}
    }

}