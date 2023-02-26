package com.sue.E26;

/**
 * @author Anthony
 * @create 2022-11-22 11:56
 */
class Solution{
public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q])
            {
                nums[p + 1] = nums[q];
                p++;}

            q++;
        }
        return p + 1;
  }
}

class Solution1{
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        int q=0;

        for (int p=1;p<l;){
            if (nums[p]==nums[q]){

                p++;
            }else {
                if (p-q>1){//当p、q距离大于1时才进行复制

                    nums[q+1]=nums[p];
                }
                q++;
                p++;
            }
        }
        return q+1;
    }
}

class Main{
    public static void main(String[] args) {
        int []nums = {1,1,2};
        Solution s = new Solution();
        int i = s.removeDuplicates(nums);
        System.out.println(i);

        Solution1 solution1 = new Solution1();
        int i1 = solution1.removeDuplicates(nums);
        System.out.println(i1);
    }
}

