package com.sue.L1281;

/**
 * @author Anthony
 * @create 2023-08-09 9:40
 */
public class Solution {
    public int subtractProductAndSum(int n) {
        int length=Integer.toString(n).length();
        int multi=1;
        int add =0;
        int num=0;

        for(int i=0;i<length;i++){
            int quotient=n/10;
            int remainder=n%10;

            n=quotient;

            multi=multi*remainder;
            add=add + remainder;
        }

        return multi-add;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n1 = 234;
        System.out.println("Input: " + n1);
        System.out.println("Output: " + solution.subtractProductAndSum(n1)); // Expected output: 15

        int n2 = 4421;
        System.out.println("Input: " + n2);
        System.out.println("Output: " + solution.subtractProductAndSum(n2)); // Expected output: 21
    }
}
