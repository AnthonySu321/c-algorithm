//package com.sue.L26;
//
///**
// * @author Anthony
// * @create 2023-08-09 11:41
// */
//class Solution {
//    public void moveZeroes(int[] nums) {
//        int slowIndex=0;
//        int length= nums.length;
//        for (int fastIndex=0;fastIndex<length;fastIndex++){
//            if (nums[fastIndex]!=0){
//                nums[slowIndex]=nums[fastIndex];
//                slowIndex++;
//            }
//
//        }
//
//        for (int i=slowIndex;i<length;i++){
//            nums[i]=0;
//        }
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        int[] nums1 = {1, 1, 2};
//        int len1 = solution.removeDuplicates(nums1);
//        System.out.println("New Length: " + len1);
//        System.out.print("New Array: ");
//        for (int i = 0; i < len1; i++) {
//            System.out.print(nums1[i] + " ");
//        }
//        System.out.println(); // Expected output: New Length: 2, New Array: 1 2
//
//        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int len2 = solution.removeDuplicates(nums2);
//        System.out.println("New Length: " + len2);
//        System.out.print("New Array: ");
//        for (int i = 0; i < len2; i++) {
//            System.out.print(nums2[i] + " ");
//        }
//        System.out.println(); // Expected output: New Length: 5, New Array: 0 1 2 3 4
//    }
//}
//
