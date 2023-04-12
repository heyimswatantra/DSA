package LEETCODE;

import java.util.LinkedList;

public class removeNthNodeFromLast {
     public class Node {
         Node head;
        Integer data;
        linkedList.Node next;
        Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }

}
//
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
//* }
//*
// prev.next = prev.next.next;
// return head;
