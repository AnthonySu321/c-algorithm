package com.sue.E6249;

/**
 * @author Anthony
 * @create 2022-11-26 22:40
 */
class Solution {
    public int pivotInteger(int n) {

        for (int i=1;i<=n;i++){
            int resLeft=0;
            int resRight=0;
            for (int k=1;k<=i;k++){
                resLeft=resLeft+k;
            }

            for (int m=i;m<=n;m++){
                resRight=resRight+m;
            }
            if (resRight==resLeft){
                return i;
            }
        }
        return -1;
    }
}

class Main{
    public static void main(String[] args) {
        int n=8;
        Solution s = new Solution();
        int i = s.pivotInteger(8);
        System.out.println(i);
    }
}