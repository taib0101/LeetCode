// Author: Mustain Murtaza Taib
// LeetCode Problem: Kids With the Greatest Number of Candies
// Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
// Type: Basic Medium
// Accepted

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<> ();
        int maxCandies = 0;

        for(int i = 0; i < candies.length; ++i)
            maxCandies = Math.max(maxCandies, candies[i]);
        
        for(int value: candies)
            result.add(value + extraCandies >= maxCandies);
        return result;
    }
}