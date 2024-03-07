/**
 * Time complexity analysis:
 *   - Best case: O(n) when the array is already sorted.
 *   - Worst case: O(n^2) when the array is sorted in reverse order.
 *   - Average case: O(n^2).
 * 
 * Note that Insertion Sort is efficient for small datasets due to its simplicity,
 * but it can become inefficient for large datasets due to its quadratic complexity.
 */ 


public static void insertionSort(int[] arr){
    for(int i = 1; i < arr.length;i++){
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}