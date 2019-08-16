package ru.chubaka;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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

    public ValidParentheses() {
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
    }

    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                st.push(map.get(arr[i]));
            } else if (map.containsValue(arr[i])) {
                if (st.isEmpty() || st.pop() != arr[i]) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
