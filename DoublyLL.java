public class DoublyLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtFirst(20);
        list.insertAtFirst(10);
        list.insertAtFirst(30);
        list.insertAtLast(50);
        list.insert(40, 10);
        list.display();
    }
}
class DLL{
    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }
    public void insertAtFirst(int value){
        Node node = new Node(value);
        if (head == null && tail==null ){
            
            head = node;
            node.prev = null;
            node.next = null;

        }
        else{
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }
    }
    public void insertAtLast(int value){
        Node last = new Node(value);
       Node node = head;
        last.next = null;
       while(node.next != null){
        node = node.next;
       }
       if(head == null){
        head=last;
        last.next = null;
        last.prev = null;
       }
       node.next = last;
       last.prev=node;
       
    }
    public void insert(int after , int value){
        Node p = find(value);
        Node node = new Node(value);
        if(p.next == null){
            p.next = node;
            node.prev = p;
            node.next = null;
        }
        else{
            node.next = p.next;
            p.next = node;
            node.prev = p;
            if(node.next != null){
                p.next.prev = node;
            }
            
        }
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev = prev;
        }

    }
    public void display(){
        Node temp = head;
        while (temp!=null ){
            System.out.print("-"+temp.value+"-");
            temp = temp.next;
            }
            System.out.println("-END");
    }
}
