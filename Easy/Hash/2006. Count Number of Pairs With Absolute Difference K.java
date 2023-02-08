import java.util.HashMap;

class Solution {
    public int countKDifference(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int e : nums) {
            if (map.containsKey(e - k)) {
                ans += map.get(e - k);
            }
            if (map.containsKey(e + k)) {
                ans += map.get(e + k);
            }
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        return ans;
    }
}