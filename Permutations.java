class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        List<Integer> currPerm = new ArrayList<>();
        HashSet<Integer> currPermSet = new HashSet<>();
        
        permutation(out, currPerm, nums, currPermSet);
        return out;
    }

    public void permutation(List<List<Integer>> out, List<Integer> currPerm, int[] nums, HashSet<Integer> currPermSet){
        if (currPerm.size() == nums.length) {
            out.add(new ArrayList<>(new ArrayList<Integer>(currPerm)));
            currPermSet = new HashSet<Integer>();
            return;
        }

        for (int i = 0;i < nums.length;i++) {
            if (!currPermSet.contains(nums[i])) {
                currPerm.add(nums[i]);
                currPermSet.add(nums[i]);
                
                permutation(out, currPerm, nums, currPermSet);
                
                var removedVal = currPerm.remove(currPerm.size() - 1);
                currPermSet.remove(removedVal);
            }
        }
    }
}

// https://leetcode.com/problems/permutations/submissions/?envType=study-plan-v2&envId=top-interview-150