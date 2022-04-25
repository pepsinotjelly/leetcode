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

public class _086_partition {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode small_head = new ListNode(-1);
        ListNode large_head = new ListNode(-1);
        ListNode small_tail = small_head;
        ListNode large_tail = large_head;
        while (cur != null) {
            if (cur.val < x) {
                small_tail.next = cur;
                small_tail = small_tail.next;
            } else {
                large_tail.next = cur;
                large_tail = large_tail.next;
            }
            cur = cur.next;
        }
        large_tail.next = null;
        small_tail.next = large_head.next;
        return small_head.next;
    }
}