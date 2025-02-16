// LeetCode Trapping Rain Water
// Type Two Pointers
// Accepted

class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();

        int maxLeft = height[0], maxRight = height[n-1];
        int left = 0, right = n-1;
        int result = 0;

        while(left < right) {
            if (maxLeft < maxRight) {
                result += maxLeft - height[left++];
                maxLeft = max(maxLeft, height[left]);
            } else {
                result += maxRight - height[right--];
                maxRight = max(maxRight, height[right]);
            }
        }

        return result;
    }
};
