package StringR;
import java.util.*;

public class IsAnagram {
    public static boolean isAnagram (String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()){
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            if (Arrays.equals (str1CharArray, str2CharArray)){
                System.out.println(str1 +", "+ str2 + " are anagram");
                return true;
            }else{
                System.out.println(str1 +", "+ str2 + " are Not anagram");
                return false;
            }
        }else{
            System.out.println(str1 +", "+ str2 + " are Not anagram");
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("earth", "heart"));
    }
}
