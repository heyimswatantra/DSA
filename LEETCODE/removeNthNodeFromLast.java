package LEETCODE;

import java.util.LinkedList;

public class removeNthNodeFromLast {
    public class ListNode { int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

     ListNode removeNfromLast(ListNode head, int n){
         if(head.next == null) return null;
         int size = 0;

         ListNode curr = head;
         // calc size of the LL
         while(curr != null){
             curr = curr.next;
             size++;
         }
         if( n == size) return head.next;
         // find the index to delete node from
         // if size of LL is 5 & nth node to delete from last is n=3, then index = 2
         int indxToSearch = size - n;
         ListNode prev = head;
         int i = 1;
         // traverse till n-1 node
         while(i< indxToSearch){
             prev = prev.next;
             i++;
         }
         // point n-1 node to next.next node, deleting the link between prev and next;
         prev.next = prev.next.next;
         return head;
     }

}

//* if(head.next == null){
//* return null;
//* }
//* int size = 0;
//* ListNode curr = head;
//*
//* while(curr != head){
//* curr = curr.next;
//* size++;}
//*
//* int indexToSearch = size - n;
//* ListNode prev = head;
//* int i = 1;
//* while(i<indexToSearch){
//* prev = prev.next;
//* i++;
// }
//
//prev.next = prev.next.next;
// return head;
