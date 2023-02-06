class Solution {
    public boolean isUgly(int n) {

        if(n <= 0) return false;

        for(int fact : new int[] {2, 3, 5}) {
            n = isDivided(n, fact);
        }

        return n == 1;
    }

    int isDivided(int dividend, int divisor) {
        while(dividend % divisor == 0) {
            dividend /= divisor;
        }

        return dividend;
    }
}
