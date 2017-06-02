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
    
class Codechef3
{
    
    static Node head;
    
    public static Node appendNode(int temp){
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
    public static void printNode(){
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
    public static void kthToTheLast(int k){
        if(head ==null){
            System.out.println("No elements present!");
        }else{
            Node current = head;
            while(k!=0){
                current = current.next;
                k--;
            }
            Node kthToTheLast = head;
            while(current!=null){
                kthToTheLast = kthToTheLast.next;
                current = current.next;
            }
             System.out.println(kthToTheLast.data); 
        }
       
    }
    public static void removeDuplicate(){
        if(head==null){
            return;
        }else{
            Node trav = head;
            while(trav.next!=null){
                Node trav1 = trav.next;
                Node current = trav;
                while(trav1!=null){
                    if(trav.data==trav1.data){
                        if(trav1.next==null){
                            System.out.println(trav1.data);
                            trav.next = null;
                            return;
                        }else{
                            System.out.println(trav1.data);
                            current.next = current.next.next;
                            trav1 = current;
                        }
                    }
                    current = trav1;
                    trav1=trav1.next;
                }
                trav = trav.next;
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		head = appendNode(7);
		appendNode(7);
		appendNode(6);
		appendNode(8);
		appendNode(9);
		appendNode(9);
		appendNode(25);
		appendNode(21);
		appendNode(27);
		appendNode(24);
		appendNode(56);
		appendNode(56);
		appendNode(57);
		appendNode(59);
		appendNode(52);
		printNode();
		System.out.println("***********************************");
		kthToTheLast(6);
		//removeDuplicate();
		System.out.println("***********************************");
		printNode();
		
		
		
	}
}
