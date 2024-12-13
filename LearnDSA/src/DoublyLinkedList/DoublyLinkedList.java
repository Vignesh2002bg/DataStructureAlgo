package DoublyLinkedList;
class Node{
    int data;
    Node prev;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class DoublyLinkedList {
    Node head;
    public  void InsertData(int data)
    {
        // 20 30 40
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }else{
            Node node=head;
            while(node.next!=null)
            {
                node=node.next;
            }
            node.next=newnode;
            newnode.prev=node;

        }
    }
    public void InsertStart(int data)
    {
        //20 30 40
        //40 30 20
        Node newnode=new Node(data);

        if(head==null)
        {
            head=newnode;
        }else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }

    }
    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
