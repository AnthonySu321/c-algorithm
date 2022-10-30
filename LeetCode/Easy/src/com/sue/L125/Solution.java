package com.sue.L125;

/**
 * @author Anthony
 * @create 2022-10-30 16:19
 */
class Solution {
    public boolean isPalindrome(String s) {
        //sgood= new StringBuffer();
        //ch=charAt(i);
        //Character.isLetterOrDigit(ch)
        //sgood.append(Character.toLowerCase(ch))
        //sgood_rev=new StringBuffer(sgood).reverse()
        //sgood.toString().equals(sgood_rev.toString())
        StringBuffer sgood = new StringBuffer();
        int L=s.length();
        for (int i =0;i<L;++i){
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }
}

class Solution1{
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Solution sou = new Solution();
        boolean res = sou.isPalindrome(s);
        System.out.println(res);
    }
}
