public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //1. Create New Node
        Node newNode = new Node(data);
        size++;
        //If linkedlist is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //2. newNode next = head
        newNode.next = head;

        //3. head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
  
    public static void print(){     //O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data){    //Time complexity: O(n)
        if (head == null) {
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
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
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        //Prev : size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;   //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int removeNth(int idx){
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        Node prev = head;
        for(int i=0; i<idx-1; i++){
            prev = prev.next;
        }

        int val = prev.next.data;   //Removed node's data
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public int iterativeSearch(int key){    //Linear search: O(n)
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {     //Key is found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int recursiveSearch(Node head, int key){     //TC: O(n)
        //Base case
        if (head == null) {
            return -1;
        }

        //Recursion
        if (head.data == key) {
            return 0;
        }
        int idx = recursiveSearch(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public void iterativeReverse(){     //TC: O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthFromEnd(int n){
        //Calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {    //We want to remove head
            head = head.next;
            sz--;
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //Check if LL is Palindrome
    //Slow-Fast Approach
    public Node findMid(Node head){     //Helper Function
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;    //slow is my Mid.
    }

    public boolean checkPalindrome(){
        if (head == null || head.next == null) {
            return true;
        }

        //Step 1: Find Mid
        Node midNode = findMid(head);

        //Step 2: Reverse a Second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;  //Right half head
        Node left = head;

        //Step 3: Check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    public static boolean isCycle(){    //Floyd's Cycle Finding Algo
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;   //+1
            fast = fast.next.next;  //+2
            if (slow == fast) {
                return true;    //Cycle exists
            }
        }
        return false; //cycle dosen't exists
    }

    public static void removeCycle(){
        //Detecting cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;   //+1
            fast = fast.next.next;   //+2
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        //Finding meeting point
        slow = head;
        Node prev = null;   //Last Node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> lastNode.next = null
        prev.next = null;
    }

    // Merge Sort
    private static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;    //Mid Node
    }

    private static Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
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

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }
    
    private static Node mergeSort(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        
        //Finding Mid
        Node midNode = getMid(head);

        //Left & Right Sorting
        Node rightHead = midNode.next;
        midNode.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //Merge
        return merge(newLeft, newRight);
    }

    public void zigzag(){
        //Find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //Reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //Alternate merging - zigzag merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // print();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.add(2, 9);
        // print();

        //System.out.println(ll.size);

        // ll.removeFirst();
        // print();

        // ll.removeLast();
        // print();
        // System.out.println(ll.size);

        // int idx = 1;
        // ll.removeNth(idx);
        // print();

        // System.out.println(ll.iterativeSearch(9));
        // System.out.println(ll.iterativeSearch(10));

        // System.out.println(ll.recursiveSearch(head,9));
        // System.out.println(ll.recursiveSearch(head,10));

        // ll.iterativeReverse();
        // print();

        // ll.removeNthFromEnd(3);
        // print();

        //Palindrome
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // print();    //1->2->2->1
        // System.out.println(ll.checkPalindrome());

        //Cycle detection
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // //1->2->3->2
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        //Merge Sort
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // // ll.addLast(0);
        // //4->3->2->1->0
        // print();
        // head = mergeSort(head);     //TC: O(logn)
        // print();

        //Zig-zag Linked List
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        //1->2->3->4->5->6
        print();
        ll.zigzag();
        print();
    }
}
