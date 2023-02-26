package com.sue.L1704;

/**
 * @author Anthony
 * @create 2022-11-12 23:03
 */
class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        String h = "aeiouAEIOU";
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < a.length(); i++) {
            if (h.indexOf(a.charAt(i)) >= 0) {
                sum1++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (h.indexOf(b.charAt(i)) >= 0) {
                sum2++;
            }
        }
        return sum1 == sum2;
    }
}


class Solution1{
    public static void main(String[] args) {
        String s1 = "textbook";
        Solution s = new Solution();
        boolean b = s.halvesAreAlike(s1);
        System.out.println(b);
    }
}
