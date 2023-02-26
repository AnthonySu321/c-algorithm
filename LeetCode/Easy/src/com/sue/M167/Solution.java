package com.sue.M167;

/**
 * @author Anthony
 * @create 2022-11-27 11:21
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int res=0;
        for (;;){
            res=numbers[left]+numbers[right];
            if (res==target){
                return new int[] {left+1,right+1};
            }else if (res<target){
                left++;
            }else {
                right--;
            }
        }
    }
}