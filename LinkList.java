public class LinkList{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtLast(10);
        list.display();
        list.delete(2);
        list.display();
    }
}
class LL{
    private Node head;
    private Node tail;
    private int size;
    //constructor
    public LL(){
        this.size = 0;
    }
    public  void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail =head ;
        }
        size +=1;
    }
    public void insertAtLast(int value){
        Node node = new Node(value);
        if(tail == null){
            insertAtFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    public int deleteNodeFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        if(size <=1){
            return deleteNodeFirst();
        }
        Node secondlast = get(size -2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }
    public int delete(int index){
        if(index == 0){
            return deleteNodeFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
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
    public Node get(int index){
        Node node = head;
        for(int i =0 ; i< index ; i++){
            node =node.next;
        }
        return  node;
    }

    public void display(){
        Node temp = head;
        while (temp!=null ){
            System.out.print("-"+temp.value+"-");
            temp = temp.next;
            }
            System.out.println("-END");
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}