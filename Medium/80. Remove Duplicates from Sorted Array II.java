import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int removeDuplicates(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (map.getOrDefault(nums[i], 0) < 2) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (map.get(nums[i]) > 0 && map.get(nums[i]) <= 2) {
                list.add(nums[i]);
                map.put(nums[i], map.get(nums[i]) - 1);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}