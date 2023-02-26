package com.sue.L1662;

/**
 * @author Anthony
 * @create 2022-11-01 10:08
 */

//拼接字符串
class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return join(word1).equals(join(word2));
    }
    public String join(String[] word){
        StringBuffer ret = new StringBuffer();
        for (String s :word){
            ret.append(s);
        }
        return ret.toString();
    }
}

//遍历
