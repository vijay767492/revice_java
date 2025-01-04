package revice_java.Strings;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner vv=new Scanner(System.in);
        System.out.print("please the enter the name you want to reverse  :");
        StringBuilder sb =new StringBuilder(vv.nextLine());
      for(int i=0;i<sb.length()/2;i++){
        int front=i;
        int back=(sb.length()-1-i);  
     char frontchar=sb.charAt(front);
    char backchar=sb.charAt(back);

          sb.setCharAt(front,backchar);
        sb.setCharAt(back,frontchar);
    }  System.out.println(sb);
    }
}
