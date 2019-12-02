package leetcode.linklist;

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

     public ListNode(ListNode next) {
         this.next = next;
     }

     public ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode temp = head.next;
        head.next = null;
        ListNode next = null;
        while(temp != null) {
            next = temp.next;
            temp.next = head;
            head = temp;
            temp = next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);
       //ListNode head = new ListNode(node1);
        ReverseList reverseList = new ReverseList();
        ListNode root = reverseList.reverseList(head);
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.next;
        }
    }
}
