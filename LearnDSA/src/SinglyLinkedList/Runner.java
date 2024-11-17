package SinglyLinkedList;

public class Runner {

    public static void main(String [] args)
    {
        LinkedList list=new LinkedList();
        list.InsertDataEnd(list,20);
        list.InsertDataEnd(list,30);
        list.InsertDataEnd(list,25);
        list.InsertDataEnd(list,75);
        list.PrintNode(list);
    }
}
