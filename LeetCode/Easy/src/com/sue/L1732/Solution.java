package com.sue.L1732;

/**
 * @author Anthony
 * @create 2022-11-19 10:39
 */
class Solution {
    public int search(int[] nums, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }
}

class Main{
    public static void main(String[] args) {
        int [] a = {1,2,3,4,7,9,10};
        int k=-1;
        Solution s = new Solution();
        int res = s.search(a, k);
        System.out.println(res);
    }
}