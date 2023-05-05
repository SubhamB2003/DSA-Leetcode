class Solution {

    public boolean isVowels(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }

    public int maxVowels(String s, int k) {

        int ans = 0, count = 0, i = 0, n = s.length();
        while (i < k) {
            if (isVowels(s.charAt(i))) {
                count++;
            }
            i++;
        }
        ans = count;

        while (i < n) {
            if (isVowels(s.charAt(i))) {
                count++;
            }
            if (isVowels(s.charAt(i - k))) {
                count--;
            }
            i++;
            ans = Math.max(ans, count);
        }

        return ans;

        // int ans = 0;
        // for(int i = 0; i < s.length() - k + 1; i++) {
        // int temp = countVowels(s.substring(i, i + k));
        // ans = Math.max(ans, temp);
        // }

        // return ans;
        // }

        // public int countVowels(String s) {

        // int ans = 0;
        // for(int i = 0; i < s.length(); i++) {
        // if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
        // s.charAt(i) == 'o' || s.charAt(i) == 'u') {
        // ans++;
        // }
        // }

        // return ans;
    }
}