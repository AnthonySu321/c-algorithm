package com.sue.L168;

/**
 * @author Anthony
 * @create 2022-10-30 17:18
 */
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber>0){
            int a0=(columnNumber-1)%26+1;
            char num = (char) (a0 - 1 + 'A');
            sb.append(num);
            columnNumber=(columnNumber-a0)/26;
        }
        return sb.reverse().toString();
    }
}
