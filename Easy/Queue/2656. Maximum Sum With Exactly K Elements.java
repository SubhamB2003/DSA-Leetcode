import java.util.PriorityQueue;

class Solution {
    public int maximizeSum(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        while (k-- > 0) {
            int temp = pq.poll();
            ans += temp;
            pq.add(temp + 1);
        }

        return ans;
    }
}