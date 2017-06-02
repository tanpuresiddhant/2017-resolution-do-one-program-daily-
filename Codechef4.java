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
    
class Codechef4
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
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Node head1=null ;
		Node head2=null ;
		head1 = appendNode(head1, 7);
		appendNode(head1, 1);
		appendNode(head1, 6);
		
		head2 = appendNode(head2, 5);
		appendNode(head2, 9);
		appendNode(head2, 2);
		
		printNode(head1);
		printNode(head2);
		System.out.println("***********************************");
		//printNode(head1);
		//System.out.println("***********************************");
		
		
	}
}
