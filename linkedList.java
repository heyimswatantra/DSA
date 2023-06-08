public class linkedList {
    Node head;
    public class Node {

        Integer data;
        Node next;
        Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }

     public void addFirst(Integer data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }

     public void addLast(Integer data){
         Node newNode = new Node(data);
         if(head == null){
             head = newNode;
             return;
         }

         Node tempNode = head;
         while(tempNode.next != null){
             tempNode = tempNode.next;
         }
         tempNode.next = newNode;
     }
     public void printList(){
        if(head == null){
            System.out.println("list is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
         System.out.println("null");
     }
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null) return head;

        Node newH = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newH;
    }
    public void reverseIterative(){
        if(head == null || head.next == null) return ;
        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){
            // 1 -> 2 -> 6 -> 3 -> 4 -> 6 -> null
            //prev curr next
            Node nextNode = currNode.next;
            // point curr to prev
            currNode.next = prevNode;

            // iterate the node  by one step
            prevNode = currNode;
            currNode = nextNode;
        }
        // after reversal head should be pointing to null
        // 6 -> 4 -> 3 -> 6 -> 2 -> 1 -> null
        head.next = null;
        // prev will become the new head after reversal
        head = prevNode;
    }

    public Node removeElement( Node head, int val){
        if(head == null) return null;
        head.next = removeElement(head.next, val);
        return (head.data == val) ? head.next : head;
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
//        list.addFirst("a");
//        list.addFirst("is");
//        list.printList();
//
//        list.addLast("list");
//        list.printList();
//
//        list.addFirst("this");
//        list.printList();
//        LinkedList<Integer> list = new LinkedList<>();
//        for(int i = 0; i < 5; i++) {
//            list.add(i+1);
//        }
//        System.out.println(list);
        list.addLast(1);
        list.addLast(2);
        list.addLast(6);
        list.addLast(3);
        list.addLast(4);
        list.addLast(6);
        list.printList();
//        list.removeElement(list.head, 6);
        list.reverseIterative();
        list.printList();
    }


}
