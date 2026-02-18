package PracticeSet1;

// 3️⃣ Max Consecutive Ones III
// Problem:
// You are given:
// nums = [1,1,1,0,0,0,1,1,1,1,0]
// k = 2
// You can flip at most k zeros to 1.

// 👉 Return maximum consecutive 1s possible.
// Output: 6
public class _3MaxConsecutiveOnesIII {
    public static int maxConsecutiveOnes (int arr[], int k){
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int zeroCount = 0;

        while (right < arr.length){
            if (arr[right] == 0){
                zeroCount ++;
            }
        
            while (zeroCount > k){
                if (arr[left] == 0){
                    zeroCount --;
                }
                left ++;
            }
            maxLen = Math.max(maxLen, right-left +1);
            right ++;
        }   
        return maxLen;
    }
    public static void main (String args[]){
        int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maxConsecutiveOnes(arr, k));
    }
}
