🚀 7. Hashing / Frequency Count Problems
🌟 Category A — Frequency Counting
1️⃣ Majority Element (Moore’s Voting + Hashing)

Find element occurring more than n/2 times.

Input: [3,2,3]
Output: 3

2️⃣ Majority Element II

Elements occurring more than n/3 times.

Input: [3,2,3,2,2,1,1]
Output: [2]

3️⃣ Count Frequency of Each Element

Return map of element → frequency.

Input: [1,2,2,3,3,3]
Output: {1:1, 2:2, 3:3}

4️⃣ First Unique Element

First index where element appears once.

Input: "loveleetcode"
Output: 2

5️⃣ Top K Frequent Elements / Strings

Find K most frequent.

Input: nums=[1,1,1,2,2,3], k=2
Output: [1,2]

🌟 Category B — Detecting Duplicates
6️⃣ Contains Duplicate

Check any number appears at least twice.

Input: [1,2,3,1]
Output: true

7️⃣ Nearby Duplicate

|i - j| ≤ k and arr[i] == arr[j]

Input: nums=[1,2,3,1], k=3
Output: true

8️⃣ Contains Duplicate III

|nums[i] - nums[j]| ≤ t and |i - j| ≤   k

Input: nums=[1,5,9,1], k=2, t=3
Output: false

🌟 Category C — Subarray / Prefix Sum + HashMap
9️⃣ Subarray Sum Equals K

Count number of subarrays with sum = K.

Input: arr=[1,1,1], k=2
Output: 2

🔟 Longest Subarray with Sum K

Longest length.

Input: arr=[10,5,2,7,1,9], k=15
Output: 4

1️⃣1️⃣ Count Subarrays with Sum 0

Input: [1,-1,1,-1]
Output: 4

1️⃣2️⃣ Largest Subarray with Equal 0s and 1s

Convert 0 → -1, track sum indices.

Input: [0,1,0]
Output: 2

1️⃣3️⃣ Subarray Divisible by K

Prefix sum % k repeats.

Input: [4,5,0,-2,-3,1], k=5
Output: 7

1️⃣4️⃣ Count Distinct Elements in Every Window K

Frequency map.

Input: [1,2,1,3,4,2,3], k=4
Output: [3,4,4,3]

🌟 Category D — HashSet / Unique Value Problems
1️⃣5️⃣ Longest Consecutive Sequence

O(n), using HashSet.

Input: [100,4,200,1,3,2]
Output: 4

1️⃣6️⃣ Happy Number

HashSet to detect loops.

Input: 19
Output: true

1️⃣7️⃣ Two Sum

Return indices.

Input: [2,7,11,15], target = 9
Output: [0,1]

1️⃣8️⃣ Pair With Given Difference

Check if pair exists with diff K.

Input: [5,10,3,2,50,80], K=78
Output: true

🌟 Category E — String Frequency (Anagrams & Hashing)
1️⃣9️⃣ Check Anagram

Sort or freq counter.

Input: "anagram", "nagaram"
Output: true

2️⃣0️⃣ Group Anagrams

Store sorted string as key.

Input: ["eat","tea","tan","ate","nat","bat"]
Output:
[["eat","tea","ate"], ["tan","nat"], ["bat"]]

2️⃣1️⃣ Valid Parentheses Check

Use stack + hash matching.

Input: "()[]{}"
Output: true

2️⃣2️⃣ Longest Substring Without Repeating Characters

Sliding Window + HashSet.

Input: "abcabcbb"
Output: 3

2️⃣3️⃣ Longest Substring with K Unique Characters

HashMap + sliding window.

Input: "aabacbebebe", k=3
Output: "cbebebe" (length 7)

🌟 Category F — Maps + Sorting / Greedy
2️⃣4️⃣ Sort Characters by Frequency

Input: "tree"
Output: "eert"

2️⃣5️⃣ Top K Frequent Words

Sort by frequency and lexicographical.

Input: ["i","love","leetcode","i","love","coding"], k=2
Output: ["i","love"]

2️⃣6️⃣ Bucket Sort with Hashing

Frequency → bucket → sorted result.

Problem: Sort by frequency (numbers/strings).

🌟 Category G — Advanced / Contest HashMap
2️⃣7️⃣ Count Number of Nice Subarrays

Exactly k odd numbers.

Input: [1,1,2,1,1], k=3
Output: 2

2️⃣8️⃣ Count Good Meals

deliciousness[i] + deliciousness[j] is power of 2.

Input: [1,3,5,7,9]
Output: 4

2️⃣9️⃣ Minimum Window Substring

Smallest substring containing all characters.

Input: S="ADOBECODEBANC", T="ABC"
Output: "BANC"

3️⃣0️⃣ Isomorphic Strings

Character mapping check.

Input: s="egg", t="add"
Output: true