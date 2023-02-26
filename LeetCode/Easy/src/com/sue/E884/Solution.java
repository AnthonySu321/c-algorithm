package com.sue.E884;

/**
 * @author Anthony
 * @create 2022-11-23 11:53
 *
 *
 *
 *
 */
//
//class Solution {
//    public boolean backspaceCompare(String S, String T) {
//        return build(S).equals(build(T));
//    }
//
//    public String build(String str) {
//        StringBuffer ret = new StringBuffer();
//        int length = str.length();
//        for (int i = 0; i < length; ++i) {
//            char ch = str.charAt(i);
//            if (ch != '#') {
//                ret.append(ch);
//            } else {
//                if (ret.length() > 0) {
//                    ret.deleteCharAt(ret.length() - 1);
//                }
//            }
//        }
//        return ret.toString();
//    }
//}



class Solution {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }
    public String build(String str){
        StringBuffer ret = new StringBuffer();
        int len=str.length();
        for (int i =0;i<len;i++){
            char ch= str.charAt(i);
            if (ch!='#'){
                ret.append(ch);
            }else {
                if (ret.length()>0){

                    ret.deleteCharAt(ret.length()-1);
                }
            }
        }

        return ret.toString();
    }


}


class Main{
    public static void main(String[] args) {
        String str1 = new String("a##c");
        String str2 = new String("#a#c");
        Solution s = new Solution();
        boolean b = s.backspaceCompare(str1, str2);
        System.out.println(b);
    }
}
