🌟 Category A — Frequency Counting
1️⃣ Majority Element (n/2 times)
🔹 Problem

Find the element that appears more than n/2 times.

🔹 Key Idea

Only one element can satisfy this.

Two approaches:

HashMap → count frequencies

Moore’s Voting Algorithm → O(1) space

🔹 Moore’s Logic

Maintain candidate and count

Increase count if same element

Decrease count if different

Final candidate is majority

🔹 Input
[3, 2, 3]

🔹 Output
3

2️⃣ Majority Element II (n/3 times)
🔹 Problem

Find elements appearing more than n/3 times.

🔹 Key Fact

At most 2 elements can satisfy this.

🔹 Approach

Modified Moore’s Voting (2 candidates)

Or HashMap + frequency check

🔹 Input
[3,2,3,2,2,1,1]

🔹 Output
[2]

3️⃣ Count Frequency of Each Element
🔹 Problem

Return frequency of every element.

🔹 Approach

Use HashMap

Increment count for each element

🔹 Input
[1,2,2,3,3,3]

🔹 Output
{1=1, 2=2, 3=3}

4️⃣ First Unique Element (Index)
🔹 Problem

Return index of first character with frequency = 1

🔹 Steps

Count frequency of characters

Traverse string again → find first freq = 1

🔹 Input
"loveleetcode"

🔹 Output
2   // 'v'

5️⃣ Top K Frequent Elements
🔹 Problem

Return k most frequent elements

🔹 Approach

HashMap for frequency

Priority Queue / Bucket Sort

🔹 Input
nums = [1,1,1,2,2,3], k = 2

🔹 Output
[1,2]

🌟 Category B — Detecting Duplicates
6️⃣ Contains Duplicate
🔹 Problem

Check if any value appears twice

🔹 Approach

HashSet

If element already exists → duplicate

🔹 Input
[1,2,3,1]

🔹 Output
true

7️⃣ Nearby Duplicate
🔹 Condition
|i - j| ≤ k AND nums[i] == nums[j]

🔹 Approach

HashMap → store last index

Check index difference

🔹 Input
nums = [1,2,3,1], k = 3

🔹 Output
true

8️⃣ Contains Duplicate III
🔹 Condition
|nums[i] - nums[j]| ≤ t
|i - j| ≤ k

🔹 Approach

TreeSet / Bucket Hashing

Sliding window of size k

🔹 Input
nums = [1,5,9,1], k = 2, t = 3

🔹 Output
false

🌟 Category C — Subarray / Prefix Sum + HashMap
9️⃣ Subarray Sum Equals K
🔹 Problem

Count subarrays whose sum = K

🔹 Formula
prefixSum - K exists in map

🔹 Input
[1,1,1], k = 2

🔹 Output
2

🔟 Longest Subarray with Sum K
🔹 Idea

Store first occurrence of prefix sum

Maximize (currentIndex - storedIndex)

🔹 Input
[10,5,2,7,1,9], k = 15

🔹 Output
4

1️⃣1️⃣ Count Subarrays with Sum 0
🔹 Logic

If same prefix sum repeats → sum = 0 in between

🔹 Input
[1,-1,1,-1]

🔹 Output
4

1️⃣2️⃣ Largest Subarray with Equal 0s and 1s
🔹 Trick

Convert:

0 → -1

🔹 Then

Find longest subarray with sum = 0

🔹 Input
[0,1,0]

🔹 Output
2

1️⃣3️⃣ Subarray Divisible by K
🔹 Formula
(prefixSum % k) repeats

🔹 Input
[4,5,0,-2,-3,1], k = 5

🔹 Output
7

1️⃣4️⃣ Count Distinct Elements in Every Window K
🔹 Approach

Sliding window + HashMap

Add next, remove previous

🔹 Input
[1,2,1,3,4,2,3], k = 4

🔹 Output
[3,4,4,3]

🌟 Category D — HashSet / Unique Value Problems
1️⃣5️⃣ Longest Consecutive Sequence
🔹 Idea

Use HashSet

Start counting only if (num-1) doesn’t exist

🔹 Input
[100,4,200,1,3,2]

🔹 Output
4   // [1,2,3,4]

1️⃣6️⃣ Happy Number
🔹 Logic

Replace number with sum of squares of digits

Detect loop using HashSet

🔹 Input
19

🔹 Output
true

1️⃣7️⃣ Two Sum
🔹 Idea

Store target - current in map

🔹 Input
[2,7,11,15], target = 9

🔹 Output
[0,1]

1️⃣8️⃣ Pair With Given Difference
🔹 Condition
|a - b| = K

🔹 Approach

HashSet

Check (num + K) or (num - K)

🔹 Input
[5,10,3,2,50,80], K = 78

🔹 Output
true

🌟 Category E — String Frequency / Sliding Window
1️⃣9️⃣ Check Anagram
🔹 Condition

Same character count

🔹 Input
"anagram", "nagaram"

🔹 Output
true

2️⃣0️⃣ Group Anagrams
🔹 Key

Sorted string as HashMap key

🔹 Input
["eat","tea","tan","ate","nat","bat"]

🔹 Output
[["eat","tea","ate"], ["tan","nat"], ["bat"]]

2️⃣1️⃣ Valid Parentheses
🔹 Use

Stack

HashMap for matching pairs

🔹 Input
"()[]{}"

🔹 Output
true

2️⃣2️⃣ Longest Substring Without Repeating Characters
🔹 Technique

Sliding window + HashSet

🔹 Input
"abcabcbb"

🔹 Output
3

2️⃣3️⃣ Longest Substring with K Unique Characters
🔹 Logic

Sliding window

Shrink window when unique > k

🔹 Input
"aabacbebebe", k = 3

🔹 Output
"cbebebe" (length = 7)

🌟 Category F — Sorting + Hashing
2️⃣4️⃣ Sort Characters by Frequency
🔹 Steps

Frequency map

Sort by count descending

🔹 Input
"tree"

🔹 Output
"eert"

2️⃣5️⃣ Top K Frequent Words
🔹 Sorting Rule

Frequency ↓

Lexicographical ↑

🔹 Input
["i","love","leetcode","i","love","coding"], k = 2

🔹 Output
["i","love"]

2️⃣6️⃣ Bucket Sort with Hashing
🔹 Idea

Frequency → index in bucket

Traverse from highest frequency

🔹 Used For

Top K frequent elements

Sort by frequency

🌟 Category G — Advanced / Contest Level
2️⃣7️⃣ Count Number of Nice Subarrays
🔹 Definition

Exactly k odd numbers

🔹 Trick

Convert odd → 1, even → 0
Then count subarrays with sum = k

🔹 Input
[1,1,2,1,1], k = 3

🔹 Output
2

2️⃣8️⃣ Count Good Meals
🔹 Condition
deliciousness[i] + deliciousness[j] = power of 2

🔹 Input
[1,3,5,7,9]

🔹 Output
4

2️⃣9️⃣ Minimum Window Substring
🔹 Goal

Smallest substring containing all characters of T

🔹 Technique

Sliding window + frequency matching

🔹 Input
S = "ADOBECODEBANC", T = "ABC"

🔹 Output
"BANC"

3️⃣0️⃣ Isomorphic Strings
🔹 Condition

One-to-one character mapping

🔹 Input
s = "egg", t = "add"

🔹 Output
true

✅ Final Tip (Very Important for Interviews)

Whenever you see:

Frequency → HashMap

Duplicate → HashSet

Subarray sum → Prefix Sum + Map

Window → Sliding Window

Top K → Heap / Bucket Sort