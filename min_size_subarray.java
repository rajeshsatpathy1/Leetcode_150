import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j = 0, sum_i = 0;
        var n = nums.length;
        var out = Integer.MAX_VALUE;

        for (int i=0;i < n;i++){
            sum_i += nums[i];

            while (sum_i >= target) {
                sum_i -= nums[j];
                out = Math.min(out, i-j+1);
                j += 1;
            }
        }

        if (out == Integer.MAX_VALUE) return 0;

        return out;
    }
}

// https://leetcode.com/problems/minimum-size-subarray-sum/submissions/?envType=study-plan-v2&envId=top-interview-150