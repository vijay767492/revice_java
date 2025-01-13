package revice_java.recursion;

public class febonocii {
    public static void printfeb(int a, int b,int n){
        if(n==0){
            return;
        }
        int c;
        c=a+b;
        System.out.println(c);
printfeb(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0;
        System.out.println(a);
        int b=1;
        System.out.println(b);
        int n=6;
        printfeb(a, b, n);
    }
    
}
