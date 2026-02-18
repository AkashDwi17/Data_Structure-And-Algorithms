package PracticeSet1;

// 5️⃣ Maximum Number of Vowels in Substring

// Input:
// s = "abciiidef", k = 3

// Output:
// 3
public class _5MaximumNumberOfVowelsInSubstring {
    public static boolean isVowel (char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int maxVowel (String str, int k){
        int count = 0;
        int maxCount = 0;

        for (int i=0; i<k; i++){
            if (isVowel(str.charAt(i))){
                count ++;
            }
        }
        maxCount = count;

        for (int i=k; i<str.length(); i++){
            if (isVowel(str.charAt(i-k))){
                count --;
            }
            if (isVowel(str.charAt(i))){
                count ++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String str = "abciiidef";
        int k = 3;
        System.out.println(maxVowel(str, k));
    }
}
