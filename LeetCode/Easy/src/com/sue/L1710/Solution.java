package com.sue.L1710;



import java.util.Arrays;

/**
 * @author Anthony
 * @create 2022-11-17 11:44
 */
class Solution1 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int res = 0;
        for (int[] boxType : boxTypes) {
            int numberOfBoxes = boxType[0];
            int numberOfUnitsPerBox = boxType[1];
            if (numberOfBoxes < truckSize) {
                res += numberOfBoxes * numberOfUnitsPerBox;
                truckSize -= numberOfBoxes;
            } else {
                res += truckSize * numberOfUnitsPerBox;
                break;
            }
        }
        return res;
    }
}

class Solution{

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->a[1]-b[1]);//排序
        int res=0;
        for (int[] boxType:boxTypes){
            int numberOfBoxes=boxType[0];
            int numberOfUnitsPerBox=boxType[1];
            if (numberOfBoxes<truckSize){
                res=res+numberOfBoxes*numberOfUnitsPerBox;
                truckSize=truckSize-numberOfBoxes;
            }else {
                res=res+truckSize*numberOfUnitsPerBox;
                break;
            }


        }
        return res;
    }
}


class Main{
    public static void main(String[] args) {
        int [][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
//        int [][] boxTypes = [[5,10],[2,5],[4,7],[3,9]];
        int truckSize = 10;
        Solution s = new Solution();
        int res = s.maximumUnits(boxTypes, truckSize);
        System.out.println(res);
    }
}