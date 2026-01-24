# Sliding Window – Notes

## When to Use
- Input is an array or string
- Problem asks for longest / shortest / count of a contiguous range
- Constraints depend on elements inside the window

Typical signals:
- “substring”
- “subarray”
- “at most / at least K”
- “no repeating characters”

---

## Core Idea
Maintain a window using two pointers:
- Expand the right pointer to include new elements
- Shrink the left pointer to restore validity when constraints are violated

---

## Common Variations
- Fixed-size window
- Variable-size window
- Frequency-based window (using a HashMap)
- Condition-based window (e.g., distinct characters)

---

## Brute Force Approach
- Enumerate all subarrays / substrings
- Time complexity typically O(n²) or worse
- Used to validate correctness and constraints

---

## Optimized Approach
- Use two pointers
- Track window state incrementally
- Achieve O(n) time in most cases

---

## Common Pitfalls
- Forgetting to shrink the window
- Incorrect window validity condition
- Off-by-one errors
- Not updating result at the right time

---

## Edge Cases to Clarify in Interviews
- Empty input
- Single-element input
- Duplicate values
- Character set size (ASCII vs Unicode)

---

## Time and Space Complexity
- Typical time: O(n)
- Typical space: O(1) or O(k), depending on constraints

---

## Problems Solved Using This Pattern
- Longest Substring Without Repeating Characters
- Minimum Window Substring
- Max Consecutive Ones
- Subarrays with K Distinct Integers

(Add problems as you solve them — optional, not required.)

---

## Interview Talking Points
- Why sliding window reduces time complexity
- How window validity is maintained
- Tradeoffs between using arrays vs hash maps
