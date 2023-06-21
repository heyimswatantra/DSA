package LEETCODE;

public class swapNodesInALinkedList {
    static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int x) {
            val = x;
            next = next;
        }
    }

    public static ListNode swapNodes (ListNode head, int k){

        ListNode itr=head;
        int count=1;

        // place iterator at the Kth index
        while(count++<k){
            itr=itr.next;
        }
        ListNode first=itr;
        ListNode second=head;

        // after iterator has been reached at kth index traverse to the end of the list
        // at this point "second" will surely be at list.size - Kth index
        while(itr.next!=null){
            itr=itr.next;
            second=second.next;
        }

        // swap the values and return the LL's head
        int temp=first.val;
        first.val=second.val;
        second.val=temp;

        return head;
    }
}
