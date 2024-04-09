import java.util.LinkedList;

public class LinkedListTwo {
    
    public static void main(String[] args) {
        //Create - We have to use Integer, Float, Boolean class
        LinkedList<Integer> ll = new LinkedList<>();

        //Add
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(0);
        //4->3->2->1->0
        System.out.println(ll);

        //Remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
