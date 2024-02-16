/**
 * Bubble Sort algorithm.
 * Worst Case Time Complexity: O(n^2)
 * Best Case Time Complexity: O(n)
 * Note: Bubble Sort is not optimal for large datasets.
 */

public class App {

    public static void main(String[] args) {
        int []arr = {4,8,3,6,2,10,25,24,23,22,21,66,666};
        bsort(arr);

        for(int i : arr){
            System.out.println(i);
        }

    }

    public static void bsort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    
}