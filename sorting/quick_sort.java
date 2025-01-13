package revice_java.sorting;

public class quick_sort {

    // Quick sort function
    public static void quick(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the left and right subarrays
            quick(arr, low, pivotIndex - 1); // Left subarray
            quick(arr, pivotIndex + 1, high); // Right subarray
        }
    }

    // Partition function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index for smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++; // Move the smaller element's index
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {4, 26, 7, 16, 33, 12, 10, 43, 70};
        quick(arr, 0, arr.length - 1); // Call quick sort

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
