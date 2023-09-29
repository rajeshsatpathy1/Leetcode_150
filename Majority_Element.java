import java.util.*;

// This solution was made by Boyer Moore and also has a paper on it
// Here's a simpler youtube explanation: https://www.youtube.com/watch?v=n5QY3x_GNDg
// Time Complexity: O(n), Space Complexity: O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;

        for(int i=1;i<nums.length;i++){
            if(count == 0){
                count++;
                major = nums[i];
            }else if(major == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return major;
    }
}

// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

// Smaller but inefficient solution
import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}