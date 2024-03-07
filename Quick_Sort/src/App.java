/**
 * Time complexity analysis:
 *   - Best case: O(n log n) when the pivot choices consistently divide the array evenly.
 *   - Worst case: O(n^2) when the pivot choices consistently result in uneven division.
 *   - Average case: O(n log n).
 * 
 * Quicksort is a divide-and-conquer algorithm that partitions the array based on a pivot element.
 * The efficiency of the algorithm highly depends on the pivot selection strategy.
 * In the average case, the algorithm has a time complexity of O(n log n), making it more efficient
 * than O(n^2) algorithms like Insertion Sort for large datasets.
 */
 
public class App {
    public static void main(String[] args) {
        int []arr = {4,8,3,6,2,10,25,24,23,22,21,66,666};
        qsort(arr, 0, arr.length - 1);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void qsort(int[] arr, int start, int end){
        if(end <= start) return;

        int pivot = partition(arr, start, end);
        qsort(arr, start, pivot -1);
        qsort(arr, pivot + 1, end);
    }

    public static int partition(int arr[], int start,int end){
        int pivot = arr[end];
        int i = start - 1;
        
        for(int j = start; j <= end - 1; j++){
            if(arr[j] <= pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        i++;
        int tmp = arr[i];
        arr[i] = arr[end];
        arr[end] = tmp;
        
        return i;
    }
}
