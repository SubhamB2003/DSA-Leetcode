import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }

        if (map1.size() == map2.size()) {
            return true;
        }

        return false;
    }
}