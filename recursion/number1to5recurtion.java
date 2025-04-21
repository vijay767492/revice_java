

public class number1to5recurtion {
    public static void numbers(int n){
        if(n==6){
            return;
        }
        System.out.println(n);

numbers(n+1);

    }
    public static void main(String[] args) {
        numbers(1);
    }
}
