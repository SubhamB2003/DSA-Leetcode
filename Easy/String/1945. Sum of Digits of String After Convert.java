class Solution {
    public int getLucky(String s, int k) {

        int ans = 0;
        for (char c : s.toCharArray()) {
            int temp = c - 'a' + 1;
            ans += (temp % 10) + (temp / 10);
        }
        while (--k > 0) {
            ans = getSum(ans);
        }

        return ans;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}