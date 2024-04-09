//import java.util.ArrayList;
import java.util.Stack;

public class StackB {
    
    /*public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }*/
    
    /*public static class Stack{
        
        // //Stack Implementation using ArrayList
        // static ArrayList<Integer> list = new ArrayList<>();

        // //IsEmpty Function
        // public boolean isEmpty(){
        //     return list.size() == 0;
        // }

        // //Push
        // public void push(int data){
        //     list.add(data);
        // }

        // //Pop
        // public int pop(){
        //     if (isEmpty()) {
        //         return -1;
        //     }
        //     int top = list.get(list.size() - 1);
        //     list.remove(list.size()-1);
        //     return top;
        // }

        // //Peek
        // public int peek(){
        //     if (isEmpty()) {
        //         return -1;
        //     }
        //     return list.get(list.size() - 1);
        // }


        //Stack implementation using LinkedList
        public static Node head;

        //IsEmpty function
        public boolean isEmpty(){
            return head == null;
        }

        //Push
        public void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //Pop
        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //Peek
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }*/

    public static void pushAtBottom(Stack<Integer> s, int data){
        //Base Case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        //Recursion
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.empty()) {
            char curr = s.pop();
            result.append(curr + " ");
        }

        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s){
        //Base Case
        if (s.isEmpty()) {
            return;
        }

        //Recursion
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        //Stack s = new Stack();

        //Implementing Stack directly using JCF(Java Collection Framework)
        //Push at Bottom
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4);

        // while (!s.isEmpty()) {  //While isEmpty is false
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        //Reverse a String
        // String str = "abc";
        // System.out.println(reverseString(str));

        //Reverse a Stack
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);
    }
}
