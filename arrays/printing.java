package revice_java.arrays;
import java.util.*;
public class printing {
    public static void main(String[] args){ 
        Scanner vv=new Scanner(System.in);
        System.out.print("please enter the size :");
        int size=vv.nextInt();
int[] marks=new int[size];
System.out.println("please the array values :");
for(int i=0;i<size;i++){
    marks[i]=vv.nextInt();
}
System.out.println("please some to search ");
int x=vv.nextInt();

for(int i=0;i<size;i++){
   if (x==marks[i]){
    System.out.println("it is present at line:"+(i+1));
   } 
}
    }
}
