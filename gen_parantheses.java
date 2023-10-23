class Solution {
    public void generator(List<String> out, int n, String outi, int nOpens, int nCloses) {
        if (outi.length() == n*2) {
            out.add(outi);
            return;
        }

        if (nOpens < n)
            generator(out, n, outi+"(", nOpens+1, nCloses);
        if (nCloses < nOpens)
            generator(out, n, outi+")", nOpens, nCloses+1);
        return;
    }

    public List<String> generateParenthesis(int n) {
        List<String> out = new ArrayList<>();
        generator(out, n, new String(), 0, 0);
        return out;
    }
}

// https://leetcode.com/problems/generate-parentheses/description/?envType=study-plan-v2&envId=top-interview-150