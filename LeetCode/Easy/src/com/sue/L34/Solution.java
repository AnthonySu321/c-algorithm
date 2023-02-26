package com.sue.L34;

/**
 * @author Anthony
 * @create 2022-11-21 17:59
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = nums.length;
        if (l == 0) {
            return new int[]{-1, -1};
        }
        int firstPosition = findFirstPosition(nums, target);
        if (firstPosition == -1) {
            return new int[]{-1, -1};

        }
        int lastPosition = findLastPosition(nums, target);
        return new int[]{firstPosition, lastPosition};

    }

    private int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = left + ((right - left) >> 1);
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] == target) {
                right = middle;
            } else {
                right = middle - 1;
            }
        }
        if (nums[left] == target) {
            return left;
        } else {
            return -1;
        }

    }

    private int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle =  ((left + right +1) >> 1);
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] == target) {
                left = middle;
            } else {
                right = middle - 1;
            }
        }
        return left;

    }
}

class Main{
    public static void main(String[] args) {
        int []nums =   {5,7,7,8,8,10};
        int target = 8;
        Solution s = new Solution();
        int[] res = s.searchRange(nums, target);
//        System.out.println(res);
        for(int a:res)System.out.println(a);
    }

}