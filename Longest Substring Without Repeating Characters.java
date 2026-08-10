// Author: Mustain Murtaza Taib
// LeetCode Problem: Longest Substring Without Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
// Type: Sliding Window (Medium) 
// Accepted


import java.util.HashSet;
import java.util.Set;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int string_size = s.length();

        if(string_size == 0)
            return 0;
        
        int length = 1;

        int i = 0;
        int j = i + 1;

        Set<Character> set = new HashSet<>();

        set.add(s.charAt(i));

        while(i < string_size && j < string_size) {

            char character = s.charAt(j);

            if(!set.contains(character)) {
                length = Math.max(length, j-i+1);
                set.add(character);
                j++;
            } else {
                System.out.println(character);
                set.remove(s.charAt(i));
                i++;
            }
        }

    
        return length;
    }
}