
public class insertion_sort {
    public static void sorting(int[] arr){
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
                while(j >= 0 && arr[j] > temp) {
                    
                    arr[j+1] = arr[j];
                    j--;
                }
            arr[j+1] = temp;z
        }
 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr={21,32,22,7,9,31,10,11,10};
        System.out.println("before incertion sorting  the array");
        for (int i=0;i<=arr.length-1;i++){
System.out.print(arr[i]+" ");
        } 
        System.out.println();
        System.out.println("after sorting ");
       sorting(arr);
       
    }
}
