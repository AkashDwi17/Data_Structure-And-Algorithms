package Mattrix;
import java.util.*;

public class createMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Matrix Row: ");
        int n = sc.nextInt();

        System.out.print("Enter Matrix Col: ");
        int m = sc.nextInt();

        int matrix[][] = new int [n][m];
        System.out.print ("Enter row and column digit");
        for (int  i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
