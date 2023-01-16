public class Q14_ReverseLinkedlist { // Q - 206

    // Definition for singly-linked list.
    public class ListNode {
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

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode lst = head;

        while (lst != null) {
            ListNode temp = lst.next;
            lst.next = prev;
            prev = lst;
            lst = temp;
        }
        head = prev;

        return head;
    }

}
