package revice_java;
import java.util.*;
public class func_power_of_number {
    public static int power (int a,int b){
        int tem=a;
for (int i=1;i<b;i++){
    tem=tem*a;
}return tem;
    }
    public static void main(String[] args) {
        Scanner vv=new Scanner(System.in);
        System.out.print("please enter the number a :");
        int a=vv.nextInt();
        System.out.print("please enter the number b to be the power of a :");
        int b=vv.nextInt();
        System.out.print("the power of a is  :"+power(a,b));
    }
}
