package DoublyLinkedList;

public class DoublyLinkedListRunner {
    public static  void main(String []args)
    {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        System.out.println("Insert data In normal way");
        doublyLinkedList.InsertData(20);
        doublyLinkedList.InsertData(30);
        doublyLinkedList.InsertData(40);
        doublyLinkedList.printForward();
        System.out.println("Insert data at start ");
        DoublyLinkedList doublyLinkedList2=new DoublyLinkedList();
        doublyLinkedList2.InsertStart(20);
        doublyLinkedList2.InsertStart(30);
        doublyLinkedList2.InsertStart(40);
        doublyLinkedList2.printForward();
    }
}
