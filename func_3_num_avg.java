
import java.util.*;
public class func_3_num_avg {
    public static int avarage(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner vv=new Scanner(System.in);
        System.out.print("enter a vlaue :");
        int a=vv.nextInt();
        System.out.print("enter a vlaue :");
        int b=vv.nextInt();
        System.out.print("enter a vlaue :");
        int c=vv.nextInt();
        System.out.println("the average of three numbers are :"+ avarage(a,b,c));
        
    }
}
