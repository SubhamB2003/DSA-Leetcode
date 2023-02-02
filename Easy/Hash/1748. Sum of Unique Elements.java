import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                ans += e.getKey();
            }
        }

        return ans;
    }
}