package com.sue.L1684;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anthony
 * @create 2022-11-08 9:40
 */
class Solution {
    /*
    暴力穷搜
     */
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        int ans = 0;
        for (String word : words) {
            boolean ok = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    ok =false;
                    break;
                }
            }
            if (ok) ans++;
        }
        return ans;
    }
}


class Solution1{
    /*
    按位运算
     */
    public int countConsistentStrings(String allowed, String[] words) {
        int mask=0;
        for (int i=0;i<allowed.length();i++){
            char c=allowed.charAt(i);
            mask=mask|(1<<(c-'a'));//  a<<i 其中a前为要移动的数，i为要移动的位数  java严格区分单双引号

        }
        int res=0;

        for (String word :words){
            int mask1=0;
            for (int j=0;j<word.length();j++){
                char s=word.charAt(j);
                mask1|=1<<(s-'a');
            }
            if((mask1|mask)==mask){
                res++;
            }
        }
        return res;
    }
}



//allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
class SolutionMain{
    public static void main(String[] args) {
        String a = "cad";
        String[] str = new String[]{"cc","acd","b","ba","bac","bad","ac","d"};
        Solution s = new Solution();
        int i = s.countConsistentStrings(a, str);

//        Solution1 s1 = new Solution1();
//        int i = s1.countConsistentStrings(a, str);
        System.out.println(i);

    }
}
