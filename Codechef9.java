/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class MyQueue<T>{
    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;
        public QueueNode(T item){
            this.data = item;
        }
    }
    
    private QueueNode<T> first;
    private QueueNode<T> last;
    
    public void add(T item){
        QueueNode<T> t = new QueueNode<T>(item);
        
        if(first==null){
            first = t;
            last = t;
        }else{
            last.next = t;
            last = t;
        }
    }
    
    public T remove(){
        T temp;
        if(first==null){
            return null;
        }else if(first==last){
            temp=last.data;
            first = null;
            last=null;
            return temp;
        }else{
            temp = first.data;
            first = first.next;
            return temp;
        }
    }
    
    public T peek(){
        if(first==null){
            return null;
        }
        return first.data;
    }
    
    public boolean isEmpty(){
        if(first==null){
            return true;
        }else{
            return false;
        }
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class Codechef9
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		MyQueue<Integer> q1 = new MyQueue<Integer>();
		q1.add(4);
		q1.add(23);
		System.out.println(q1.peek());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.isEmpty());
	}
}
