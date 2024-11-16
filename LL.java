import org.w3c.dom.Node;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;

        }
        //size++;
        size = +1;
    }
    //Insertion at last

    public void InsertLast(int val){
        Node node = new Node(val);
        if (tail == null){
            InsertFirst(val);
            return; // or you can use else statement
        }
        tail.next = node;
        tail = node;
        size++;
    }
        //Insertion at particular position
    public void InsertPos(int val,int index){
        if (index == 0){
            InsertFirst(val);
            return;
        }
        if (index == size){
            InsertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    //Displaying the LL

    public void display(){
        Node temp = head;
        while (temp != null ){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("ENDS...!");
    }

    public int deleteHead(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteTail(){
        if (size <= 1){
            return deleteHead();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    //Delete at particular position
    public int deletePos(int index){
        if (index == 0){
            return deleteHead();
        }
        if (index == size -1){
            return deleteTail();

        }
        //Index at particular position go to previous node from index value
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value){
        Node node = head;
       while (node != null){
           if (node.value == value) {
               return node;
           }
           node = node.next;
       }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //Structure of the Linked List
    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value){
            this.value = value;
        }
    }
}
