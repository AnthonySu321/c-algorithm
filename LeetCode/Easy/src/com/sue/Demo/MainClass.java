package com.sue.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
    private int[] v;
    private int[][] memo;

    public int minScoreTriangulation(int[] values) {
        v = values;
        int n = v.length;
        memo = new int[n][n];
        for (int i = 0; i < n; ++i)
            Arrays.fill(memo[i], -1); // -1 表示没有访问过
        return dfs(0, n - 1);
    }

    private int dfs(int i, int j) {
        if (i + 1 == j) return 0; // 只有两个点，无法组成三角形
        if (memo[i][j] != -1) return memo[i][j];
        int res = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; ++k) // 枚举顶点 k
            res = Math.min(res, dfs(i, k) + dfs(k, j) + v[i] * v[j] * v[k]);
        return memo[i][j] = res;
    }
}



public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] values = stringToIntegerArray(line);

            int ret = new Solution().minScoreTriangulation(values);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}