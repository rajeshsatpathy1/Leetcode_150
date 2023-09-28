class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        for(int k = 1;k < nums.length;k++){
            if(nums[k] != nums[k-1]){
                nums[i] = nums[k];
                i++;
            }
        }
        return i;
    }
}

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150