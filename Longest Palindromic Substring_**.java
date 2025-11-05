// Author: Mustain Murtaza Taib
// LeetCode Problem: Add Two Numbers
// Problem Link: https://leetcode.com/problems/longest-palindromic-substring/description/
// Topics: Two Pointers, String, Dynamic Programming
// Applied By Me: Two Pointers, String
// Time Complexity: Best Case {O(1)}, Worst Case {O(n^2)}
// Space Complexity: Best Case {O(1)}, Worst Case {O(n)}
// Type: Medium

// "*" single star means learned code
// "**" double star means learned code and algorithm or data-staructure

class Solution {
    public int substring_left = 0;
    public int substring_right = 0;
    public int total_substring_length = 0;

    public void find_substring_length(String s, int string_length, int left, int right) {

        while(left > -1 && right < string_length && s.charAt(left) == s.charAt(right)) {
            
            if((right - left + 1) > this.total_substring_length) {
                this.substring_left = left;
                this.substring_right = right;

                this.total_substring_length = right - left + 1;
            }
            left -= 1;
            right += 1;
        }
        return;
    }

    public String longestPalindrome(String s) {

        int string_length = s.length();

        for(int i = 0; i < string_length; ++i) {
            // For finding Odd SubString
            find_substring_length(s, string_length, i, i);

            // For finding Even SubString
            find_substring_length(s, string_length, i, i+1);
        }

        StringBuilder longest_palindromic_substring = new StringBuilder("");

        for(int i = this.substring_left; i <= this.substring_right; ++i)
            longest_palindromic_substring.insert(longest_palindromic_substring.length(), s.charAt(i));

        return longest_palindromic_substring.toString();
    }
}
