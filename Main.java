public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.InsertFirst(3);
        list.InsertFirst(5);
        list.InsertFirst(39);
        list.InsertFirst(7);
        list.InsertFirst(15);

        /*list.InsertLast(67);
        list.InsertLast(76);*/

       // list.InsertPos(43,3);
       list.display();
        /*System.out.println(list.deleteHead());
        list.display();
        System.out.println(list.deleteTail());
        list.display();*/

       /* System.out.println(list.deletePos(2));
        list.display();*/
        System.out.println(list.find(39));
        list.display();


    }
}