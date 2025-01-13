package revice_java.sorting;

public class selection {
    public static void printing(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={3,23,43,12,65,7,8,34,4,40,43};
        for (int i=0; i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }

            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        printing(arr);
    }
}
