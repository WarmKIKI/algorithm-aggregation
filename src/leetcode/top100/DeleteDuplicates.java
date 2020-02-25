package leetcode.top100;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while(list != null) {
            if(list.next != null) {
                ListNode temp = list.next;
                if(list.val == temp.val) {
                    list.next = temp.next;
                } else {
                    list = list.next;
                }
            } else {
                break;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode two = new ListNode(2);
        ListNode one = new ListNode(1);
        ListNode head = new ListNode(1);
        head.next = one;
        one.next = two;
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        deleteDuplicates.deleteDuplicates(head);
    }
}
