import java.io.*;
public class Delete_a_node_in_the_linkedlist {
    Node head;
    class Node{
        int data;
        Node next;
        Node (int d)
        {
            data=d;
            next=null;
        }
    }
    void deleteNode(int key)
    {
        Node temp=head,prev=null;
        if(temp !=null && temp.data==key)
        {
            head=temp.next;
            return;
        }
        while(temp!=null&&temp.data!=key)
        {
            prev=temp;
            temp=temp.next;

        }
        if(temp==null)
            return;
        prev.next=temp.next;
    }

    public void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void printlist()
    {
        Node tnode=head;
        while(tnode!=null)
        {
            System.out.print(tnode.data +"");
            tnode=tnode.next;
        }
    }
    public static void main(String []args)
    {
        Delete_a_node_in_the_linkedlist list=new Delete_a_node_in_the_linkedlist();
        list.push(7 );
        list.push(1 );
        list.push(3 );
        list.push(2 );
        System.out.println("created linkedlist is:\n");
        list.printlist();
        list.deleteNode(1);
        System.out.println("\nlinkedlist after deletion of i");
        list.printlist();
    }
}
