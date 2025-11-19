package Java_DSA;

public class RotateArrayAtKthPosition {
	
	public static void print (int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void reverse(int arr[], int si, int ei) {
			
			while (si < ei) {
				int temp = arr[si];
				arr[si] = arr[ei];
				arr[ei] = temp;
				si ++;
				ei --;
			}
		
	}
	public  static void rotateArrayAtKthPosition (int arr[], int k) {
		int n = arr.length;
		k = k%n;
		
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		print(arr);
		reverse (arr, 0, arr.length-1);
		print(arr);
		
		rotateArrayAtKthPosition(arr, 2);
		print(arr);
	}
}
