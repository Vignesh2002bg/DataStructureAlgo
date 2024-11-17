package SinglyLinkedList;

public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void InsertDataEnd(LinkedList list,int data)
    {
        Node newnode= new Node(data);

        if(list.head ==null) {
            list.head = newnode;
        }else {
            Node node=list.head;
            while(node.next!=null)
            {
                node=node.next;
            }
            node.next=newnode;
        }
    }
    public void PrintNode(LinkedList list)
    {
        Node node=list.head;

        while(node!=null)
        {
            System.out.print(node.data + " ");
            node=node.next;
        }

    }
}
