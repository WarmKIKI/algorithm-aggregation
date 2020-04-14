package leetcode.linklist;

import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode r =  l1;
        ListNode t = l2;
        int vod = 0;
        ListNode start = new ListNode(0);
        while(r != null || t != null) {
           int value1 =  r != null ? r.val : 0;
           int value2 = t != null ? t.val : 0;
           int sum = value1 + value2 + vod;
           vod = sum / 10;
           ListNode tmp = new ListNode(sum % 10);
           tmp.next = start.next;
           start.next = tmp;
            if(r != null) r = r.next;
            if(t != null) t = t.next;
        }
        if(vod != 0) {
            start.val = vod;
            return start;
        } else return start.next;
    }

    public ListNode reverse(ListNode node) {
        ListNode tmp;
        ListNode cur = node.next;
        node.next = null;
        while( cur != null){
            tmp = cur.next;
            cur.next = node;
            node = cur;
            cur = tmp;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(7);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(3);
        one.next = two;
        two.next = three;
        three.next = four;

        ListNode one1 = new ListNode(5);
        ListNode two1 = new ListNode(6);
        ListNode three1 = new ListNode(4);
        one1.next = two1;
        two1.next = three1;
        AddTwoNumbers addTwo = new AddTwoNumbers();
        ListNode tmp = addTwo.addTwoNumbers(one, one1);


        while (tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
    }
}
