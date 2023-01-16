class Solution {
    public int[] twoSum(int[] nums, int target) {

        // 2nd Apporach

        int n = nums.length;
        int start = 0, end = n - 1;

        for (int i = 0; i < n; i++) {
            int val = nums[start] + nums[end];

            if (val < target) {
                start++;
            } else if (val > target) {
                end--;
            } else {
                break;
            }
        }

        int ans[] = { start + 1, end + 1 };

        return ans;

        // 1st Apporach

        // int n = nums.length;

        // int ans[] = new int[2];

        // for(int i = 0; i < n; i++) {
        // int start = i + 1, end = n - 1, k = target - nums[i];

        // while(start <= end) {
        // int mid = (start + end) / 2;

        // if(nums[mid] == k) {
        // ans[0] = i + 1;
        // ans[1] = mid + 1;

        // return ans;
        // }

        // if(nums[mid] > k) {
        // end = mid - 1;
        // }
        // else {
        // start = mid + 1;
        // }
        // }
        // }

        // return ans;
    }
}