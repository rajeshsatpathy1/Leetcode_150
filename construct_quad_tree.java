class Solution {
    private boolean allSameVal(int[][] grid, int si, int sj, int r) {
        for (int i = si;i < si + r;i++)
            for (int j = sj;j < sj + r;j++)
                if (grid[si][sj] != grid[i][j]) return false;
        return true;
    }

    private Node dfs(int [][] grid, int i, int j, int r) {
        if (allSameVal(grid, i, j, r))
            if (grid[i][j] == 1) return new Node(true, true);
            else return new Node(false, true);

        Node node = new Node(true, false);
        node.topLeft = dfs(grid, i, j, r/2);
        node.topRight = dfs(grid, i, j + r/2, r/2);
        node.bottomLeft = dfs(grid, i + r/2, j, r/2);
        node.bottomRight = dfs(grid, i + r/2, j + r/2, r/2);

        return node;
    }

    public Node construct(int[][] grid) {
        return dfs(grid, 0, 0, grid.length);
    }
}

// https://leetcode.com/problems/construct-quad-tree/submissions/?envType=study-plan-v2&envId=top-interview-150