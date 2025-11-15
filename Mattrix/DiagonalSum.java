package Mattrix;

public class DiagonalSum {
    public static void diagonalSum (int matrix[][]){
        int sum = 0;
        for (int i=0; i<matrix.length; i++){
            sum += matrix[i][i];

            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("Total Sum is: " + sum);
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
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        print(matrix);
        diagonalSum(matrix);
    }
}
