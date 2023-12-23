import java.util.*;

public class StackUsingQueue {
    class Stack {
        Queue<Integer> q  = new LinkedList<>();

       

        public void push(int x) {
            int s = q.size();
            q.add(x);
            for (int i = 0; i < s; i++) {
                q.add(q.remove());
            }
        }

        public void pop() {
            if (q.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            q.remove();
        }

        public int top() {
            if (q.isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Return a suitable value for an empty stack
            }
            return q.peek();
        }

        public int size() {
            return q.size();
        }
    }

    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue = new StackUsingQueue();
        Stack s = stackUsingQueue.new Stack();
        s.push(3);
        s.push(2);
        System.out.println("Deleted element: " + s.top());
        s.pop();
        System.out.println("Top element: " + s.top());
    }
}
