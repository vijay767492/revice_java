

public class sum_of_natural_numbers {
    public static void sum1(int i,int n,int sum){ 

        if(i==n){
       sum =sum+i;
       System.out.println(sum);
       return;
    }
    sum=sum+i;
    System.out.println(sum);

sum1(i+1,n,sum);

}  
public static void main(String[] args) {
    sum1(1,5,0);
}
}