class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;
        int mat[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[j][i] = matrix[n - i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = mat[i][j];
            }
        }

    }
}