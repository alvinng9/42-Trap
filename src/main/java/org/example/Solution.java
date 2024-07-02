package org.example;

public class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int sum = 0;
        int maxL = height[left];
        int maxR = height[right];
        while (left < right) {
            if (height[left] < height[right]) {
                if (maxL - height[left] > 0) {
                    sum += (maxL - height[left]);
                }
                maxL = Math.max(maxL, height[left]);
                left++;
            } else {
                if (maxR - height[right] > 0) {
                    sum += (maxR - height[right]);
                }
                maxR = Math.max(maxR, height[right]);
                right--;
            }
        }
        return sum;
    }
}
