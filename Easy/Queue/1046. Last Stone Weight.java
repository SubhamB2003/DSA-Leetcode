package Easy.Queue;

import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int e : stones) {
            pq.add(e);
        }

        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();

            if (x != y) {
                pq.add(Math.abs(x - y));
            }
        }

        if (pq.size() == 1) {
            return pq.poll();
        }

        return 0;

    }
}