package com.sue.M209;

import com.sue.L202.Solution;

import java.util.Arrays;

/**
 * @author Anthony
 * @create 2022-11-23 14:47
 */
//class Solution{
//    public int minSubArrayLen(int s, int[] nums) {
//        int n = nums.length;
//        if (n == 0) {
//            return 0;
//        }
//        int ans = Integer.MAX_VALUE;
//        int start = 0, end = 0;
//        int sum = 0;
//        while (end < n) {
//            sum += nums[end];
//            while (sum >= s) {
//                ans = Math.min(ans, end - start + 1);
//                sum -= nums[start];
//                start++;
//            }
//            end++;
//        }
//        return ans == Integer.MAX_VALUE ? 0 : ans;
//    }
//}
//class Solution{
//    public int minSubArrayLen(int target, int[] nums) {
//        int n= nums.length;
//        if (n==0){
//            return 0;
//        }
//        int ans=Integer.MAX_VALUE;
//        int start=0;
//        int end=0;
//        int sum=0;
//        while (end<n){
//            sum=sum+nums[end];
//            while (sum>=target){
//                ans=Math.min(end-start+1,ans);
//                sum=sum-nums[start];
//                start+++;
//            }
//            end++;
//        }
//        return  ans==Integer.MAX_VALUE?0:ans;//针对的是target=11 nums=[1,1,1,1]
//    }
//}



class Main{
    public static void main(String[] args) {
        int target = 4;
        int[]nums ={1,1,1,6,5,7};
        Solution s = new Solution();
//        int i = s.minSubArrayLen(target, nums);
//        System.out.println(i);
    }
}
