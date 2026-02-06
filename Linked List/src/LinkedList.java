
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        //Methods:

        public void addFirst(int data){
            //1) create a new node:
            Node newNode  = new Node (data);
                size++;
            if(head == null){
                head  = tail = newNode;
                return;
            }
            //2) newNode next = head
            newNode.next = head;
            //3) head =>newNode
            head  = newNode;
        }
        public void addLast(int data){
            //1) create a new node:
            Node newNode  = new Node (data);
            size++;
            if(head == null){
                head  = tail = newNode;
                return;
            }
            tail.next = newNode;
            //3) tail =>newNode
            tail = newNode;
        }
        public void print(){
            if(head == null){
                System.out.println("ll is empty");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public void addMiddle(int idx, int data){
            if(idx == 0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while(i<idx-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public int removeFirst(){
            if(size==0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }else if(size == 1){
                int val = head.data;
                head = tail = null;
                size =0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        public int removeLast(){
            if(size==0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }else if(size == 1){
                int val = head.data;
                head = tail = null;
                size =0;
                return val;
            }
            //prev : i =size-2
            Node prev = head;
            for (int i = 0; i <size-2 ; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
        public int Search(int key){//iteratively
            Node temp = head;
            int i = 0;

            while(temp!=null){
                if(temp.data == key){
                    return i;
                }
                temp = temp.next;
                i++;

            }
            return -1;
        }
        //Search Recursively:
        public int helper(Node head,int key){
            if(head == null){
                return -1;
            }
            if(head.data == key){
                return 0;
            }
            int idx = helper(head.next,key);
            if(idx == -1){
                return -1;
            }
            return  idx+1;
        }
        public  int recSearch(int key){
            return helper(head,key);
        }
        public void reverse(){
            Node prev = null;
            Node curr = tail=head;
            Node next;

            while(curr!=null){
                next  = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        public  void deleteNthFromEnd(int n){
            //calculate size
            int siz = 0;
            Node temp = head;
            while(temp!=null){
                temp =temp.next;
                siz++;
            }
            if(n == siz){
                head = head.next;//removeFirst
                return;
            }
            //size-n
            int i =1;
            int iToFind = siz-n;
            Node prev = head;
            while(i<iToFind){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }
        //Slow-fast Approach:
        public Node findMiddle(Node head){//kind of helper function
            Node slow  = head;//+1
            Node fast  = head;//+2

            while(fast!=null && fast.next!=null){
                slow  = slow.next;
                fast  =fast.next.next;
            }
            return slow; //slow is my middle
        }
        public boolean checkPalindrome(){
            //base case
            if(head == null || head.next == null){
                return  true;
            }
            //step1-find middle node:
            Node midNode  = findMiddle(head);
            //step2 - reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;

            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev  = curr;
                curr = next;
            }
            Node right = prev;// right half head
            Node left  = head;

            //step3 - check left half & right half
            while(right!=null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
    public static boolean hasCycle() {
        Node slow  = head;
        Node fast  = head;

        while(fast!=null && fast.next!=null){
            slow  = slow.next;
            fast  = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
            //detect cycle:
        Node slow  = head;
        Node fast  = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow  = slow.next;
            fast  = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;
        while(slow!=fast){
            prev= fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle ->last.next = null
        prev.next = null;

    }
    //MergeSort on LL:

    private Node getMid(Node head){
            Node slow  = head;
            Node fast = head.next;
            while(fast!= null && fast.next!= null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow; //middleNode.
    }
    //mergeFunction:
    private Node merge(Node head1,Node head2){
            Node mergedLL = new Node(-1);
            Node temp = mergedLL;

            while(head1!=null && head2!= null){
                if(head1.data <= head2.data){
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                }
                else{
                    temp.next = head2;
                    head2 = head2.next;



                    temp = temp.next;
                }
            }
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergedLL.next;
    }

    public Node mergeSort(Node head){
            if(head == null || head.next == null){
                return head;
            }
            //find middle
            Node mid  = getMid(head);
        //left half and right half
        Node rightHead = mid.next;
        mid.next = null;
        Node leftHalf = mergeSort(head);
        Node rightHalf = mergeSort(rightHead);

        //merge
        return merge(leftHalf,rightHalf);
    }

    //Zig-Zag
    public void zigZag(Node head){
            //find mid
            Node slow = head;
            Node fast = head.next;

            while(fast!=null && fast.next!=null){
                slow  = slow.next;
                fast = fast.next.next;
            }

            Node mid  = slow;
            // 2nd half reverse:
        Node curr  = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left  = head;
        Node right  = prev;
        Node nextL, nextR;

        //alternate Merging:

        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            //update:
            left  = nextL;
            right = nextR;
        }
    }






    public static void main(String[] args) {
        LinkedList li =  new LinkedList();

//        li.addFirst(1);
//        li.addFirst(2);
//        li.addFirst(3);
//        li.addFirst(4);
//        li.addFirst(5);
//        li.print();
//        li.addMiddle(4,6);
//        li.print();
//        li.addLast(3);
//      li.addMiddle(2,9);
//        li.addLast(5);
//        li.addLast(8);
//        li.print();
//        System.out.println(li.size);
//        li.removeFirst();
//        li.print();
//        li.removeLast();
//        li.print();
//        System.out.println(li.size);
//        System.out.println(li.recSearch(3));
//        System.out.println(li.recSearch(6));
//        li.reverse();
//        li.print();
//        li.deleteNthFromEnd(3);
//        li.print();
//        li.addFirst(1);
//        li.addFirst(2);
//        li.addFirst(1);
//        li.addFirst(1);
//        li.print();
//
//        System.out.println(li.checkPalindrome());

//        head  = new Node(1);
//        head.next  = new Node(2);
//        head.next.next  = new Node(3);
//        head.next.next.next  = head;
//        System.out.println(hasCycle());
    }
}