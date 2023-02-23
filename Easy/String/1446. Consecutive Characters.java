class Solution {
    public int maxPower(String s) {
        
        int ans = 1, c = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == s.charAt(i)) {
                c++;
            } else {
                c = 1;
            }
            ans = Math.max(ans, c);
        }

        return ans;
    }
}