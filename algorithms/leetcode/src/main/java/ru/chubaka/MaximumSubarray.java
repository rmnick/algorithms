package ru.chubaka;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int cumSum = nums[0];
        int max = cumSum;
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int newSum = cumSum + curr;
            if (curr > newSum && curr > cumSum) {
                // start new
                cumSum = curr;
            } else {
                cumSum += curr;
            }
            if (cumSum > max) {
                max = cumSum;
            }
        }
        return max;
    }
}
