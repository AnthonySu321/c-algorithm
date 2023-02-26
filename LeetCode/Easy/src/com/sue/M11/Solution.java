package com.sue.M11;

/**
 * @author Anthony
 * @create 2022-11-24 20:05
 */
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        while (left<right){
            int area = (right - left) * Math.min(height[left], height[right]);
//            int area=(right-left)*Math.min(height[left],height[right]);
            ans=Math.max(ans,area);
            if (height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ans;
    }
}

class Main{
    public static void main(String[] args) {
        String s="sdasd";
        String S="sdasd";
    }
}
