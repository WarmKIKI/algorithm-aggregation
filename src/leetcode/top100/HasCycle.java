package leetcode.top100;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode l = head;
        ListNode r = head;
        while(true) {
            if(l.next != null) {
                l = l.next;
            } else {
                break;
            }
            if(r.next != null && r.next.next !=  null) {
                r = r.next.next;
            } else {
                break;
            }
            if(l.val == r.val) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        HasCycle hasCycle = new HasCycle();
        ListNode one = new ListNode(2);
        ListNode head = new ListNode(1);
        head.next = one;
        hasCycle.hasCycle(head);
    }
}
