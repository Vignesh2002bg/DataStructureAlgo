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
    public void InsertAtPosition(LinkedList list,int data,int index)
    {
        Node newnode=new Node(data);
        Node node=list.head;
        int dumpIndex=0;
        if(index==0)
        {
            newnode.next=head;
            head=newnode;
        }else{
            while(node.next!=null && dumpIndex<index-1)
            {
                node=node.next;
                dumpIndex++;
            }
            newnode.next=node.next;
            node.next=newnode;
        }

    }
    public void updateElement(LinkedList list,int data,int index)
    {
        if (list.head == null) {
            System.out.println("The list is empty. No element to update.");
        }

        Node currentnode = list.head;
        int currentIndex = 0;

        // Traverse to the node at the specified index
        while (currentnode != null && currentIndex < index) {
            currentnode = currentnode.next;
            currentIndex++;
        }

        // Check if the index is valid
        if (currentnode == null) {
            System.out.println("Index " + index + " out of bounds. No element updated.");
        }
        currentnode.data=data;

    }
    public void removeElement(LinkedList list, int index) {
        if (list.head == null) {
            System.out.println("The list is empty. Nothing to remove.");
            return;
        }

        if (index == 0) {
            list.head = list.head.next;
            return;
        }

        Node current = list.head;
        int currentIndex = 0;

        // Traverse the list to find the node before the index
        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        // Remove the node at the given index
        current.next = current.next.next;
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
