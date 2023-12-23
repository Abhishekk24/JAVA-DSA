import java.util.*;

public class QueueImplementationuseStack {
    class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void Push(int x) {

            s1.push(x);

        }

        public int Pop() {
            int res=0;
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1; // Return a suitable value for an empty queue
            } else {
                int s = s1.size();
                for (int i = 0; i < s; i++) {
                    s2.push(s1.pop());
                    res = s2.pop();
                }
                
            }
            while (!s2.empty()) {
                s1.push(s2.pop());
            }
            return res;
        }

        public int Peek() {
            return s1.isEmpty() ? -1 : s1.peek();
        }

        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        public int size() {
            return s1.size() + s2.size();
        }
    }

    public static void main(String[] args) {
        QueueImplementationuseStack obj = new QueueImplementationuseStack();
        Queue q1 = obj.new Queue();
        q1.Push(4);
        q1.Push(3);
        q1.Push(5);
        System.out.println("Peek: " + q1.Peek());
        System.out.println("Pop: " + q1.Pop());
        System.out.println("Size of the queue: " + q1.size());
    }
}
