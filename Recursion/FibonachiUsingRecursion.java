import java.util.*;

public class FibonachiUsingRecursion {
    public static int findFibonachi (int n){
        if (n == 1 || n == 2){
            return n;
        }
        int fnm1 = findFibonachi(n-1);
        int fnm2 = findFibonachi(n-2);

        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(findFibonachi(5));
    }
}