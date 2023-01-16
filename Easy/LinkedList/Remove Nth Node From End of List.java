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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr = head;
        int c = 0;

        while (curr != null) {
            c++;
            curr = curr.next;
        }

        if (n == c)
            return head.next;

        curr = head;
        for (int i = 0; i < Math.abs(c - n - 1); i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;
    }
}