class Solution {
    public int balancedStringSplit(String s) {

        int Ls = 0, Rs = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                Ls++;
            } else {
                Rs++;
            }

            if (Ls == Rs)
                ans++;
        }

        return ans;

    }
}