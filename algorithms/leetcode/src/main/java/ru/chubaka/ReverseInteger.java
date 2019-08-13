package ru.chubaka;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 *
 * Example 2:
 *
 * Input: -123
 * Output: -321
 *
 * Example 3:
 *
 * Input: 120
 * Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseInteger {
    public int reverse(int x) {
        long result = 0;
        int num = Math.abs(x);
        while (num > 0) {
            result = result * 10 + num % 10;
            num = num / 10;
        }
        if (result > Integer.MAX_VALUE) {
            return 0;
        }
        return x < 0 ? -(int) result : (int) result;
    }
}
