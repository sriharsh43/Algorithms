public class DLL {
    private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        node.next = null;
        //If the list is empty/null then head = node,node.prev = null
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next =node;
        node.prev = temp;

    }
    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertPos(int after, int val){
        Node p = find(after);
        if (p == null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null){
            node.next.prev = node;
        }
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.val + " ->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse : ");
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(11);
        list.insertFirst(15);
        list.insertFirst(7);
        list.insertLast(19);
        list.insertPos(11,13);
        list.display();
    }
    private class Node{
        public Node(int val) {
            this.val = val;
        }

        int val;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        Node next;
        Node prev;
    }
}
