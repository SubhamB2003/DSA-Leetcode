import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {

        int ans[] = new int[4];
        int i = 0;
        while (num > 0) {
            ans[i++] = num % 10;
            num /= 10;
        }
        Arrays.sort(ans);
        return 10 * (ans[0] + ans[1]) + ans[2] + ans[3];
    }
}