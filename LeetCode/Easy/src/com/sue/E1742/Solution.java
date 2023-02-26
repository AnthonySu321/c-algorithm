package com.sue.E1742;

import java.util.HashMap;

/**
 * @author Anthony
 * @create 2022-11-25 12:24
 */
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int res = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int x = i;
            int box = 0;
            while (x != 0) {
                box = box + x % 10;
                x = x / 10;
            }
            count.put(box, count.getOrDefault(box, 0) + 1);
            Integer j = count.get(box);
            res = Math.max(res, j);
        }

        return res;
    }
}

class Main {
    public static void main(String[] args) {

//
//        //格式1：运算符在操作数左边
//        /*
//        先将i自增1，然后赋值给j
//         */
//        int i = 10;
//        int j = ++i;
//        System.out.println("i=" + i + "\tj=" + j);//i=11 j=11
//        //格式2：运算符在操作数右边
//        /*
//        现将i本身的值取出来放在操作数栈中，然后i自增1，再用操作数栈中的10赋值给j
//         */
//        int i = 10;
//        int j = i++;
//        System.out.println("i=" + i + "\tj=" + j);//i=11 j=10
//        //格式3：混合运算
//
//        int i = 10;
//        int j = (i++) + (++i) * (i++);//j=10+12*12
//        System.out.println("i=" + i + "\tj=" + j);//i=13,j=154

    }
}