package com.sue.E1385;

//import com.sue.E27.Solution1;

import java.util.Arrays;

/**
 * @author Anthony
 * @create 2023-02-26 23:44
 */
    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            Arrays.sort(arr2);
            int cnt=0;
            for (int x:arr1){
                boolean ok=true;
                int p=searchInsert(arr2,x);
                if (p<arr2.length){
                    ok&=Math.abs(arr2[p]-x) >d;
                }
                if (p-1>0){
                    ok&=Math.abs(arr2[p-1]-x)>d;
                }
                cnt+=ok?1:0;
            }
            return cnt;
        }


        public int searchInsert(int[] nums, int target) {
            int left=0,right=nums.length;
            while(left<right){
                int mid=(right-left)/2+left;
                if(nums[mid]==target){
                    return mid;
                }else if(nums[mid]<target){
                    left=mid+1;
                }else{
                    right=mid;
                }
            }
            return left;
        }
    }



class Main {
    public static void main(String[] args) {
        int[] arr1={-3,2,-5,7,1};
        int[] arr2={4};
        int d=84;
        Solution s = new Solution();
        int theDistanceValue = s.findTheDistanceValue(arr1, arr2, d);
        System.out.println(theDistanceValue);

    }
}