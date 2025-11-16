package Java_DSA;
import java.util.*;

public class PushZeroAtEnd {
	
	public static void print (int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void pushZeroAtBottom (int arr[]) {
		int i = 0;
		for (int j=0; j<arr.length; j++) {
			if (arr[j] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,0,3,0,0,4,5,6,0};
		print(arr);
		pushZeroAtBottom(arr);
		System.out.println();
		print(arr);
	}
}
