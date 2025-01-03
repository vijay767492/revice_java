package revice_java.Strings;

import java.util.Scanner;

public class campare {
    public static void main(String[] args) {
        Scanner vv=new Scanner(System.in);
        System.out.print("please enter the nam to compare :");
        String name1=vv.nextLine();
        System.out.print("please enter the nam to compare :");
        String name2=vv.nextLine();
      if (name1.compareTo(name2)==0){
        System.out.println("both names are same");
      }else{
        System.out.println("both names are not same");
      }


      System.out.println("the length of the string first string is "+name1.length());
      System.out.println("the length of the string second string is "+name2.length());
      if(name1.length()==name2.length()){
        System.out.println("both strings are of same length");
      }else{
        System.out.println("both strings are not of same length");
      }
      if(name1.compareTo(name2)==0 && name1.length()==name2.length()){  
        System.out.println("both strings are same and of same length");
    }else if(name1.length()==name2.length()){
        System.out.println("only lenth are same but strings are not same");
    }
    
}
}
