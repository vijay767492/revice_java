
import java.util.*;
public class two_D_array {
    public static void main(String[] args) {
        System.out.print("please enter the number of rows :");
        Scanner vv=new Scanner(System.in);
        int rows=vv.nextInt();
        System.out.print("please enter the number of columns :");
        int columns=vv.nextInt();
        int [][] twoD=new int[rows][columns];
        System.out.println("please the array values :");
        for(int i=0;i<twoD.length;i++){
            for(int j=0;j<twoD[i].length;j++){
                twoD[i][j]=vv.nextInt();
            }
        }
        System.out.println("please the number you want to search int 2d array");
       
        int x=vv.nextInt();

   

    for(int i=0;i<twoD.length;i++){
        for(int j=0;j<twoD[i].length;j++){
            if(twoD[i][j]==x){
                System.out.println("it is present at row "+(i+1)+" column "+(j+1));
            }
        }System.out.println();
    }
}
    
}
