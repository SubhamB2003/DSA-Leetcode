class Solution {
    public int findNumbers(int[] nums) {

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (EvenOddCheck(nums[i]) % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }

    public int EvenOddCheck(int n) {

        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }

        return c;
    }
}