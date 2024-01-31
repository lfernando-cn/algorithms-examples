import java.util.Arrays;

public class App {
    public static void main(String[] args){
        int []arr = {3,4,6,8,0,1};
        System.out.println(counterRecursive(arr));
    }

    public static int counterRecursive(int []arr){
        if(arr.length == 0){
            return 0;
        }
        else{
            return 1 + counterRecursive(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
}
