package com.sue.E367;

/**
 * @author Anthony
 * @create 2022-11-22 9:45
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        int left=0;
        int right=num;
        while (left<right){
            int mid=left+((right-left)>>1);
            long square=(long)mid *mid;
            if (square<num){
                left=mid+1;
            }else if (square>num){
                right=mid-1;
            }else {
                return true;
            }
        }
        if (left*left==num){
            return true;
        }else {

            return false;
        }
//        return false;
    }
}


class Main{
    public static void main(String[] args) {
        int num = 14;
        Solution s = new Solution();
        boolean perfectSquare = s.isPerfectSquare(num);
        System.out.println(perfectSquare);
    }
}