class Solution {
    public int longestPalindrome(String s) {

        int ans = 0;
        int arr[] = new int[128];

        for (char c : s.toCharArray()) {
            arr[c]++;
        }

        for (int e : arr) {
            ans += e / 2 * 2;
            if (ans % 2 == 0 && e % 2 != 0) {
                ans++;
            }
        }

        return ans;
    }
}