class Solution {
    public int countAsterisks(String s) {

        boolean c = false;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                c = !c;
            }
            if (!c && s.charAt(i) == '*') {
                ans++;
            }
        }

        return ans;
    }
}