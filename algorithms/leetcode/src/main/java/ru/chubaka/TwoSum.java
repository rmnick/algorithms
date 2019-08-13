package ru.chubaka;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */


public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (flag) {
                break;
            }
            a = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] == a) {
                    a = i;
                    b = j;
                    flag = true;
                    break;
                }
            }
        }
        int[] arr = {a, b};
        return arr;
    }
}

