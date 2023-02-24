import java.util.ArrayList;

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public int pairSum(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int ans = 0, n = list.size();
        for (int i = 0; i < n / 2; i++) {
            ans = Math.max(ans, (list.get(i) + list.get(n - i - 1)));
        }
        return ans;
    }
}