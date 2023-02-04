import java.util.HashSet;

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }

        int sum = 0, c = 0;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                sum += i;
                if (sum <= maxSum) {
                    c++;
                }
            }
        }

        return c;

    }
}