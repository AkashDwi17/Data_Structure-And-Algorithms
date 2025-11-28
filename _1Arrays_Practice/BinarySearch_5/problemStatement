✅ 1. Basic Binary Search (Easy)
Problem 1 — Standard Binary Search (Find element)

Companies: All (basic)
Statement: Find index of target in sorted array (return -1 if not present).
Input: arr = [1,2,3,4,5,6], target = 4
Output: 3 (0-based)

Edge: not found → -1.

Problem 2 — First Occurrence (Lower Bound)

Companies: Amazon, Microsoft
Statement: Find first index where arr[i] == target (or lower_bound).
Input: arr = [1,2,2,2,3], target = 2
Output: 1

Problem 3 — Last Occurrence (Upper Bound - 1)

Companies: Amazon, Google
Input: arr = [1,2,2,2,3], target = 2
Output: 3

Problem 4 — Count Occurrences (using bounds)

Companies: Interview tests
Input: arr = [1,2,2,2,3], target = 2
Output: 3

Problem 5 — Lower Bound / Upper Bound (first ≥ x / first > x)

Companies: Competitive programming, interviews
Input: arr = [1,3,3,5,7], x = 3
Output: lower_bound = 1, upper_bound = 3

🔎 2. Variants on Sorted Arrays (Easy → Medium)
Problem 6 — Find Smallest Element ≥ X (ceiling)

Input: arr = [1,2,4,6], x = 3
Output: 4

Problem 7 — Find Floor (largest ≤ X)

Input: arr = [1,2,4,6], x = 5
Output: 4

Problem 8 — Find Peak Element (element > neighbors) (LeetCode 162)

Companies: Google, Amazon
Input: arr = [1,2,1]
Output: 1 (index of 2)

Problem 9 — Find Minimum in Rotated Sorted Array (no duplicates) (LeetCode 153)

Companies: Amazon, Microsoft
Input: arr = [4,5,6,7,0,1,2]
Output: 0

Problem 10 — Find Minimum in Rotated Sorted Array (with duplicates) (LeetCode 154)

Input: arr = [2,2,2,0,1,2]
Output: 0

Problem 11 — Search in Rotated Sorted Array (LeetCode 33)

Companies: Amazon, Google
Input: arr = [4,5,6,7,0,1,2], target = 0
Output: 4

Problem 12 — Find Rotation Count (index of min)

Input: arr = [15,18,2,3,6,12]
Output: 2 (min at index 2 → rotated 2 times)

Problem 13 — Search in Nearly Sorted Array (each element can be at i-1,i,i+1)

Companies: some interviews
Input: arr = [10,3,40,20,50,80,70], target=40
Output: 2 (handle swapped positions)

⚖️ 3. Binary Search on Condition / Binary-on-Answer (Medium → Hard)

These require a feasibility function ok(x) that is monotone: if ok(x) true then ok(x+1) also true (or reverse).

Problem 14 — Aggressive Cows / Maximize minimum distance (binary on distance)

Companies: SPOJ/Codeforces style contests
Statement: Place C cows in stalls to maximize minimum distance between cows.
Input: stalls=[1,2,4,8,9], C=3
Output: 3 (place at 1,4,8 → min dist=3)

Problem 15 — Capacity to Ship Packages Within D Days (LeetCode 1011)

Companies: Amazon
Statement: Minimum ship capacity to ship weights in ≤ D days (binary on capacity).
Input: weights=[1,2,3,4,5,6,7,8,9,10], D=5
Output: 15

Problem 16 — Split Array Largest Sum (LeetCode 410)

Companies: Amazon, Google
Statement: Split into m subarrays minimize largest sum; binary on max allowed sum.
Input: nums=[7,2,5,10,8], m=2
Output: 18

Problem 17 — Allocate Minimum Number of Pages (Book Allocation)

Companies: Interview classic
Statement: Allocate contiguous books minimizing maximum pages per student. Binary on max pages.
Input: pages=[12,34,67,90], students=2
Output: 113

Problem 18 — Painter’s Partition Problem

Companies: Coding challenge / interviews
Statement: Minimize time to paint using painters, binary on time limit.
Input: boards=[10,20,30,40], painters=2
Output: 60

Problem 19 — Kth Smallest Element in Sorted Matrix (LeetCode 378)

Companies: Amazon, Microsoft
Statement: Binary on value range; count ≤ mid using rows sorted property.
Input: matrix=[[1,5,9],[10,11,13],[12,13,15]], k=8
Output: 13

Problem 20 — Median of Two Sorted Arrays (LeetCode 4) — log(min(n,m))

Companies: Google, Facebook (hard)
Statement: Use binary search on partition index in smaller array.
Input: nums1=[1,3], nums2=[2]
Output: 2.0

Problem 21 — Find Smallest Divisor Given Threshold (LeetCode 1283)

Companies: Amazon
Input: nums=[1,2,5,9], threshold=6
Output: 5

Problem 22 — Longest Increasing Subsequence Length via patience (binary-search trick)

Companies: many
Statement: Use binary-search on tails array to keep ends; returns length in O(n log n).
Input: arr=[10,9,2,5,3,7,101,18]
Output: 4

Problem 23 — Find Peak in Unimodal Function (ternary/binary hybrid)

Companies: contest problems
Input/Idea: discrete array with single peak → binary can find peak index.

🔢 4. Count / Frequency / Boundary Variants
Problem 24 — Count of elements ≤ X (use upper_bound)

Input: arr=[1,2,4,4,5], X=4
Output: 4

Problem 25 — K-th Smallest Pair Distance (LeetCode 719)

Companies: LeetCode contests
Statement: Binary on distance; count pairs with dist ≤ mid using two-pointers.
Input: nums=[1,3,1], k=1
Output: 0

Problem 26 — Find First Bad Version (LeetCode 278)

Companies: Microsoft
Statement: Binary to find transition point in boolean predicate.
Input: versions 1..n, suppose first bad=4; output 4.

Problem 27 — Find Boundaries in 2D Monotone Matrix (search in matrix II)

Companies: LeetCode/Contests
Statement: Use binary split on rows/columns or staircase search.

🧪 5. Edge / Tricky Cases & Testcases

Use these to stress your solutions.

Basic tests:

arr = [] → search target → -1

arr = [5] → target 5 → 0

arr = [2,2,2,2] → target 2 → first=0,last=3,count=4

Rotated array:

[4,5,6,7,0,1,2], target=0 → index 4

[2,2,2,3,4,2], duplicates → min=2 (handle duplicates carefully)

Binary-on-answer patterns:

weights = [1..10], D large → capacity = max weight

stalls = [1,2,4,8,9], C=3 → answer 3

K-th and count:

matrix large values, repeated values

pairs with difference = 0 (duplicates)