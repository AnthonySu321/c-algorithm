package com.sue.L27;

/**
 * @author Anthony
 * @create 2023-08-09 10:36
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        int slowIndex=0;
        for (int fastIndex=0; fastIndex<length;fastIndex++){
            if (nums[fastIndex]!=val){
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}


class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int len1 = solution.removeElement(nums1, val1);
        System.out.println("New Length: " + len1);
        System.out.print("New Array: ");
        for (int i = 0; i < len1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println(); // Expected output: New Length: 2, New Array: 2 2

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int len2 = solution.removeElement(nums2, val2);
        System.out.println("New Length: " + len2);
        System.out.print("New Array: ");
        for (int i = 0; i < len2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println(); // Expected output: New Length: 5, New Array: 0 1 4 0 3
    }
}

