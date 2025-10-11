import java.util.*;
public class Main{
    public static void moveToEnd (int arr[]){
        int i=arr.length-1;
        for (int j=arr.length-1; j>=0; j--){
            if (arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
            }
        }
    }
    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
        System.out.println();
    }

    public static void removeDublicateUsingaMapn(int arr[]){
        HashSet <Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        // for (Integer k : set){
        //     System.out.print(k+" ");
        // }

        Integer res [] = set.toArray(new Integer[0]);
        System.out.println(set);
    }

    // public static void findAllPairs (int arr[], int si, int ei, int target){
    //     while (si < ei){
    //         if (arr[si] + arr[ei] == target){
    //             System.out.println(si + "," + ei);;
    //         }
    //         if (arr[si] + arr[ei] < target){
    //             si ++;
    //         }else{
    //             ei --;
    //         }
    //     }
    //     System.out.println("No match");
    // }

    public static List<List<Integer>> findAllPairs (int arr[], int tar){
        List <List<Integer>> result = new ArrayList<>();
        int si = 0;
        int ei = arr.length-1;

        while (si < ei){
            List<Integer> ans = new ArrayList<>();
            if (arr[si] + arr[ei] == tar){
                ans.add(si);
                ans.add(ei);
                result.add(ans);
            }
            if (arr[si] + arr[ei] < tar){
                si ++;
            }else{
                ei --;
            }
        }
        return result;
    }
    public static void main (String args[]){
       int arr[] = {1,2,3,4,5,6,7};
       System.out.println(findAllPairs(arr, 5));
        
    }
}

