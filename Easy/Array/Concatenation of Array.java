class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length * 2, j = 0;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums.length - 1 == i - 1) {
                j = 0;
            }
            ans[i] = nums[j++];
        }

        return ans;
    }
}