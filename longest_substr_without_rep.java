class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        char currChar;

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int j = 0, max = 0;

        // The main idea is to slide the window whenever a repetition is encountered
        //  and updating the startIndex of window to +1 of the index of repetition

        for (int i = 0;i < n;i++) {
            currChar = s.charAt(i);
            if (map.containsKey(currChar)) {
                j = Math.max(j, map.get(currChar)+1);
            }
            map.put(currChar, i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-interview-150