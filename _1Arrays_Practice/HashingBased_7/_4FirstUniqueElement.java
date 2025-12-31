package HashingBased_7;

// 4️⃣ First Unique Element

// First index where element appears once.

// Input: "loveleetcode"
// Output: 2   v is the first character which is uniqe and it is in 2 nd position

import java.util.*;
public class _4FirstUniqueElement {
    public static void FirstUniqueElement (String str){
        LinkedHashMap <Character, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put (ch, map.getOrDefault(ch, 0)+1);
        }

        // First Unique index

        for (int i=0; i<str.length(); i++){
            if (map.get(str.charAt(i)) == 1){
                System.out.print ("First Unique index " + i);
                break;
            }
        }

        // First Unique index value
        for (Character key : map.keySet()){
            if (map.get(key) == 1){
                System.out.print ("and Value: " + key+" ");
                return;
            }
        }

    }
    public static void main(String[] args) {
        String str = "loveleetcode";
        FirstUniqueElement(str);
    }
}
