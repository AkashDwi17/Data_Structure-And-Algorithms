package BinarySearch_5;

// Problem 17 — Allocate Minimum Number of Pages (Book Allocation)

// Companies: Interview classic
// Statement: Allocate contiguous books minimizing maximum pages per student. Binary on max pages.
// Input: pages=[12,34,67,90], students=2
// Output: 113

public class _17AllocateMinimumNumberOfPages {

    // Greedy feasibility: can we allocate books to at most 'studentCount' students
    // such that no student gets more than 'maxAllowedPages' in total?
    private static boolean canAllocate(int[] pages, int studentCount, long maxAllowedPages) {
        int usedStudents = 1;
        long currentSum = 0;

        for (int p : pages) {
            if (currentSum + p <= maxAllowedPages) {
                currentSum += p;              // add book to current student
            } else {
                usedStudents++;               // allocate to next student
                currentSum = p;               // start sum for new student
                if (usedStudents > studentCount) return false; // not feasible
            }
        }
        return true; // feasible allocation within studentCount
    }

    // Binary-search on the minimum possible maximum pages per student
    public static int allocateMinimumPages(int[] pages, int studentCount) {
        long lowerBound = 0; // max(pages)
        long upperBound = 0; // sum(pages)

        for (int p : pages) {
            lowerBound = Math.max(lowerBound, p);
            upperBound += p;
        }

        long best = upperBound;

        while (lowerBound <= upperBound) {
            long mid = lowerBound + (upperBound - lowerBound) / 2; // candidate max pages

            if (canAllocate(pages, studentCount, mid)) {
                best = mid;            // feasible — try smaller
                upperBound = mid - 1;
            } else {
                lowerBound = mid + 1;  // not feasible — need larger cap
            }
        }

        return (int) best;
    }

    // Quick test / demonstration
    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int students = 2;
        System.out.println(allocateMinimumPages(pages, students)); // prints 113
    }
}
