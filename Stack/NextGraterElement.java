package Stack;
import java.util.*;

public class NextGraterElement {

    // Next Grater Right
    public static void nextGraterRight (int arr[], int nextGraterRight[]){
        Stack <Integer> s = new Stack<>();
        for (int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nextGraterRight[i] = -1;
            }else{
                nextGraterRight[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    // Next Greater Left
    public static void nextGraterLeft (int arr[], int nextGreaterLeft[]){
        Stack <Integer> s = new Stack<>();
        for (int i=0; i<arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nextGreaterLeft[i] = -1;
            }else{
                nextGreaterLeft[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    // Next Smaller Right 
    public static void nextSmallerRight (int arr[], int nextSmallerRight[]){
        Stack <Integer> s = new Stack<>();
        for (int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()]>arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nextSmallerRight[i] = -1;
            }else{
                nextSmallerRight[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    // Next Smaller Left 
    public static void nextSmallerLeft (int arr[], int nextSmallerLeft[]){
        Stack <Integer> s = new Stack<>();
        for (int i=0; i<arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nextSmallerLeft[i] = -1;
            }else{
                nextSmallerLeft[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    // Print
    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        print(arr);

        int nextGraterRight[] = new int[arr.length];
        nextGraterRight (arr, nextGraterRight);
        for (int i=0; i<nextGraterRight.length; i++){
            System.out.print (nextGraterRight[i]+" ");
        }
        System.out.println();


        int nextGraterLeft[] = new int[arr.length];
        nextGraterLeft (arr, nextGraterLeft);
        for (int i=0; i<nextGraterLeft.length; i++){
            System.out.print (nextGraterLeft[i]+" ");
        }
        System.out.println();
        

        int nextSmallerLeft[] = new int[arr.length]; 
        nextSmallerLeft (arr, nextSmallerLeft);
        for (int i=0; i<nextSmallerLeft.length; i++){
            System.out.print (nextSmallerLeft[i]+" ");
        }
        System.out.println();


        int nextSmallerRight[] = new int[arr.length];
        nextSmallerRight (arr, nextSmallerRight);
        for (int i=0; i<nextSmallerRight.length; i++){
            System.out.print (nextSmallerRight[i]+" ");
        }
        System.out.println();


        
    }
}
