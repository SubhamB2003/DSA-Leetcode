import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0, curSum = 0;

        for (int e : nums) {
            sum += e;
        }

        for (int i = 0; i < n; i++) {
            nums[i] = nums[n - 1 - i];
        }

        for (int i = 0; i < n; i++) {
            curSum += nums[i];
            list.add(nums[i]);
            if (curSum > sum - curSum) {
                return list;
            }
        }

        return list;
    }
}