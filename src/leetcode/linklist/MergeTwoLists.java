package leetcode.linklist;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        ListNode a = l1;
        ListNode b = l2;
        ListNode temp = new ListNode(0);
        ListNode root = temp;
        while(a != null || b!= null) {
            int x = b == null ? Integer.MAX_VALUE : b.val;
            int y = a == null ? Integer.MAX_VALUE : a.val;
            if(y > x) {
                temp.next = b;
                b = b.next;
                temp = temp.next;
            } else {
                temp.next = a;
                a = a.next;
                temp = temp.next;
            }
        }
        return root.next;
    }
}
