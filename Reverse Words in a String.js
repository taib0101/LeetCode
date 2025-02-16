// Author: Mustain Murtaza Taib
// LeetCode Problem: Reverse Words in a String
// Link: https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
// Type: Basic Medium
// Accepted

let reverseWords = (str) => {
    let arrayWords = str.split(" ");
    arrayWords = arrayWords.filter(value => value !== "");
    
    return arrayWords.reverse().join(" ");
};