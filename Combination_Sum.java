class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> out = new ArrayList<>();
        List<Integer> currCombo = new ArrayList<>();
        
        dfsGenerate(candidates, target, currCombo, 0, 0, out);
        return out;
    }

    public void dfsGenerate(int[] candidates, int target, List<Integer> currCombo, int currSum, int currIndex, List<List<Integer>> out) {
        if (currSum > target) return;

        if (currSum == target) {
            out.add(new ArrayList<Integer>(currCombo));
            return;
        }

        for (int i = currIndex; i < candidates.length;i++){
            currCombo.add(candidates[i]);
            currSum += candidates[i];

            dfsGenerate(candidates, target, currCombo, currSum, i, out);
            currCombo.remove(currCombo.size()-1);
            currSum -= candidates[i];
        }
    }
}

// https://leetcode.com/problems/combination-sum/description/?envType=study-plan-v2&envId=top-interview-150