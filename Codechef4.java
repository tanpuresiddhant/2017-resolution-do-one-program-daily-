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
    
class Codechef
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
    
    public static Node addTwoNumbersFromLL(Node head1,Node head2){
        Node head3 = null;
        int sum=0;
        int carry=0;
        Node current1 = head1;
        Node current2 = head2;
        if(head1==null){
            if(head2==null){
                return null; 
            }else{
                return head2;
            }
        }else{
            if(head2==null){
                return head1;
            }
             
            while(current1!=null&&current2!=null){
                sum = current1.data + current2.data+carry;
                //System.out.println(sum);
                if(sum>=10){
                    int temp = sum % 10;
                    carry = sum / 10;
                    head3 = appendNode(head3, temp);
                }else{
                    carry=0;
                    head3 = appendNode(head3, sum);
                }
                
                current1=current1.next;
                current2=current2.next;
                
            }
            if(current1!=null){
               // System.out.println("I am here");
                while(current1!=null){
                   sum = current1.data + carry;
                   if(sum>=10){
                        int temp = sum % 10;
                        carry = sum / 10;
                        head3 = appendNode(head3, temp);
                    }else{
                        carry = 0 ;
                        head3 = appendNode(head3, sum);
                    } 
                    current1 = current1.next;
                }
            }
            if(current2!=null){
                //System.out.println("I am here2");
                while(current2!=null){
                   sum = current2.data + carry;
                   if(sum>=10){
                        int temp = sum % 10;
                        carry = sum / 10;
                        head3 = appendNode(head3, temp);
                    }else{
                        carry = 0 ;
                        head3 = appendNode(head3, sum);
                    }
                    current2 = current2.next;
                }
            }
            if(carry!=0){
                //System.out.println("I have a carry " + carry);
               if(carry>=10){
                   while(carry>=10){
                       int temp = carry % 10;
                       carry = carry / 10;
                       head3 = appendNode(head3, temp);
                   }
                     head3 = appendNode(head3, carry);
                }else{
                    head3 = appendNode(head3, carry);
                }
            }
        }
        return head3;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Node head1=null ;
		Node head2=null ;
		head1 = appendNode(head1, 9);
		appendNode(head1, 9);
		appendNode(head1, 9);
		appendNode(head1, 9);
		//appendNode(head1, 6);
		
		head2 = appendNode(head2, 1);
		//appendNode(head2, 9);
		//appendNode(head2, 2);
		System.out.println("first number is");
		printNode(head1);
		System.out.println("***********************************");
		System.out.println("Second number is");
		printNode(head2);
		//System.out.println("***********************************");
		
		Node head3 = addTwoNumbersFromLL(head1,head2);
		System.out.println("***********************************");
		System.out.println("Sum is");
		printNode(head3);
		System.out.println("***********************************");
		
		
	}
}
