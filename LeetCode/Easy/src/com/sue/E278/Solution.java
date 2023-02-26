package com.sue.E278;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Anthony
 * @create 2023-02-21 23:12
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

class Solution {
    public int countOdds(int low, int high) {
        if(low % 2 == 1){
            --low;
            System.out.println(low);
        }
        if(high % 2 == 1){
            ++high;
            System.out.println(high);
        }
        return (high - low) / 2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.countOdds(5,7);
    }
}



