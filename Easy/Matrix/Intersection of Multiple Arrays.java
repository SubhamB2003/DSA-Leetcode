import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
            }
        }

        int max = Collections.max(map.values());

        if (max == nums.length) {
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (max == e.getValue()) {
                    list.add(e.getKey());
                }
            }
            Collections.sort(list);
        }
        map.clear();

        return list;
    }
}