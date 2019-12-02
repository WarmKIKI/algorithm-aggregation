package leetcode.linklist;

import javax.swing.plaf.IconUIResource;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;
        ListNode current = head.next;
        head.next = null;
        ListNode next = current.next;
        if(current.val > head.val) {
            head.next = current;
            current.next = null;
            current = next;
            next = next.next;
        }
        while (current != null || next != null) {
            ListNode temp = findTargetPosition(current, head);
            head = temp == null ? head : temp;
            current = next;
            if(current != null) {
                next = next.next;
            }
        }
        return head;
    }

    public ListNode findTargetPosition(ListNode current, ListNode head) {
        ListNode node = head;
        ListNode front = head;
        while (node != null) {
            if (node == head && node.val >= current.val) {
                current.next = node;
                node = current;
                break;
            } else if (node != head && node.val >= current.val) {
                current.next = front.next;
                front.next = current;
                node = head;
                break;
            } else {
                front = node;
                node = node.next;
                if(node == null) {
                    front.next = current;
                    current.next = null;
                }
            }
        }
        return node;
    }

    public static void main(String[] args) {
       /* ListNode node4 = new ListNode(0);
        ListNode node3 = new ListNode(4, node4);*/
        ListNode node2 = new ListNode(4);
        ListNode node1 = new ListNode(2, node2);
        ListNode root = new ListNode(3, node1);

      /*  ListNode node4 = new ListNode(0);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);
        ListNode root = new ListNode(4, node1);*/

        InsertionSortList insertionSortList = new InsertionSortList();
        ListNode head = insertionSortList.insertionSortList(root);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
