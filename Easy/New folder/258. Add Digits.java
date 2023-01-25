class Solution {
    public int addDigits(int num) {

        int ans = 0;

        while (num != 0 || ans > 9) {
            if (num == 0 && ans > 9) {
                num = ans;
                ans = 0;
            }
            int temp = num % 10;
            ans += temp;
            num /= 10;
        }

        return ans;
    }
}