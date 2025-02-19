// Author: Mustain Murtaza Taib
// LeetCode Problem: Can Place Flowers
// Link: https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
// Type: Basic Medium
// Accepted

// My Solution
class Solution {
    public int flowerbedPlantCount(List <Integer> selector, int[] flowerbed) {
        int flowerbedSize = flowerbed.length;
        int count = 0;

        if(flowerbedSize == 1)
            return (flowerbed[0] == 0) ? count + 1 : count;

        for(int index: selector) {
            if (index != 0 && index != flowerbedSize - 1) {
                flowerbed[index+1] = 1;
                flowerbed[index-1] = 1;
            } else if (index == 0) {
                flowerbed[index+1] = 1;
            } else {
                flowerbed[index-1] = 1;
            }
            // System.out.println(index);
        }

        for(int i = 0; i < flowerbedSize; ++i) {
            if(flowerbed[i] == 0) {
                if(i != 0 && i != flowerbedSize-1) {
                    flowerbed[i+1] = 1;
                    flowerbed[i-1] = 1;
                } else if(i == 0) {
                    flowerbed[i+1] = 1;
                } else {
                    flowerbed[i-1] = 1;
                }
                count++;
            }
        }

        return count;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        List <Integer> selector = new ArrayList<> ();

        for(int i = 0; i < flowerbed.length; ++i) {
            if(flowerbed[i] == 1)
                selector.add(i);
        }

        int count = flowerbedPlantCount(selector, flowerbed);        

        if(count < n)
            return false;
            
        return true;
    }
}