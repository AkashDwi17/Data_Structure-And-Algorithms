package SORTINGBASEDPROBLEMS_6;

// 14. Job Sequencing Problem
// 🔥 Concept:

// Each job has: profit and deadline.
// You can perform only 1 job per day.
// Goal → pick jobs such that profit is maximized.

// ✔ Approach

// Sort jobs by profit descending, schedule each job at the latest free slot before its deadline.

// Input Example
// Jobs = [(id=A, deadline=2, profit=100),
//         (B,1,19),
//         (C,2,27),
//         (D,1,25),
//         (E,3,15)]

// Output
// Max Jobs Done = 3  
// Max Profit = 152  
// Jobs = [A, C, E]


import java.util.Arrays;
import java.util.Comparator;

class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class _14JobSequencingProblem {

    public static void jobSequencing(Job[] jobs) {
        // Step 1: Sort jobs in descending order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int n = jobs.length;
        char[] result = new char[n]; // store job ids
        boolean[] slot = new boolean[n]; // mark free time slots

        int countJobs = 0;
        int totalProfit = 0;

        for (Job job : jobs) {
            // Find a free slot for this job (latest before deadline)
            for (int j = Math.min(n, job.deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = job.id;
                    countJobs++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Max Jobs Done = " + countJobs);
        System.out.println("Max Profit = " + totalProfit);

        System.out.print("Jobs = [");
        for (int i = 0; i < n; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('A', 2, 100),
            new Job('B', 1, 19),
            new Job('C', 2, 27),
            new Job('D', 1, 25),
            new Job('E', 3, 15)
        };

        jobSequencing(jobs);
    }
}

