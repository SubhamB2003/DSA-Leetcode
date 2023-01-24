class Solution {
    public int[] shuffle(int[] nums, int n) {

        // int ans[] = new int[n*2];
        // int j = 0;
        // for(int i = 0; i < n; i++) {
        // ans[j] = nums[i];
        // j++;
        // ans[j] = nums[n + i];
        // j++;
        // }

        // return ans;

        int[] ans = new int[2 * n];
        ans[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i - 1] = nums[n + i - 1];
        }
        ans[2 * n - 1] = nums[2 * n - 1];
        return ans;

    }
}