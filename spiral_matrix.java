class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startI = 0, startJ = 0;
        int endI = matrix.length-1, endJ = matrix[0].length-1;

        List<Integer> out = new ArrayList<>();

        while (startI <= endI && startJ <= endJ) {
            // Go right
            for (int j = startJ; j <= endJ; j++)
                out.add(matrix[startI][j]);
            startI++;
            // System.out.println("right: " + out);

            // Go down
            for (int i = startI; i <= endI;i++)
                out.add(matrix[i][endJ]);
            endJ--;
            // System.out.println("down: " + out);

            // Get out of loop if startI has crossed endI.
            // This is because we don't go down when we reach center
            // And try to go left after that - kind of retracing 
            if (startI > endI)
                break;

            // Go left
            for (int j = endJ;j >= startJ;j--)
                out.add(matrix[endI][j]);
            endI--;
            // System.out.println("left: " + out);

            // Get out of loop if startJ has crossed endJ
            // Similar reason as above but with going up
            if (startJ > endJ)
                break;

            // Go up
            for (int i = endI;i >= startI;i--)
                out.add(matrix[i][startJ]);
            startJ++;
            // System.out.println("up: " + out);
        }

        return out;

    }
}

// https://leetcode.com/problems/spiral-matrix/description/?envType=study-plan-v2&envId=top-interview-150