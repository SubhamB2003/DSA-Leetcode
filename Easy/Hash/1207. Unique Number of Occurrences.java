import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (set.contains(e.getValue())) {
                return false;
            } else {
                set.add(e.getValue());
            }
        }

        return true;

    }
}