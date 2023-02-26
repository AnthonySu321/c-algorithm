//TODO   int 和Integer的区别,为何我int就失败，Integer就成功？

package com.sue.L290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Anthony
 * @create 2022-10-31 17:54
 */class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        //字符和单词是互相映射，数量必须相等
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            /*
                如果key不存在，插入成功，返回null；如果key存在，返回之前对应的value。

                以pattern = "abba", str = "dog cat cat dog"为例，
                第1次：map.put('a',0)返回null，map.put("dog",0)返回null，两者相等；
                第2次：map.put('b',1)返回null，map.put("cat",1)返回null，两者相等；
                第3次：map.put('b',2)返回1，map.put("cat",2)返回1，两者相等；
                第4次：map.put('a',3)返回0，map.put("dog",3)返回0，两者相等，
                结果为 true。

                以pattern = "abba", str = "dog cat cat fish"为例，
                第1次：map.put('a',0)返回null，map.put("dog",0)返回null，两者相等；
                第2次：map.put('b',1)返回null，map.put("cat",1)返回null，两者相等；
                第3次：map.put('b',2)返回1，map.put("cat",2)返回1，两者相等；
                第4次：map.put('a',3)返回0，map.put("fish",3)返回null，两者不相等，
                结果为 false。
            */
            if (map.put(pattern.charAt(i), i) != map.put(words[i], i)) {
                return false;
            }
        }
        return true;
    }
}


class Main{
    public static void main(String[] args) {
        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
               String s ="s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        Solution s1 = new Solution();
        boolean res = s1.wordPattern(pattern,s);
        System.out.println(res);

        System.out.println("------------");
        Integer i1 = 140;
        Integer i2 = i1;
//        i1=Integer.valueOf(i1.intValue()+1);
        i1++;
        System.out.println(i2);
        System.out.println(i1);
        System.out.println(i2 == i1);
        System.out.println("------------");
        int i = 128;
        Integer j = i;
        Integer k = i;
        if(j == k){
            System.out.println("相等");
        }else {
            System.out.println("不等");
        }


    }
}