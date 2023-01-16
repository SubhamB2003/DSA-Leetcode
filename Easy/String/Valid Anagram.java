import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

        ArrayList<Character> set1 = new ArrayList<>();
        ArrayList<Character> set2 = new ArrayList<>();

        boolean ans = false;

        for (int i = 0; i < s.length(); i++) {
            set1.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            set2.add(t.charAt(i));
        }

        Collections.sort(set1);
        Collections.sort(set2);

        if (set1.equals(set2)) {
            ans = true;
        }

        return ans;
    }
}