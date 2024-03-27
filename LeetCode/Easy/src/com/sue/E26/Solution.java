import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) { // 使用 hasNextLine 读取整行字符串
            String input = in.nextLine();
            StringBuilder upperCase = new StringBuilder();
            StringBuilder lowerCase = new StringBuilder();
            StringBuilder digits = new StringBuilder();

            // 遍历字符串，按类别收集字符
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    upperCase.append(c);
                } else if (Character.isLowerCase(c)) {
                    lowerCase.append(c);
                } else if (Character.isDigit(c)) {
                    digits.append(c);
                }
            }

            // 对每个分类进行排序
            char[] upperChars = upperCase.toString().toCharArray();
            Arrays.sort(upperChars);
            char[] lowerChars = lowerCase.toString().toCharArray();
            Arrays.sort(lowerChars);
            char[] digitChars = digits.toString().toCharArray();
            Arrays.sort(digitChars);

            // 合并并输出结果
            System.out.println(new String(upperChars) + new String(lowerChars) + new String(digitChars));
        }
    }
}
