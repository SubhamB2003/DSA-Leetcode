class Solution {
    public int findJudge(int n, int[][] trust) {

        if (n == 1)
            return 1;

        int row = trust.length;
        int a[] = new int[n + 1];
        int b[] = new int[n + 1];

        for (int i = 0; i < row; i++) {
            a[trust[i][1]] = a[trust[i][1]] + 1;
            b[trust[i][0]] = b[trust[i][0]] + 1;
        }

        for (int i = 0; i < n + 1; i++) {
            if (a[i] == n - 1 && b[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}