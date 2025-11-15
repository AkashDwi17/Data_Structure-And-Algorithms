package Mattrix;
import java.util.*;

// Search in Matrix
public class SearchFIndMaxFindMinInMatrix {
    public  static void search (int matrix[][], int key){
        for (int i=0; i<matrix.length; i++){
            for (int j=0;j<matrix[0].length; j++){
                if (matrix[i][j] == key){
                    System.out.print ("Key found at Index: " + i +", "+j);
                    return;
                }
            }
        }
        System.out.println("Key Not Found");
    }

    //Largest Number

    public static void maxNum (int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                largest = Math.max (largest, matrix[i][j]);
            }
        }
        System.out.println("Largest Number In Matrix is: " + largest);
    }


    // Smallest Number
    public static void smallestNum (int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                smallest = Math.min (smallest, matrix[i][j]);
            }
        }
        System.out.println("Smallest Number In Matrix is: " + smallest);
    }
    

    // Print Matrix
    public static void print (int matrix[][]){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print (matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int m = sc.nextInt();


        int matrix[][] = new int [n][m];

        System.out.println("Enter Matrix (row, col) Elements");

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        print(matrix);
        System.out.println();
        System.out.print("Enter Key what you want to search: ");
        int key = sc.nextInt();
        search(matrix, key);

        System.out.println();

        maxNum(matrix);

        System.out.println();

        smallestNum(matrix);
    }
}
