package leetcode.other;

class ListNode {
    ListNode next;
    int val;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
}

public class SumOfTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode c = head;
        int mod = 0;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int value = x + y + mod;
            mod = value / 10;
            ListNode temp = new ListNode(value % 10);
            c.next = temp;
            c = c.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(mod > 0) {
            ListNode temp = new ListNode(mod);
            c.next = temp;
        }
        return head.next;
    }
}
