// Given a string s, find the length of the longest substring without duplicate characters

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.

public class LongestSubstring  {

    public static void main (String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        String subString = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (subString.indexOf(s.substring(j, j+1)) < 0) {
                    subString += s.charAt(j);
                } else {
                    break;
                }
            }
            System.out.println(subString);
            if (subString.length() > longest) {
                longest = subString.length();
            }
            subString = "";
        }
        return longest;
    }
}