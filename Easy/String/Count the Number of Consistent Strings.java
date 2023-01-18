import java.util.HashSet;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        int c = 0;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    c++;
                    break;
                }
            }
        }

        return words.length - c;

    }
}