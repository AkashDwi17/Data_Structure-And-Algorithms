package SORTINGBASEDPROBLEMS_6;


// ⭐ 17. Reconstruct Queue by Height
// 🔥 Concept:

// Each person represented as → [height, k]
// k = number of people ≥ same height in front.

// ✔ Approach

// Sort:

// Height DESC

// k ASC

// Insert into result at index k.

// Input
// people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]

// Output
// [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]


import java.util.*;

public class _17ReconstructQueueByHeight {

    public static int[][] reconstructQueue(int[][] people) {
        // Step 1: Sort people
        // Descending by height, ascending by k
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0]; // higher height first
            } else {
                return a[1] - b[1]; // smaller k first
            }
        });

        // Step 2: Insert each person into list at index k
        List<int[]> result = new ArrayList<>();
        for (int[] person : people) {
            result.add(person[1], person); // insert at index k
        }

        // Convert List back to array
        return result.toArray(new int[people.length][2]);
    }

    public static void main(String[] args) {
        int[][] people = {
            {7,0},{4,4},{7,1},{5,0},{6,1},{5,2}
        };

        int[][] reconstructed = reconstructQueue(people);

        System.out.println("Reconstructed Queue:");
        for (int[] p : reconstructed) {
            System.out.println(Arrays.toString(p));
        }
    }
}

