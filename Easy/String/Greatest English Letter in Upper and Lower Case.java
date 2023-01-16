import java.util.*;

class Solution {
    public String greatestLetter(String s) {

        ArrayList<Character> list = new ArrayList<>();
        PriorityQueue<Character> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (list.contains(java.lang.Character.toUpperCase(s.charAt(i)))
                    && list.contains(java.lang.Character.toLowerCase(s.charAt(i)))) {
                pq.offer(java.lang.Character.toUpperCase(s.charAt(i)));
            }
        }

        String ans = "";
        if (pq.size() != 0) {
            ans = pq.peek().toString();
        }

        return ans;

    }
}