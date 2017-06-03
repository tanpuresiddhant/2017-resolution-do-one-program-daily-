/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Node{
        int data;
        Node next = null;
        public Node(int d){
            data = d;
        }
    }
    
class Codechef7
{
    
    //static Node head;
    
    public static Node appendNode(Node head, int temp){
        if(head == null){
            head = new Node(temp);
            //head.data = temp;
        }else{
            Node trav = head;
            while(trav.next!=null){
                trav =  trav.next;
            }
            Node newNode = new Node(temp);
            //newNode(7);
            
            trav.next = newNode;
        }
        return head;
    }
    
    public static void printNode(Node head){
        if(head == null){
            System.out.println("No element present");
        }else{
            Node trav = head;
            while(trav!=null){
                System.out.println(trav.data);
                trav = trav.next;
            }
        }
    }
    public static void getTheIntersectionOfTwoLinkedList(Node head1, Node head2){
        Node current1 = head1;
        Node current2 = head2;
        int len1=0;
        int len2=0;
        while(current1!=null){
            len1 +=1;
            current1 = current1.next;
        }
        
        while(current2!=null){
            len2 +=1;
            current2 = current2.next;
        }
        current1 = head1;
        current2 = head2;
        if(len1>=len2){
            int tempLen = len1-len2;
            while(tempLen!=0){
                current1=current1.next;
                tempLen--;
            }
            while(current1.next!=current2.next){
                current1=current1.next;
                current2=current2.next;
            }
            System.out.println(current1.next.data);
        }else if(len2>len1){
            int tempLen = len2-len1;
            while(tempLen!=0){
                current2=current2.next;
                tempLen--;
            }
            while(current1.next!=current2.next){
                current1=current1.next;
                current2=current2.next;
            }
            System.out.println(current1.next.data);
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Node head1=null ;
		Node head2=null ;
		head1 = appendNode(head1, 9);
		appendNode(head1, 8);
		appendNode(head1, 4);
		appendNode(head1, 3);
		appendNode(head1, 6);
		appendNode(head1, 2);
		appendNode(head1, 12);
		appendNode(head1, 16);
		
		head2 = appendNode(head2, 1);
		appendNode(head2, 9);
		appendNode(head2, 2);
		head2.next.next.next=head1.next.next;
		System.out.println("first number is");
		printNode(head1);
		System.out.println("***********************************");
		System.out.println("Second number is");
		printNode(head2);
		System.out.println("***********************************");
		
		getTheIntersectionOfTwoLinkedList(head1,head2);
		System.out.println("***********************************");
		
		
	}
}
