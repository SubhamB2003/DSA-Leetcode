
//   Definition for singly-linked list.
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
    public ListNode removeElements(ListNode head, int val) {

        ListNode x = head;
        ListNode y = x;
        while (x != null && x.val == val) {
            head = x.next;
            x = head;
        }

        while (x != null) {
            if (x.val == val) {
                y.next = x.next;
                x = y.next;
            } else {
                y = x;
                x = x.next;
            }

        }

        return head;
    }
}