import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Solution {

    public void getMap(int[][] items, Map<Integer, Integer> map) {
        for (int[] item : items) {
            int val = item[0];
            int weight = item[1];
            map.put(val, map.getOrDefault(val, 0) + weight);
        }
    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        getMap(items1, map);
        getMap(items2, map);

        // The max element map will automatically calculate
        for (Integer val : map.keySet()) {
            // System.out.println(val + " ");
            List<Integer> temp = new ArrayList<>();
            temp.add(val);
            temp.add(map.get(val));
            ans.add(temp);
        }

        return ans;
    }
}