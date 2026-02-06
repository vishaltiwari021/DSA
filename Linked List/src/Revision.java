public class Revision {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static ListNode head;
        public static ListNode tail;
        public static int size;

        public void addFirst(int data){
            //create new Node
            ListNode newNode  = new ListNode(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            //2
            newNode.next = head;
            //3
            head = newNode;

        }
        public void addLast(int data){
            ListNode newNode  = new ListNode(data);
            size++;
            //1
            if(head == null){
                head = tail = newNode;
                return;
            }
             //2
            tail.next = newNode;
            //3
            tail = newNode;

        }
        public void addMiddle(int idx,int data){
            //
            if(idx== 0){
               addFirst(data);
                return;
            }
            //
            ListNode newNode = new ListNode(data);
            size++;
            //
            ListNode temp = head;
            int i = 0;
            while(i<idx-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public int removeFirst(){
                if(size == 0){
                    System.out.println("list is empty");
                    return Integer.MIN_VALUE;
                }else if(size == 1){
                    int val = head.data;
                    head = tail = null;
                    size = 0;
                    return val;
                }
                int val = head.data;
                head = head.next;
                size--;
                return val;
        }
    public int removeLast(){
        if(size == 0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        ListNode prev  = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
        public void print(){
            if(head == null){
                System.out.println("list is empty");
                return;
            }
            ListNode temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");

        }
    public static void main(String[] args) {
        Revision list  = new Revision();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.print();
        list.addMiddle(2,5);
        list.print();
        list.removeFirst();
        System.out.println(list.size);
        list.print();
        list.removeLast();
        list.print();
    }
}



