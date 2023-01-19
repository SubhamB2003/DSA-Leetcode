class Solution {
    public int[] diStringMatch(String s) {

        int start = 0, end = s.length();
        int ans[] = new int[s.length() + 1];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = start++;
            } else {
                ans[i] = end--;
            }
        }
        ans[s.length()] = start;

        return ans;
    }
}