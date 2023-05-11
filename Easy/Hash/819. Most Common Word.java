import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String[] s = paragraph.toLowerCase().split("\\W+");
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(banned));

        for (String e : s) {
            if (!set.contains(e)) {
                map.put(e, map.getOrDefault(e, 0) + 1);
            }
        }

        int max = Integer.MIN_VALUE;
        String ans = "";

        for (String e : map.keySet()) {
            if (map.get(e) > max) {
                max = map.get(e);
                ans = e;
            }
        }

        return ans;
    }
}