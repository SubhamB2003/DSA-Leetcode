class Solution {
    public int countDigits(int num) {

        int ans = 0, dup = num;
        while(dup > 0) {
            int temp = dup % 10;
            if(num % temp == 0) {
                ans++;
            }

            dup /= 10;
        }
        
        return ans;
    }
}