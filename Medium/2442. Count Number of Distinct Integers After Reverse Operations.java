import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countDistinctIntegers(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int e : nums) {
            set.add(e);
            set.add(reverse(e));
        }

        return set.size();
    }

    public int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}