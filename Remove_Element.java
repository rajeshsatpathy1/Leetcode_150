class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        int valCount = 0;

        for(int i=0;i<n;i++){
            if(nums[i] == val)
                valCount++;
            else{
                nums[k] = nums[i];
                k++;
            }
        }
        return n-valCount;
    }
}

// https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150