package Java_DSA;

public class SecondLargestNumber {
	public static void secondLargest (int arr[]) {
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > largest) {
				secLargest = largest;
				largest = arr[i];
			}else if (largest > arr[i] && arr[i] > secLargest) {
				secLargest = arr[i];
			}
		}
		System.out.println(secLargest);
	}
	public static void main(String[] args) {
		int arr[] = {1,3,5,4,2,8,6,9,9,9,9};
		secondLargest(arr);
	}
}
