import java.util.*;

public class Main {
    public static void findFirstNegativeNumber (int arr[], int k){
        List<Integer> list = new ArrayList<>();
        Deque <Integer> dq = new LinkedList<>();

        int i = 0, j = 0;
        while (j<arr.length){
            if (arr[j] < 0){
                dq.addLast(j);
            }

            if ((j-i+1) < k){
                j++;
            }
            else if ((j-i+1) == k){
                if (!dq.isEmpty()){
                    list.add(arr[dq.peekFirst()]);
                }else{
                    list.add(0);
                }
                if (!dq.isEmpty() && dq.peekFirst() == i){
                    dq.removeFirst();
                }
                i++;
                j++;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        findFirstNegativeNumber(arr, k);
    }
}
