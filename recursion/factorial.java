

public class factorial {
    public static int  factorial1(int n){
        if(n==1||n==0){
            return 1;
        }
        

int factn1=factorial1(n-1)*n;
return factn1; 

    }
    public static void main(String[] args) {
        
        System.out.println(factorial1(5));
    }
}
