package com.sue.E283;

/**
 * @author Anthony
 * @create 2022-11-23 9:31
 */

/*
    public void moveZeroes(int[] nums) {
        if(nums==null) {
            return;
        }
        //两个指针i和j
        int j = 0;
        for(int i=0;i<nums.length;i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if(nums[i]!=0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
 */
class Solution {
//    public void moveZeroes(int[] nums) {
//        if (nums==null){
//            return;
//        }
//        int j=0;
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]!=0){
//                int temp=nums[i];
//                nums[i]=nums[j];
//                nums[j++]=temp;
//            }
//        }
//    }
    public void moveZeroes(int[] nums)  {
        if (nums==null){
            return;
        }
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                if (i>j){
                    nums[j]=nums[i];
                    nums[i]=0;
                }
                j++;
            }
        }

    }
}


class Main{
    public static void main(String[] args) {
        int[] nums={2,1,4,3,12};
        Solution s = new Solution();
        s.moveZeroes(nums);
    }
}