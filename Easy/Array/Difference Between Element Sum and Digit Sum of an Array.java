class Solution {
    public int differenceOfSum(int[] nums) {

        int digitSum = 0, eleSum = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            eleSum = eleSum + nums[i];
            while (nums[i] != 0) {
                digitSum = digitSum + nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
        }

        int ans = eleSum - digitSum;
        return ans;
    }
}