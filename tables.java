
import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner vv= new Scanner(System.in);
        System.out.print("please enter the table number to add all results :");
        int table=vv.nextInt();
        int result=0;
        int temp=0;
        String exp="";
        for (int i=1;i<=10;i++){
            result=(i*table);
            
System.out.println(table+" X "+i+" = "+result);

temp=temp+result;
if(i==10){
    exp+=result;
}
else{exp=exp+result+" + ";}
        }

System.out.println(exp+" = "+temp);

    }
    
}
