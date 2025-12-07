package SORTINGBASEDPROBLEMS_6;


// 16. Candy Distribution
// 🔥 Concept:

// Ratings given for kids.
// Rules:

// Higher rating → must get more candies

// Every kid must get ≥ 1

// ✔ Approach

// Two-pass:

// Left to right

// Right to left
// Take max of both.

// Input
// ratings = [1,0,2]

// Output
// Candies = 5  
// Explanation: [2,1,2]


public class _16CandyDistribution {

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // Step 1: Give 1 candy to everyone initially
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Step 2: Left to Right → ensure higher rating than left gets more
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to Left → ensure higher rating than right gets more
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Sum up candies
        int total = 0;
        for (int c : candies) {
            total += c;
        }

        return total;
    }

    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        System.out.println("Total Candies = " + candy(ratings)); // Output: 5
    }
}
