class Solution {
    public void rotate(int[] nums, int k) {
        int[] numsTemp = new int[nums.length];
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            numsTemp[(i+k)%n] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = numsTemp[i];
        }
    }
}

// https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

// Another solution is: reverse the whole array -> reverse till k -> reverse k to end: The number of rotations k should be modded with n before operation