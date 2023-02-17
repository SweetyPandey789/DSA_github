import java.io.*;
import java.util.*;
public class add_two_numbers_in_linkedlist {
    public static class Node{
        int value;
        Node next;
        Node(int value)
        {
            this.value=value;
            this.next=null;
        }
    }
    public static class linkedlist{
        Node head;
        Node curr;
        linkedlist(){
            head=null;
            curr=null;
        }
    }
    public static void main(String []args)
    {
        linkedlist list1=new linkedlist();
        Node node=new Node(9);
        list1.head=node;
        list1.curr=list1.head;
        list1.curr.next=new Node(3);
        list1.curr=list1.curr.next;
        list1.curr.next=new Node(2);
        list1.curr=list1.curr.next;
        list1.curr.next=new Node(7);

        linkedlist list2= new linkedlist();
        Node node2=new Node(9);
        list2.head=node2;
        list2.curr=list2.head;
        list2.curr.next=new Node(5);
        list2.curr=list2.head;
        list2.curr.next=new Node(6);
        list2.curr=list2.head;
        list2.curr.next=new Node(7);
    int num1=getNumFromList(list1.head);
        int num2=getNumFromList(list2.head);
        int sum=num1+num2;
        Node newHead=getListFromNum(sum);
        Node temp=newHead;
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;

        }
    }
public static int getNumFromList(Node head)
{
    int n=0;
    Node temp=head;
    while(temp!=null)
    {
        temp=temp.next;
        n++;
    }
    n--;
    int num=0;
    temp=head;
    while(temp!=null)
    {
        num+=temp.value*Math.pow(10,n--);
        temp=temp.next;
    }
    return num;
}
public static Node getListFromNum(int num) {
    if (num >= 1 && num <= 9)
        return new Node(num);
    int rem = num / 10;
    Node rr = getListFromNum(rem);
    Node temp = new Node(num % 10);
    Node temp2 = rr;
    while (temp2.next != null)
        temp2 = temp2.next;
        temp2.next = temp;
        return rr;
    }
}
