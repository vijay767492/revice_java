package revice_java.sorting;

public class bubble {
    public static void main(String[] args) {
        int[] arr={3,23,43,12,65,7,8,34,4,40,43};
for(int i=0;i<=arr.length-1;i++){
    for(int j=0;j<arr.length-i-1;j++){
if(arr[j]>arr[j+1]){
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
           }

       }
  }
 for (int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}

}
    
}
