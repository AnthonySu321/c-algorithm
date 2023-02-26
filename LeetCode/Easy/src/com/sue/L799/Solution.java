package com.sue.L799;

/**
 * @author Anthony
 * @create 2022-11-20 12:04
 */
class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] row = {poured};
        for (int i = 1; i <= query_row; i++) {
            double[] nextRow = new double[i + 1];//这是初始化列表长度是i+1
//            double [] nextRow={i+1};//这是初始化长度为1的列表值为i+1
            for (int j = 0; j < i; j++) {
                double volume = row[j];
                if (volume > 1) {
                    nextRow[j] += (volume - 1) / 2;
                    nextRow[j + 1] += (volume - 1) / 2;
                }
            }
            row = nextRow;
        }
        return Math.min(1, row[query_glass]);
    }
}


class Main{
    public static void main(String[] args) {
        int poured = 10, query_row = 2, query_glass = 2;
        Solution s = new Solution();
        double res = s.champagneTower(poured, query_row, query_glass);
        System.out.println(res);
    }
}
