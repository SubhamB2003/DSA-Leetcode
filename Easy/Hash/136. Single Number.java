import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {

        // 1st Apporach
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // int ans = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (map.get(nums[i]) == 1) {
        //         ans = nums[i];
        //         break;
        //     }
        // }

        // return ans;

        // 2nd Apporach
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }

        return ans;
    }
}