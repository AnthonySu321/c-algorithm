package com.sue.L704;

/**
 * @author Anthony
 * @create 2023-08-07 13:43
 */
class Solution {
    public int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + (right-left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5};
        int target = 5;

        int result = solution.search(nums, target);

        System.out.println("The target " + target + " is at index: " + result); // 输出 "The target 15 is at index: 7"
    }
}
//public class Main {
//    public static void main(String[] args) {
//        com.sue.L704.Main solution = new com.sue.L704.Solution();
//        int[] nums = {1, 3, 5,7,9};
//        int target = 5;
//
//        int result = solution.search(nums, target);
//
//        System.out.println("The target " + target + " is at index: " + result); // 输出 "The target 15 is at index: 7"
//    }
//}
