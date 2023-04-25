import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            set.add(Math.abs(arr[i] - arr[i - 1]));
        }

        if (set.size() == 1) {
            return true;
        }
        return false;
    }
}