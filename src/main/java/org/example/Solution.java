package org.example;

public class Solution {
    public int trap(int[] height) {
        //create two pointers, one at each end
        int left = 0;
        int right = height.length - 1;
        //find the maximum height of the left/right side
        int maxL = height[left];
        int maxR = height[right];
        int result = 0;
        //going through the rain array
        while (left < right) {
            //check if the current height on the left is less than the current height
            //on the right
            if (height[left] < height[right]) {
                //if the maximum height on the left is bigger than the current height
                //on the left, add the different to the total rain
                if (maxL - height[left] > 0) {
                    result += maxL - height[left];
                }
                //update the maximum height on the left
                maxL = Math.max(maxL, height[left]);
                //move the left pointer up
                left++;
            } else {
                //if the maximum height on the right is bigger than the current height
                //on the right, add the different to the total rain
                if (maxR - height[right] > 0) {
                    result += maxR - height[right];
                }
                //update the maximum height on the right
                maxR = Math.max(maxR, height[right]);
                //move the left pointer down
                right--;
            }
        }
        return result;
    }
}
