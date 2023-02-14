import java.io.*;
public class Middle_of_LnkedList {
    Node head;
    //creating a new node
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    /*Functions to add new node*/
    public void pushNode(int data)
    {
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
    /*Displaying the elements in the list*/
    public void printNode()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("NULL"+"\n");

    }
    /*Finding the length of the list*/
   public  int getlen()
   {
       int length=0;
       Node temp=head;
       while(temp!=null)
       {
           length++;
           temp=temp.next;
       }
       return length;
   }
   /*printing the middle element of the list*/
    public void printMiddle()
    {
        if(head!=null)
        {
            int length=getlen();
            Node temp=head;
            int middlelength=length/2;
            while(middlelength!=0)
            {
                temp=temp.next;
                middlelength--;
            }
            System.out.print("The middle element is ["+temp.data+"]");
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        Middle_of_LnkedList list=new Middle_of_LnkedList();
        for(int i=5;i>=1;i--)
        {
            list.pushNode(i);
            list.printNode();
            list.printMiddle();
        }
    }



}
