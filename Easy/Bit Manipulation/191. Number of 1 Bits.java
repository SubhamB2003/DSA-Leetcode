class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        boolean isNeg = false;
        if (n < 0) {
            isNeg = true;
            n = ~n;
        }

        int ans = 0;
        while (n != 0) {
            n = n & (n - 1);
            ans++;
        }

        return isNeg ? 32 - ans : ans;

    }
}