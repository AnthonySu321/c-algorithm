package com.sue.L977;

/**
 * @author Anthony
 * @create 2023-08-15 13:04
 */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int k=nums.length-1;
        int [] result=new int [nums.length];
        for (int i =0,j=nums.length-1 ;i<=j; ) {
            if (nums[i]*nums[i]>nums[j]*nums[j]) {
                result[k]=nums[i]*nums[i];
                k--;
                i++;
            }else{
                result[k]=nums[j]*nums[j];
                k--;
                j--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] testCases = {
                {-4, -1, 0, 3, 10},
                {-7, -3, 2, 3, 11},
                {1, 2, 3, 4, 5},
                {-5, -4, -3, -2, -1}
        };

        for (int[] testCase : testCases) {
            int[] result = solution.sortedSquares(testCase);
            System.out.print("Input: [");
            for (int num : testCase) {
                System.out.print(num + " ");
            }
            System.out.print("], Output: [");
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }
}
