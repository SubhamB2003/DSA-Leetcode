import java.util.HashMap;

class Solution {
    public String restoreString(String s, int[] indices) {

        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }

        for (int i = 0; i < indices.length; i++) {
            if (map.containsKey(i)) {
                sb.append(map.get(i));
            }
        }

        return sb.toString();

    }
}