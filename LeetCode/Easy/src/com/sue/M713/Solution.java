package com.sue.M713;

/**
 * @author Anthony
 * @create 2022-11-26 16:30
 */
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<=1){
            return 0;
        }

        int ans=0;
        int len=nums.length;
        int right=0;
        int left=0;
        int prod=1;
        while (right<len){
            prod=prod*nums[right];
            while (prod>=k){
                prod=prod/nums[left];
                left++;
            }
            ans=ans+(right-left+1);
            right++;
        }
        return ans;
    }
}


class Main{
    public static void main(String[] args) {
        int []nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
                int k = 19;
        Solution s = new Solution();
        int i = s.numSubarrayProductLessThanK(nums, k);
        System.out.println(i);
    }
}