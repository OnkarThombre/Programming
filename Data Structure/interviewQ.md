🚀 Technical / Coding Round Question List
🔹 Arrays & Strings

~~Reverse an array (in-place). OK DONE

~~Find the maximum and minimum in an array. !! new technique revise it OK DONE

~~Rotate array by k positions. OK DONE

~~Find duplicate elements in an array. OK DONE

``Find missing number in 1…n sequence. OK DONE

??????Merge two sorted arrays.

Find the subarray with maximum sum (Kadane’s algorithm).

~~Find two numbers in array with sum = target (2-sum problem).

Move all zeros to end of array.

Check if a string is a palindrome.

Reverse words in a string.

Find the first non-repeating character in a string.

🔹 Linked List

Traverse and print linked list.

Insert at beginning, end, and specific position.

Delete first, last, or a given node.

Reverse a linked list (iterative + recursive).

Detect a cycle in linked list (Floyd’s cycle detection).

Find middle element of linked list.

Merge two sorted linked lists.

Remove duplicates from sorted linked list.

🔹 Stack & Queue

Implement stack using array / linked list.

Implement queue using array / linked list.

Implement circular queue.

Implement stack using 2 queues / queue using 2 stacks.

Balanced parentheses problem ({[()]}).

Next greater element in an array using stack.

🔹 Searching & Sorting

Binary Search (iterative + recursive).

First and last occurrence of element (binary search variation).

Find square root using binary search.

Implement Bubble, Selection, Insertion, Merge, and Quick Sort.

Find kth largest/smallest element in array.

🔹 Recursion

Factorial of a number.

Fibonacci series.

Tower of Hanoi.

Print all permutations of a string.

Reverse a string using recursion.

🔹 Hashing

Find frequency of elements in an array.

Find if subarray with sum = 0 exists.

Count pairs with given sum.

Longest substring without repeating characters.

🔹 Advanced (if asked in product companies)

LRU Cache implementation.

Minimum spanning tree (Prim’s/Kruskal’s).

Dijkstra’s shortest path.

Detect cycle in graph.

Dynamic Programming:

Coin change problem.

Longest Common Subsequence (LCS).

Longest Increasing Subsequence (LIS).

✅ Interview Tip:
Most service-based companies (Infosys, Wipro, TCS, Cognizant) → focus on Arrays, Strings, Linked List, Basic Sorting, Stack/Queue, Recursion.
Product-based (Amazon, Microsoft, etc.) → go deeper into Hashing, Graph, DP.



############################### String  ###############################

Got it, Onkar 🙂  
You want a **comprehensive list** of **string-based coding questions** that are **frequently asked** in coding rounds, interviews, and platforms like **GeeksforGeeks, LeetCode, HackerRank, CodeStudio, TCS, Capgemini, Infosys, Wipro, etc.**  

I’ll prepare a **well-categorized, prioritized list** so you can practice **step by step**.  
I'll also mention the **difficulty level** and **platform tags** so you know where to focus.

---

# **📌 Ultimate String Coding Questions List (For Placements & Coding Rounds)**  

---

## **A. Basic String Handling (Level: Easy)**  
> **Goal** → Build confidence in Java string basics, string operations, and simple logic.

| **#** | **Problem** | **Description** | **Platform** |
|-------|------------|------------------|--------------|
1 | Reverse a String | Input: `"onkar"` → Output: `"rakno"` | GFG, LC Easy |
2 | Palindrome Check | Check if string reads the same forward & backward | GFG, LC Easy |
3 | Count Vowels & Consonants | Input: `"cdac"` → Vowels = 1, Consonants = 3 | GFG |
4 | Count Words in a String | Input: `"I love coding"` → Output: 3 | GFG |
5 | Remove White Spaces | Input: `" a b  c "` → Output: `"abc"` | GFG |
6 | Change Case of Characters | Convert `"Hello"` → `"hELLO"` | GFG |
7 | Frequency of Each Character | Count how many times each character appears | GFG |
8 | Remove Duplicate Characters | `"programming"` → `"progamin"` | GFG |
9 | Check Anagram | `"listen"` & `"silent"` → True | GFG, LC Easy |
10 | Find ASCII Value of Characters | Input: `"A"` → Output: `65` | Basics |

---

## **B. String Searching & Matching (Level: Easy → Medium)**  
> **Goal** → Learn substring search, character occurrence, and pattern matching.

| **#** | **Problem** | **Description** | **Platform** |
|-------|------------|------------------|--------------|
11 | Find First Non-Repeating Character | Input: `"aabbcdd"` → Output: `"c"` | LC Easy |
12 | Find First Repeating Character | Input: `"abcda"` → Output: `"a"` | GFG |
13 | Count Occurrence of a Substring | `"abcabc"` → `"abc"` → 2 | GFG |
14 | Check If Two Strings are Rotations | `"ABCD"` & `"CDAB"` → True | GFG |
15 | Implement `indexOf()` Without Built-in | Search substring manually | GFG |
16 | Longest Common Prefix | Input: `["flower","flow","flight"]` → `"fl"` | LC Easy |
17 | Check Pangram | A string containing all alphabets | GFG |
18 | Check if Subsequence | `"abc"` in `"aebdc"` → True | LC Easy |
19 | Count Distinct Substrings | Slightly advanced substring problem | LC Medium |
20 | Longest Palindromic Substring | `"babad"` → `"bab"` | LC Medium |

---

## **C. Two-Pointer & Sliding Window Problems (Level: Medium)**  
> **Goal** → Handle continuous substrings efficiently. Frequently asked in **product companies**.

| **#** | **Problem** | **Description** | **Platform** |
|-------|------------|------------------|--------------|
21 | Longest Substring Without Repeating Characters | `"abcabcbb"` → Output: `3` | LC Medium |
22 | Minimum Window Substring | `"ADOBECODEBANC"`, target `"ABC"` → `"BANC"` | LC Hard |
23 | Longest Substring With At Most K Distinct Characters | Example: `s="eceba", k=2` → Output: `3` | LC Medium |
24 | Sliding Window for Vowels | Count max vowels in a substring of size K | LC Easy |
25 | Longest Substring With Only Vowels | `"earthidea"` → `"ea"` → length = 2 | GFG |

---

## **D. String Conversion & Manipulation (Level: Easy → Medium)**  
> **Goal** → Work on transforming one string into another.

| **#** | **Problem** | **Description** | **Platform** |
|-------|------------|------------------|--------------|
26 | String Compression | `"aaabbcc"` → `"a3b2c2"` | LC Medium |
27 | Reverse Words in a String | `"I love Java"` → `"Java love I"` | LC Easy |
28 | Remove Adjacent Duplicates | `"abbaca"` → `"ca"` | LC Easy |
29 | Convert Roman to Integer | `"XIV"` → `14` | LC Easy |
30 | Convert Integer to Roman | `58` → `"LVIII"` | LC Medium |
31 | Multiply Two Strings | Input: `"123"` & `"45"` → Output: `5535` | LC Medium |
32 | Add Two Strings | `"11"` + `"123"` → `"134"` | LC Easy |
33 | Implement `atoi()` | Convert string to integer | LC Medium |
34 | Check Balanced Parentheses | `"({[]})"` → Valid | LC Easy |
35 | Zigzag Conversion | Classic LeetCode problem | LC Medium |

---

## **E. Advanced & Dynamic Programming on Strings (Level: Medium → Hard)**  
> **Goal** → Practice for **tougher coding rounds** & **product-based interviews**.

| **#** | **Problem** | **Description** | **Platform** |
|-------|------------|------------------|--------------|
36 | Edit Distance | Convert `"horse"` → `"ros"` in min steps | LC Hard |
37 | Longest Common Subsequence | Between two strings | GFG, LC Medium |
38 | Minimum Insertions to Make Palindrome | `"mbadm"` → `"madam"` | LC Medium |
39 | Count Palindromic Substrings | `"aaa"` → `6` | LC Medium |
40 | Wildcard Matching | Pattern `"a*b?c"` vs `"axbyc"` | LC Hard |
41 | Regular Expression Matching | Implement regex engine | LC Hard |
42 | Group Anagrams | Group words with same characters | LC Medium |
43 | Smallest Subsequence of Distinct Characters | Optimization problem | LC Medium |
44 | Check Interleaving of Two Strings | Merge two strings maintaining order | LC Hard |
45 | Reorganize String | Rearrange to avoid adjacent duplicates | LC Medium |

---

## **F. Placement-Oriented Quick Picks**
If you’re preparing for **Capgemini, TCS, Wipro, Infosys, or Cognizant**,  
these **15 most repeated** string questions are **must-do**:
- ✅ Reverse a string
- ✅ Check palindrome
- ✅ Count vowels & consonants
- ✅ Find duplicate characters
- ✅ Check anagram
- ✅ Remove white spaces
- ✅ String compression (`aaabb` → `a3b2`)
- ✅ Longest substring without repeating characters
- ✅ First non-repeating character
- ✅ Check string rotations
- ✅ Implement `atoi()`
- ✅ Reverse words in a sentence
- ✅ Longest common prefix
- ✅ Frequency of each word in a sentence
- ✅ Remove duplicates from string

---

## **How You Should Practice**
1. **Start with Basic (A + B)** → Build foundation  
2. **Then Medium (C + D)** → Solve sliding window & substring problems  
3. **Finally Advanced (E)** → Only if targeting **product companies**  

---

## **Best Platforms to Practice**
- **GeeksforGeeks Strings** → [https://www.geeksforgeeks.org/strings/](https://www.geeksforgeeks.org/strings/) ✅  
- **LeetCode String Tag** → [https://leetcode.com/tag/string/](https://leetcode.com/tag/string/) ✅  
- **Coding Ninjas + CodeStudio** → Good for beginner-friendly problems  

---

If you want, Onkar, I can prepare a **personalized 20-day roadmap**  
where I’ll give you **handpicked string questions** from **easy → hard**,  
with **Java solutions** and **step-by-step dry runs**.  
This will make sure you **crack coding rounds quickly**.  

Do you want me to make that **20-day structured string practice plan** for you?  
It’ll save you a lot of time searching for problems.



#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################


Alright Onkar 🙂, I’ll give you a **handpicked list of the Top 25 String Coding Questions** that are **frequently asked** in **coding rounds** of companies like **Capgemini, TCS, Infosys, Wipro, Cognizant, Accenture, etc.** and also appear on **GeeksforGeeks, LeetCode, and HackerRank**.

I’ll divide them into **Basic → Intermediate → Advanced** levels so you can **practice step by step**.

---

# **🔹 Top 25 Important String Coding Questions**

---

## **I. Basic Level (Foundation)**

These cover **reversals, counts, and simple manipulations**.
**(MUST DO for freshers’ coding rounds)**

1. **Reverse a string**

   * Input: `"onkar"` → Output: `"rakno"`
   * Do it in **3 ways**: using loop, `toCharArray()`, and `StringBuilder.reverse()`.

2. **Check if a string is a palindrome**

   * Input: `"level"` → Output: `true`
   * Solve manually (two-pointer) and using `StringBuilder.reverse()`.

3. **Count vowels and consonants in a string**

   * Input: `"Java"` → Vowels = 2, Consonants = 2.

4. **Remove all white spaces from a string**

   * Input: `"I am Onkar"` → Output: `"IamOnkar"`.

5. **Remove duplicate characters from a string**

   * Input: `"programming"` → Output: `"progamin"`.

6. **Find the frequency of each character**

   * Input: `"success"`
   * Output: `{s=3, u=1, c=2, e=1}`.

7. **Find the first non-repeating character**

   * Input: `"swiss"` → Output: `"w"`.

8. **Check if two strings are anagrams**

   * `"listen"` & `"silent"` → ✅ True
   * `"hello"` & `"world"` → ❌ False.

9. **Count words in a string**

   * Input: `"Java is fun"` → Output: `3`.

10. **Check if a string contains only digits**

* Input: `"12345"` → ✅ True
* Input: `"12a45"` → ❌ False.

---

## **II. Intermediate Level (Coding Round Favorites)**

These are **frequently asked** in **Capgemini, TCS, Infosys, and Accenture** exams.

11. **Find the largest word in a sentence**

* Input: `"I love programming"` → Output: `"programming"`.

12. **Check if two strings are rotations of each other**

* `"ABCD"` & `"CDAB"` → ✅ True.

13. **Count occurrences of a substring**

* Input: `"abababa"` → Substring `"aba"` → Output: `3`.

14. **Check if a string has all unique characters**

* `"abcdef"` → ✅ True
* `"aabcde"` → ❌ False.

15. **Remove all occurrences of a given character**

* Input: `"programming"`, remove `'m'` → Output: `"prograing"`.

16. **Replace all spaces with `"%20"` (URL Encoding)**

* Input: `"Java Coding"` → Output: `"Java%20Coding"`.

17. **Find the longest substring without repeating characters** *(LeetCode Hot Q)*

* Input: `"abcabcbb"` → Output: `"abc"` (length = 3).

18. **Check if a string is made up of only vowels or only consonants**

* Input: `"aeiou"` → ✅ True
* Input: `"onkar"` → ❌ False.

19. **Convert a string to title case**

* Input: `"hello world"` → Output: `"Hello World"`.

20. **Check if a string is a valid palindrome ignoring spaces & cases**

* Input: `"A man a plan a canal Panama"` → Output: ✅ True.

---

## **III. Advanced Level (Company-Level + LeetCode)**

These are tougher but **highly important** for top placements.

21. **Implement your own `substring()` method**

* Input: `"onkar"` → `substring(1, 4)` → Output: `"nka"`.

22. **Group anagrams from a list of strings** *(LeetCode Q)*

* Input: `["eat","tea","tan","ate","nat","bat"]`
* Output: `[["eat","tea","ate"],["tan","nat"],["bat"]]`.

23. **Find the smallest window that contains all characters of another string**

* Input: `"ADOBECODEBANC"`, target: `"ABC"` → Output: `"BANC"`.

24. **Implement string compression** *(LeetCode Q)*

* Input: `"aaabbccccd"` → Output: `"a3b2c4d1"`.

25. **Check if one string is a subsequence of another**

* `"abc"` is a subsequence of `"ahbgdc"` → ✅ True.

---

## **📌 How to Practice Effectively**

* **Step 1** → Start with **Basic 1–10** → Practice writing code **without looking at solutions**.
* **Step 2** → Move to **Intermediate 11–20** → Focus on logic-building.
* **Step 3** → Try **Advanced 21–25** → They improve **DSA + logical thinking**.

---

## **📚 Best Platforms**

* **GeeksforGeeks** → [https://www.geeksforgeeks.org/strings-in-java/](https://www.geeksforgeeks.org/strings-in-java/)
* **LeetCode String Questions** → [https://leetcode.com/tag/string/](https://leetcode.com/tag/string/)
* **HackerRank Java Strings** → [https://www.hackerrank.com/domains/java](https://www.hackerrank.com/domains/java)

---

If you want, I can prepare a **PDF cheat sheet** containing:

* ✅ **All important String methods** (`substring`, `split`, `charAt`, `replace`, etc.)
* ✅ **Code templates** for all 25 problems
* ✅ **Tricks to solve quickly in interviews**

It’ll help you **revise in 1 hour** before coding rounds.

Do you want me to make that **String Coding Interview PDF** for you?
It’ll be super handy for your placement prep.
