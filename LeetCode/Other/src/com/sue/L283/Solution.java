package com.sue.L283;

/**
 * @author Anthony
 * @create 2023-08-09 11:45
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int slowIndex=0;
        int length= nums.length;
        for (int fastIndex=0;fastIndex<length;fastIndex++){
            if (nums[fastIndex]!=0){
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }

        }

        for (int i=slowIndex;i<length;i++){
            nums[i]=0;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.print("New Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Expected output: New Array: 1 3 12 0 0

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.print("New Array: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Expected output: New Array: 0
    }
}
