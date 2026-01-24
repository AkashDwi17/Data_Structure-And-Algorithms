package Pattern;
import java.util.*;

public class _11SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter Number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                System.out.print ("* ");
            }
            for (int j=1; j<=i-1+1; j++){
                System.out.print (" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
