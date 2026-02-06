public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
     public static Node head;
     public static Node tail;
     public static int size;

     public void addFirst(int data){
         //create node
         Node newNode = new Node(data);
         size++;
         if(head == null){
             head = tail = newNode;
             return;
         }
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
     }
     public void print(){
         if(head == null){
             System.out.println("Doubly ll is empty");
             return;
         }
         Node temp = head;
         while(temp!=null){
             System.out.print(temp.data+"<->");
             temp = temp.next;
         }
         System.out.println("null");
     }
     public int removeFirst(){
         if(size == 0){
             System.out.println("empty list");
             return Integer.MIN_VALUE;
         }
         if(size == 1){
             int val = head.data;
             head = tail = null;
             size--;
             return val;
         }
         int val = head.data;
         head = head.next;
         head.prev = null;
         size--;
         return val;

     }
     public void reverse(){
         Node curr = head;
         Node prev = null;
         Node next;
         while(curr!=null){
             next  = curr.next;
             curr.next = prev;
              curr.prev = next;
              prev = curr;
              curr = next;
         }
         head = prev;
     }


    public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.addFirst(7);
    dll.addFirst(8);
    dll.addFirst(9);
    dll.print();
    dll.reverse();
    dll.print();
    }
}
