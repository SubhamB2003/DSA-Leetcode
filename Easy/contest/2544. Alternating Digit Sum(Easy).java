class Solution {
    public int alternateDigitSum(int n) {

        int ans = 0;
        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                ans += s.charAt(i) - '0';
            } else {
                ans -= s.charAt(i) - '0';
            }
        }

        return ans;

    }
}