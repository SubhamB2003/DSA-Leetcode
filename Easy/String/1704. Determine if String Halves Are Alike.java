class Solution {
    public boolean halvesAreAlike(String s) {

        int n = s.length(), ans = 0;
        for (int i = 0; i < n / 2; i++) {
            if (isVowelCheck(s.charAt(i)))
                ans++;
            if (isVowelCheck(s.charAt((n / 2) + i)))
                ans--;
        }

        return ans == 0;
    }

    private boolean isVowelCheck(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||
                c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}