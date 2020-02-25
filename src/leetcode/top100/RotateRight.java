package leetcode.top100;

public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
        }
        return null;
    }
}
