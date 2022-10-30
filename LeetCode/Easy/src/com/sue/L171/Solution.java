package com.sue.L171;

/**
 * @author Anthony
 * @create 2022-10-30 16:56
 */
class Solution {
    public int titleToNumber(String columnTitle) {
        int number=0;
        int multiple=1;
        for(int i =columnTitle.length()-1;i>=0;--i){
            int res=columnTitle.charAt(i)-'A'+1;
            number=number+res*multiple;
            multiple=multiple*26;
        }
        return number;
    }
}