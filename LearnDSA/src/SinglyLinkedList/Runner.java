package SinglyLinkedList;

public class Runner {

    public static void main(String [] args)
    {
        //Insert elements at the end like this 20 30 25 75
        System.out.print("Insert Data At End : ");
        LinkedList list=new LinkedList();
        list.InsertDataEnd(list,20);
        list.InsertDataEnd(list,30);
        list.InsertDataEnd(list,25);
        list.InsertDataEnd(list,75);
        list.PrintNode(list);

        //Insert elements at the start like this 75 25 30 20
        System.out.print("Insert Data At Start : ");
        LinkedList list2=new LinkedList();
        list2.InsertDataStart(list2,20);
        list2.InsertDataStart(list2,30);
        list2.InsertDataStart(list2,25);
        list2.InsertDataStart(list2,75);
        list2.PrintNode(list2);

        //Insert elements at based on Index Postion
        System.out.print("Insert Based On Index : ");
        list.InsertAtPosition(list,99,1);
        list.PrintNode(list);

        //Remove element
        System.out.print("Remove Elements Based On Index : ");
        list.removeElement(list,1);
        list.PrintNode(list);

        //Update the element
        System.out.print("Update Elements Based On Index : ");
        list2.updateElement(list2,40,1);
        list2.PrintNode(list2);
    }
}
