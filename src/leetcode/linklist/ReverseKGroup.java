package leetcode.linklist;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return null;
        int t = k;
        int length = getLength(head);
        int count = length / k;
        int mod = length % k;
        ListNode temp = head;
        ListNode next = head.next;
        ListNode start = new ListNode(0);
        ListNode root = start;
        while (count !=0) {
            if(t!=0) {
                temp.next = start.next;
                start.next = temp;
                temp = next;
                if (temp != null) next = next.next;
                t--;
            } else {
                t = k;
                count--;
                start = head;
                head = temp;
            }
        }
        if(mod != 0) {
            while (temp != null){
                start.next = temp;
                temp = temp.next;
                start = start.next;
            }
        }
        return root.next;
    }

    public int getLength(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
}
