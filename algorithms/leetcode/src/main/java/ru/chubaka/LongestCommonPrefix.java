package ru.chubaka;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int point = 0;
        Map<Character, Character> map = new HashMap();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        if (strs.length == 0) {
            return "";
        }
        while (flag) {
            int start = 0;
            String s = "";
            for (String str : strs) {
                char[] arr = str.toCharArray();
                if (point < arr.length && start == 0) {
                    map.put(arr[point], 'c');
                } else {
                    if (point >= arr.length || map.put(arr[point], 'c') == null) {
                        flag = false;
                        s = "";
                        break;
                    }
                }
                start++;
                if (flag) {
                    s = String.valueOf(arr[point]);
                }
            }
            sb.append(s);
            point++;
            map.clear();
        }
        return sb.toString();
    }

}
