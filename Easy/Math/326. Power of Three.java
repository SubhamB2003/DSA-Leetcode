class Solution {
    public boolean isPowerOfThree(int n) {
        // Integer Limitations
        return n > 0 && 1162261467 % n == 0;
    }
}