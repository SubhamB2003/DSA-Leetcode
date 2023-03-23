class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        int ans = 0;
        for (int i = left; i <= right; i++) {
            if (checkString(words[i])) {
                ans++;
            }
        }

        return ans;
    }

    public static boolean checkString(String s) {
        return checkVowel(s.charAt(0)) && checkVowel(s.charAt(s.length() - 1));
    }

    public static boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}