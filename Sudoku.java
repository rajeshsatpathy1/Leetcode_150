class Solution {
    public boolean isValidSudoku(char[][] board) {
        var m = board[0].length;
        var n = board.length;
        
        var validRow = new HashSet<String>();
        var validCol = new HashSet<String>();
        var validBox = new HashSet<String>();

        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                var entry = board[i][j];
                if (entry != '.')
                    if (!validRow.add(entry + "-" + i) || !validCol.add(entry + "-" + j) || !validBox.add(entry + "-" + (i/3) + "-" +(j/3))){ 
                            return false;
                    }
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/valid-sudoku/editorial/?envType=study-plan-v2&envId=top-interview-150