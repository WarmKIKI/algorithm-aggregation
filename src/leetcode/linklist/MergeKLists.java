package leetcode.linklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        ListNode root = new ListNode(0);
        ListNode temp = root;
        for (ListNode elem: lists) {
            while(elem != null) {
                arrayList.add(elem);
                elem = elem.next;
            }
        }
        Collections.sort(arrayList, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode elem: arrayList) {
            temp.next = elem;
            temp = temp.next;
        }
        return root.next;
    }
}
