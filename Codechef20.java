/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef20
{
    public static Stack<Integer> stackSort(Stack<Integer> stack){
        if(stack.isEmpty()){
            return stack;
        }
        int x = stack.pop();
        stackSort(stack);
        insertInStack(stack, x);
        return stack;
    }
    public static Stack<Integer> insertInStack(Stack<Integer> stack, int x){
        if(stack.isEmpty()){
            stack.push(x);
            return stack;
        }
        if(stack.peek()<x){ // change this to less than sign to sort in descending order
            int y = stack.pop();
            insertInStack(stack, x);
            stack.push(y);
            return stack;
        }else{
            stack.push(x);
            return stack;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(5);
		stack.add(3);
		stack.add(52);
		stack.add(53);
		stack.add(12);
		stack = stackSort(stack);
		for(int i=0;i<5;i++){
		    System.out.println(stack.pop());
		}
	}
}
