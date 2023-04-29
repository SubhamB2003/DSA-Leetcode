import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {

        int ans = Integer.MAX_VALUE;
        if (k == 1)
            return 0;

        Arrays.sort(nums);
        k--;
        int n = nums.length - k;
        for (int i = 0; i < n; i++) {
            int temp = nums[k++] - nums[i];
            if (ans > temp)
                ans = temp;
        }

        return ans;
    }
}