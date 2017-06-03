/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class MyStack<T>{
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;
        public StackNode(T item){
            this.data = item;
        }
    }
    
    private StackNode<T> top;
    
    public void push(T item){
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top=t;
    }
    
    public T pop(){
        if(top==null){
            return null;
        }else{
            T temp = top.data;
            top =top.next;
            return temp;
        }
    }
    
    public T peek(){
        if(top==null){
            return null;
        }
        return top.data;
    }
    
    public boolean isEmpty(){
        if(top==null){
            return false;
        }else{
            return true;
        }
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class Codechef8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		MyStack<Integer> s1 = new MyStack<Integer>();
		s1.push(4);
		s1.push(23);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.isEmpty());
	}
}
