import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int[] queue = new int[100];
    static int start1=0;
    static int end1=0;
    static int start2=34;
    static int end2=34;
    static int start3=64;
    static int end3=64;
    
    public static void addInFirstQueue(int item){
        if(end1>34){
            end1 =0;
            queue[end1] = item;
            end1++;
        }else{
            queue[end1]=item;
            end1++;
        }
    }
    
    public static int removeFromFirstQueue(){
        int item;
        if(start1==end1&&start1!=0&&end1!=0){
            item=queue[start1];
            end1 =0;
            start1=0;
            return item;
        }else{
            item=queue[start1];
            start1++;
            if(start1>34){
                start1=0;
            }
            return item;
        }
    }
    
    public static void addInSecondQueue(int item){
        if(end2>64){
            end2 =34;
            queue[end2] = item;
            end2++;
        }else{
            queue[end2]=item;
            end2++;
        }
    }
    
    public static int removeFromSecondQueue(){
        int item;
        if(start2==end2&&start2!=34&&end2!=34){
            item=queue[start2];
            end1 =34;
            start1=34;
            return item;
        }else{
            item=queue[start2];
            start2++;
            if(start2>64){
                start2=34;
            }
            return item;
        }
    }
    
    public static void addInThirdQueue(int item){
        if(end3>100){
            end3 =64;
            queue[end3] = item;
            end1++;
        }else{
            queue[end3]=item;
            end3++;
        }
    }
    
    public static int removeFromThirdQueue(){
        int item;
        if(start3==end3&&start3!=100&&end3!=100){
            item=queue[start3];
            end3 =34;
            start3=34;
            return item;
        }else{
            item=queue[start3];
            start3++;
            if(start3>100){
                start3=34;
            }
            return item;
        }
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		addInFirstQueue(7);
		addInFirstQueue(3);
		addInFirstQueue(2);
		addInFirstQueue(6);
		System.out.println(removeFromFirstQueue());
		System.out.println(removeFromFirstQueue());
		System.out.println(removeFromFirstQueue());
		addInFirstQueue(39);
		addInFirstQueue(23);
		System.out.println(removeFromFirstQueue());
		System.out.println(removeFromFirstQueue());
		
		
	}
}
