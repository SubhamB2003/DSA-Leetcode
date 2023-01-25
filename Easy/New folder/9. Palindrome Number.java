class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0 || x % 10 == 0 && x != 0)
            return false;
        int ans = 0;
        while (x > ans) {
            ans = ans * 10 + x % 10;
            x /= 10;

        }

        if (x == ans)
            return true;
        if (ans / 10 == x)
            return true;

        return false;
    }
}