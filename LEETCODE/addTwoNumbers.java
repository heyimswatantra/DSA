package LEETCODE;

import java.util.LinkedList;

public class addTwoNumbers {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        LinkedList<Integer> newList = new LinkedList<>();
//        ListNode head1 = l1;
//        ListNode head2 = l2;
//        if(head1 == null || head2 == null) return new ListNode(0);
//        while(head1.next != null && head2.next != null) {
//            int rem = 0, m = 0;
//            int n = head1.val + head2.val + m;
//            if (n == 10) {
//                newList.add(0);
//                m = 1;
//            }
//            if(n > 10) {
//                rem = n%10;
//                newList.add(rem);
//                m = 1;
//            }
//            head1 = head1.next;
//            head2 = head2.next;
//
//    }
}
