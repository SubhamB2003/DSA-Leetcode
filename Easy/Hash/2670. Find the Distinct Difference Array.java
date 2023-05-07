import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {

        int ans[] = new int[nums.length];
        Map<Integer, Integer> prefix = new HashMap<>();
        Map<Integer, Integer> suffix = new HashMap<>();
        int i = 0;

        for (int e : nums) {
            suffix.put(e, suffix.getOrDefault(e, 0) + 1);
        }

        for (int e : nums) {
            if (suffix.containsKey(e)) {
                suffix.put(e, suffix.getOrDefault(e, 0) - 1);
                if (suffix.get(e) == 0) {
                    suffix.remove(e);
                }
            }
            prefix.put(e, prefix.getOrDefault(e, 0) + 1);
            ans[i++] = (prefix.size() - suffix.size());
        }

        return ans;
    }
}