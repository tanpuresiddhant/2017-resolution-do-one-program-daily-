/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the 10
{
    static int queue[100];
    int start1=0;
    int end1=0;
    int start2=34;
    int end2=34;
    int start3=64;
    int end3=64;
    
    public static void addInFirstQueue(int item){
        if(end>33){
            end =0;
            queue[end] = item;
            end++;
        }else{
            queue[end]=item;
            end++;
        }
    }
    
    public static int removeFromFirstQueue(){
        int item;
        if(start==end&&start!=0&&end!=0){
            queue[start] = item;
            end =0;
            start=0;
        }else{
            item=queue[first];
            first++;
            if(first>33){
                first=0;
            }
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
}
