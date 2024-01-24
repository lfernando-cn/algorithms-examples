public class App {
    public static void main(String[] args) throws Exception {
        int []arr = {89,60,32,14,13,01,56};
        selectionSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }


    public static void selectionSort(int[] arr) {
        int n = arr.length;
    
        for (int i = 0; i < n - 1; i++) {
            
            int indexOfMin = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
    
            int temp = arr[indexOfMin];
            arr[indexOfMin] = arr[i];
            arr[i] = temp;
        }
    }
}
