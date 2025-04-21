
import java.util.*;
public class funtion {
    private static int myfunc(int a,int b){
     
        return   a+b;
    }
    public static void main(String[ ] args){
        Scanner vv=new Scanner(System.in);
System.out.print("enter a vlaue :");
      int a=vv.nextInt();
      System.out.print("enter a vlaue :");
      int b=vv.nextInt();
   
       System.out.println("the sum of two numbers are :"+ myfunc(a,b));
    }
}
