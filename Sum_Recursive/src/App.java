import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int []arr = {2,4,6};
        System.out.println(sumRecursive(arr));
    }

    public static int sumRecursive(int []arr){
        if(arr.length == 0){
            return 0;
        }
        else{
            return arr[0] + sumRecursive(Arrays.copyOfRange(arr,1,arr.length));
        }
    }
}
