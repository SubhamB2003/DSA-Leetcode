class Solution {
    public int reverse(int x) {

        int neg = 0;
        if (x < 0) {
            neg = 1;
        }

        // find absolute value of given number
        x = Math.abs(x);

        // reverse the number
        long ans = 0;
        int remainder = 0;
        while (x > 0) {
            remainder = x % 10;
            ans = (ans * 10) + remainder;
            x /= 10;
        }

        // assign -ve sign to ans if original number was negative
        if (neg == 1) {
            ans *= (-1);
        }

        // check if the ans is not a signed 32-bit integer
        if (!(ans > Integer.MIN_VALUE && ans < Integer.MAX_VALUE)) {
            return 0;
        }

        return (int) ans;

    }
}