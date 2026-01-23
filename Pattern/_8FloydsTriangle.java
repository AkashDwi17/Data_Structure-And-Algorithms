package Pattern;

import java.util.Scanner;

public class _8FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter Number: ");
        int n = sc.nextInt();

        int count = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print (count+" ");
                count ++;
            }
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
