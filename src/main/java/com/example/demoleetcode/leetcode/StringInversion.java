package com.example.demoleetcode.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * 字符串反转
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 *
 * @author zhaohui
 * @create 2019/6/19 7:19 PM
 */
public class StringInversion {

    public void reverseString(char[] s) {
        s = getSortChar(s, 0, s.length - 1);
        List<String> list = new ArrayList<>();
        for (char sChar : s) {
            list.add(String.valueOf(sChar));
        }
        System.out.println(list.toString());
    }

    public char[] getSortChar(char[] s, int a, int b) {
        if (a >= b) {
            return s;
        } else {
            char ss = s[a];
            s[a] = s[b];
            s[b] = ss;
            getSortChar(s, a + 1, b - 1);
        }
        return s;
    }

    public static void main(String[] args) {
        StringInversion stringInversion = new StringInversion();
        char[] s = "hello".toCharArray();
        stringInversion.reverseString(s);
    }

}
