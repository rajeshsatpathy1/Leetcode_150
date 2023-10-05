import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        var n = citations.length;
        int[] buckets = new int[n+1];

        // Put the citations in out of bounds bucket or bucket of citations
        // This is because the h-index can never be in an out of bound bucket
        for(int citation: citations){
            if(citation >= n) {
                buckets[n]++;
            } else {
                buckets[citation]++;
            }
        }

        // Increase the count by adding buckets from the last to satisfy the at least rule
        // Check for all the numbers below n for if they satisfy the count cumulative
        var count = 0;
        for(int i = n;i >= 0;i--) {
            count += buckets[i];
            if(i <= count){
                return i;
            }
        }

        return 0;

    }
}

// https://leetcode.com/problems/h-index/description/?envType=study-plan-v2&envId=top-interview-150