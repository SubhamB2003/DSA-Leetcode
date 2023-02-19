import java.util.HashSet;

class Solution {
    public int findFinalValue(int[] nums, int original) {

        int find = original;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        boolean isLoop = true;
        while (isLoop) {
            if (!set.contains(find))
                break;
            else
                find *= 2;
        }

        return find;
    }
}