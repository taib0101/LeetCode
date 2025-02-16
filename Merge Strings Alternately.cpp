// Author: Mustain Murtaza Taib
// LeetCode Problem: Merge Strings Alternately
// Link: https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
// Type: Basic
// Accepted

class Solution {
    public:
        string mergeAlternately(string word1, string word2) {
            string mergedWord = word1 + word2;
            int word1Length = word1.length();
            int word2Length = word2.length();
            int remind_I, remind_J;
    
            for(int i = 0, j = 0; i < word1Length && i < word2Length; i++, j+= 2) {
                mergedWord[j] = word1[i];
                mergedWord[j+1] = word2[i];
                remind_I = i+1;
                remind_J = j+2;
            }
            
            if( word1Length < word2Length) word1 = word2, word1Length = word1.length();
    
            for(int i = remind_I, j = remind_J; i < word1Length; i++, j++)
                mergedWord[j] = word1[i];
    
            return mergedWord;
        }
    };