
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Node{
        char data;
        Node next = null;
        public Node(char d){
            data = d;
        }
    }
    
class Codechef6
{
    
    //static Node head;
    
    public static Node appendNode(Node head, char temp){
        if(head == null){
            head = new Node(temp);
            //head.data = temp;
        }else{
            Node trav = head;
            while(trav.next!=null){
                trav =  trav.next;
            }
            Node newNode = new Node(temp);
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
    
    public static boolean checkForPalidrome(Node head){
        Node slowRunner = head;
        Node fastRunner = head.next;
        if(fastRunner==null){
            return true;
        }
        int count =2;
        if(fastRunner.next!=null){
            fastRunner = fastRunner.next;
            count +=1;
        }else{
            if(fastRunner.data==slowRunner.data)
                return true;
            return false;
        }
        
        Stack<Character> s1 = new Stack<Character>();
        s1.push(slowRunner.data);
        
        while(fastRunner!=null){
            //System.out.println("here");
            slowRunner = slowRunner.next;
            s1.push(slowRunner.data);
            fastRunner = fastRunner.next;
            count +=1;
            if(fastRunner!=null){
               fastRunner = fastRunner.next;
               count +=1;
            }else{
                //System.out.println("here");
                break;
            }
        }
        
        //System.out.println(count-1);
        
        if((count-1)%2!=0){
            s1.pop();
        }
        
        fastRunner = slowRunner.next; 
        boolean flag = false;
        while(!s1.isEmpty()&&fastRunner!=null){
            if(s1.pop()!=fastRunner.data){
                return false;
            }
            fastRunner=fastRunner.next;
        }
        if(!s1.isEmpty()){
            return false;
        }
        if(fastRunner!=null){
            return false;
        }
        return true;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Node head1=null ;
		head1 = appendNode(head1, 'a');
		appendNode(head1, 'b');
		appendNode(head1, 'a');
		//appendNode(head1, 'q');
		appendNode(head1, 'a');
	    appendNode(head1, 'b');
		appendNode(head1, 'a');
		System.out.println("Given Linked List of characters:");
		printNode(head1);
		System.out.println("***********************************");
		boolean flag = checkForPalidrome(head1);
		if(flag){
		    System.out.println("Palindrome");
		}else{
		    System.out.println("Not Palindrome");
		}
	}
}
