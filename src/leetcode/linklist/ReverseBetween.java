package leetcode.linklist;

public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode start = head;
        ListNode front = null;
        int count = 1;
        while(count != m) {
            if (start != null) {
                front = start;
                start = start.next;
            }
            count++;
        }
        ListNode temp = start.next;
        ListNode need = start;
        start.next = null;
        ListNode next;
        while(temp != null && count != n) {
            next = temp.next;
            temp.next = start;
            if(front != null) {
                front.next = temp;
            }
            start = temp;
            temp = next;
            count++;
        }
        if(temp != null) {
            need.next = temp;
        }
        if(m == 1) head = start;
        return head;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);
        //ListNode head = new ListNode(node1);
        ReverseBetween reverseList = new ReverseBetween();
        ListNode root = reverseList.reverseBetween(head, 2, 4);
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.next;
        }
    }
}
