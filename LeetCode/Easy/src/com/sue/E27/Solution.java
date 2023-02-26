package com.sue.E27;

import com.sun.xml.internal.bind.v2.model.core.EnumLeafInfo;

/**
 * @author Anthony
 * @create 2022-11-22 10:08
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int l = nums.length;
        int left = 0;

        for (int right = 0; right < l; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}

class Solution1{
    /*
    双指针
     */
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            if (nums[left]==val){
                nums[left]= nums[right];
                right--;
            }else {
                left++;
            }

        }
        return left;
    }


}

class Main {
    public static void main(String[] args) {

//        Solution s = new Solution();
        Solution1 solution1 = new Solution1();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int i1 = solution1.removeElement(nums, val);
//        int i = s.removeElement(nums, val);
        System.out.println(i1);

    }
}