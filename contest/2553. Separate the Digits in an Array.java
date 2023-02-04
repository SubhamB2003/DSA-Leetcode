import java.util.ArrayList;

class Solution {
    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> rev = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            while (temp > 0) {
                rev.add(temp % 10);
                temp /= 10;
            }

            for (int j = rev.size() - 1; j >= 0; j--) {
                list.add(rev.get(j));
                rev.remove(j);
            }
        }

        int ans[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}