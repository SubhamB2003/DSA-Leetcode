import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length(), ans = 0;
        for (int i = 0, j = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
            }

            ans = Math.max(ans, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }

        return ans;
    }
}