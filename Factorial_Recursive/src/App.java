public class App {
    public static void main(String[] args)  {
        System.out.println(factorialRecursive(5));
    }

    public static int  factorialRecursive(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n * factorialRecursive(n - 1);
        }
    }
}
