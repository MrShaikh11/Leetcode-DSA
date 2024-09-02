class Solution {
    public void setZeroes(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;

        boolean firstRowFill = false;
        boolean firstColFill = false;

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowFill = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColFill = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }

        }
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

        if (firstRowFill) {
            for (int j = 0; j < n; j++)
                matrix[0][j] = 0;
        }
        if (firstColFill) {
            for (int i = 0; i < m; i++)
                matrix[i][0] = 0;
        }

    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;

        boolean firstRowFill = false;
        boolean firstColFill = false;

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowFill = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColFill = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }

        }
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

        if (firstRowFill) {
            for (int j = 0; j < n; j++)
                matrix[0][j] = 0;
        }
        if (firstColFill) {
            for (int i = 0; i < m; i++)
                matrix[i][0] = 0;
        }

    }
}
