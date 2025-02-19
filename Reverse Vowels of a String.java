// Author: Mustain Murtaza Taib
// LeetCode Problem: Reverse Vowels of a String
// Link: https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
// Type: Basic 
// Accepted

class Solution {
    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public List<Integer> findVowelIndex(String str) {
        List<Integer> index = new ArrayList<> ();
        int stringLength = str.length();
        
        for(int i = 0; i < stringLength; ++i) {
            if(isVowel(str.charAt(i)))
                index.add(i);
        }

        return index;
    }
    public String reverseVowels(String s) {
        List<Integer> vowelIndex = findVowelIndex(s);

        int vowelIndexSize = vowelIndex.size() / 2;
        char[] charArray = s.toCharArray();

        for(int i = 0, j = vowelIndex.size()-1; i < vowelIndexSize; ++i, --j) {
            char temp = charArray[vowelIndex.get(i)];
            charArray[vowelIndex.get(i)] = charArray[vowelIndex.get(j)];
            charArray[vowelIndex.get(j)] = temp;
        }
        return new String(charArray);
    }
}