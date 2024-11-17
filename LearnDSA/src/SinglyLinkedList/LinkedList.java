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
        //Create new Node like data and reference
        Node newnode= new Node(data);

        if(list.head ==null) {
            list.head = newnode;
        }else {
            //Assign the list's head to node
            Node node=list.head;
            // Traverse until next is equal to null
            while(node.next!=null)
            {
                //Update the pointing the data
                node=node.next;
            }

            node.next=newnode;
        }
    }
    public  void  InsertDataStart(LinkedList list,int data)
    {
        /*Example:
        *Node newnode=new Node(data)
        * newnode.next=list.head
        * list.head=newnode
        *  20 ---> 20-->null
        * null-->null
        * 20-->null
        * 30 --> 30-->null
        * null-->20
        * 20 -->30 */
        Node newnode=new Node(data);
        newnode.next=list.head;
        list.head=newnode;
    }
    public void PrintNode(LinkedList list)
    {
        Node node=list.head;

        while(node!=null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
