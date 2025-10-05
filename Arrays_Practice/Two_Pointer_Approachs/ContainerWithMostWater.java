package Two_Pointer_Approachs;

// 4.2 Container With Most Water
// Input: [1,8,6,2,5,4,8,3,7]
// Output: 49

public class ContainerWithMostWater {
    public static int mostWater (int arr[]){
        int lp = 0;
        int rp = arr.length-1;
        int maxWater = 0;

        while (lp < rp){
            int height = Math.min (arr[lp], arr[rp]);
            int width = rp - lp;

            int currWater = height*width;
            maxWater = Math.max (currWater, maxWater);

            if (lp < rp){
                lp++;
            }else{
                rp --;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(arr));
    }
}
