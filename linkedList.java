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
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
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
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        list.reverseIterative();
        list.printList();
    }


}
