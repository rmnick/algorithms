package ru.chubaka;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 *
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 *
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 *
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 *
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 *
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */

public class ValidParentheses {
    public static Map<Character, Character> map = new HashMap();
    static {
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
    }

    public static boolean isValid(String s) {
        boolean result = true;
        boolean flag = false;
        char[] arr = s.toCharArray();
        if (arr.length % 2 != 0 || arr.length == 1) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                return false;
            }
            if (map.get(arr[i]) == arr[i + 1]) {
                i++;
            } else {
                for (int j = i + 3; j < arr.length; j += 2) {
                    if (map.get(arr[i]) == arr[j]) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(isValid("(([]){})"));
    }
}
