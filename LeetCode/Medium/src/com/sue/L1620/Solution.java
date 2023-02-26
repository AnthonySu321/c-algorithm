package com.sue.L1620;

/**
 * @author Anthony
 * @create 2022-11-02 22:35
 */
class Solution {
    public int[] bestCoordinate(int[][] towers, int radius) {
        int xMax = Integer.MIN_VALUE, yMax = Integer.MIN_VALUE;
        for (int[] tower : towers) {
            int x = tower[0], y = tower[1];
            xMax = Math.max(xMax, x);
            yMax = Math.max(yMax, y);
        }
        int cx = 0, cy = 0;
        int maxQuality = 0;
        for (int x = 0; x <= xMax; x++) {
            for (int y = 0; y <= yMax; y++) {
                int[] coordinate = {x, y};
                int quality = 0;
                for (int[] tower : towers) {
                    int squaredDistance = getSquaredDistance(coordinate, tower);
                    if (squaredDistance <= radius * radius) {
                        double distance = Math.sqrt(squaredDistance);
                        quality += (int) Math.floor(tower[2] / (1 + distance));
                    }
                }
                if (quality > maxQuality) {
                    cx = x;
                    cy = y;
                    maxQuality = quality;
                }
            }
        }
        return new int[]{cx, cy};
    }

    public int getSquaredDistance(int[] coordinate, int[] tower) {
        return (tower[0] - coordinate[0]) * (tower[0] - coordinate[0]) + (tower[1] - coordinate[1]) * (tower[1] - coordinate[1]);
    }
}


class Solution1{
    public static void main(String[] args) {
//        towers = [[1,2,5],[2,1,7],[3,1,9]], radius = 2
        int[][] array ={{1,2,5},{2,1,7},{3,1,9}};
        int radius = 2;
        Solution s = new Solution();
        int[] res = s.bestCoordinate(array, radius);
        System.out.println(res[0]);
        System.out.println(res[1]);
//        res.forEach(System.out::println);

    }
}