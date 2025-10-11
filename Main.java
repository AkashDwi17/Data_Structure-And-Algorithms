// 1.3 Count Distinct Elements in Every Window of Size k
// Input: arr = [1, 2, 1, 3, 4, 2, 3], k = 4
// Output: [3, 4, 4, 3]


import java.util.*;
public class Main{
    public static List <Integer> countDistinctEle (int arr[], int k){
        List <Integer> list = new ArrayList<>();
        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i=0; i<k; i++){
            map.put (arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        list.add(map.size());

        for (int i=k; i<arr.length; i++){
            int leaving = arr[i-k];
            map.put(leaving, map.get(leaving) -1);
            if (map.get(leaving) == 0){
                map.remove(leaving);
            }

            map.put (arr[i], map.getOrDefault (arr[i], 0)+1);
            list.add (map.size());
        }
        return list;
    }
    public static void main (String args[]){
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        System.out.println(countDistinctEle (arr, 4));
    }
}