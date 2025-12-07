package SORTINGBASEDPROBLEMS_6;

// 11. Minimum Platforms (Railway)

// 📌 Problem:
// Given arrival & departure times → find minimum platforms.

// Input: arr=[900,940,950,1100], dep=[910,1200,1120,1130]
// Output: 3

// Companies: Amazon, Microsoft, TCS NQT

import java.util.Arrays;

public class _11MinimumPlatformsRailway {

    public static int minPlatforms(int[] arrival, int[] departure) {
        int n = arrival.length;
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platforms = 1, maxPlatforms = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platforms++;      // new train arrived, need extra platform
                i++;
            } else {
                platforms--;      // train departed, free a platform
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100};
        int[] departure = {910, 1200, 1120, 1130};
        System.out.println(minPlatforms(arrival, departure)); // Output: 3
    }
}

