class Solution {
    public int arraySign(int[] nums) {

        int ans = 1;
        for (int e : nums) {
            if (e == 0) {
                return 0;
            }
            if (e < 0) {
                ans = -ans;
            }
        }

        return ans;

        // int pos = 0, neg = 0, zero = 0;
        // for(int e : nums) {
        // if(e == 0) {
        // zero++;
        // } else if(e > 0) {
        // pos++;
        // } else {
        // neg++;
        // }
        // }

        // if(neg % 2 == 0 && zero < 1) {
        // return 1;
        // } else if(neg % 2 != 0 && zero < 1) {
        // return -1;
        // }

        // return 0;
    }
}