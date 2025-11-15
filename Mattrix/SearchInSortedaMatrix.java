package Mattrix;

public class SearchInSortedaMatrix {
    public static void searchInSortedaMatrix (int matrix[][], int key){
        int start = 0;
        int end = matrix[0].length-1;

        while (start < matrix.length && end >=0){
            if (matrix[start][end] == key){
                System.out.print ("Key found at index: " + start +", "+ end);
                return;
            }
            if (matrix[start][end] > key){
                end --;
            }else{
                start ++;
            }
        }
        System.out.println("Not Found !");
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50},
        };
        searchInSortedaMatrix(matrix, 93);
        searchInSortedaMatrix(matrix, 37);
    }
}
