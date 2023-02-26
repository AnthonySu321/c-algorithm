package com.sue.L6241;

/**
 * @author Anthony
 * @create 2022-11-20 10:37
 */
class Solution {
    public int unequalTriplets(int[] nums) {
        int l=nums.length;
        int res=0;
        for (int i=0;i<l;i++){
            for (int j=i;j<l;j++){
                for (int k=j;k<l;k++){
                    if (nums[i]!=nums[j] & nums[i] != nums[k] & nums[j] != nums[k]){
                        res=res+1;
                    }
                }
            }
        }
        return res;
    }
}
