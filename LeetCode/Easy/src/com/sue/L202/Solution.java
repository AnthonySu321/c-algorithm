package com.sue.L202;

import java.util.HashSet;

/**
 * @author Anthony
 * @create 2022-10-31 11:28
 */
public class Solution {
    //创建一个私有类 getNext 返回相加的和
    //创建HashSet
    //while循环 当n！=1 而且 不包含n的时候 加入进去
    //返回n==1
    private int getNext(int n ){
        int res=0;
        while (n>0){
            int d=n%10;
            res=res+d*d;
            n=n/10;
        }
        return res;
    }
    public boolean isHappy(int n ){
        HashSet<Integer> seen = new HashSet<>();
        while (n!=1&& !seen.contains(n)){
            seen.add(n);
            n=getNext(n);
        }
        return n==1;
    }
}

class Solution1{
    public static void main(String[] args) {
        int n = 19;
        Solution s = new Solution();
        boolean ret = s.isHappy(n);
        System.out.println(ret);
    }
}