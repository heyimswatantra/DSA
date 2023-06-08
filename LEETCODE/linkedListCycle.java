package LEETCODE;

public class linkedListCycle {
//    /**
//     * Definition for singly-linked list.
//     * class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode(int x) {
//     *         val = x;
//     *         next = null;
//     *     }
//     * }
//     */
    class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public int lengthOfCycle(ListNode head){
            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;

                if(fast == slow){
                    ListNode temp = slow;
                    int length = 0;
                    do{
                        temp = temp.next;
                        length++;
                    } while (temp != fast);
                    return length;
                }
            }
            return 0;
        }
        public ListNode detectCycle(ListNode head) {
            int len = 0;
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow){
                    len = lengthOfCycle(slow);
                    break;
                }
            }
            if(len == 0) return null;

            ListNode f = head;
            ListNode s = head;

            while (len>0){
                s = slow.next;
                len--;
            }
            while (f != s) {
                s = s.next;
                f = f.next;
            }
            return s;
        }
    }
}
