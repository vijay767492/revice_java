package revice_java;
public class number_pyramid {
    public static void main(String[] args) {
        int n=5;
       
        for(int i=1;i<=n;i++){
        
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }  
        //by reversing the pyramid we get the diamond
        // for(int i=n;i>=1;i--){
        
        //     for (int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
    }
}
