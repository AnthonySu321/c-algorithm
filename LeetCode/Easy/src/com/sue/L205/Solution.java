package com.sue.L205;

/**
 * @author Anthony
 * @create 2022-10-31 17:38
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); ++i) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

class Main{
    public static void main(String[] args) {
        String s1="foo";
        String s2="bar";
        Solution s = new Solution();
        boolean res = s.isIsomorphic(s1, s2);
        System.out.println(res);
    }
}
