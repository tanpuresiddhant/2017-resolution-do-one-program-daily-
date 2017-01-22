/*
* Siddhant Tanpure
* Reverse sub array
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=516
* 1/22/2017
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG9 {
    public static void printReverseSubarray(int[] arr,int s,int l){
        int l2=l;
        for(int i=1;i<arr.length;i++){
            if(s==i){
                while(l!=s){
                    System.out.print(arr[l]+" ");
                    l--;
                }
                System.out.print(arr[s]+" ");
                i=l2;
            }else{
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        return;
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
		    int n = sc.nextInt();
		    int arr[] = new int[n+1];
		    for(int j=1;j<n+1;j++){
		        arr[j]=sc.nextInt();
		    }
		    int s =sc.nextInt();
		    int l = sc.nextInt();
		    printReverseSubarray(arr, s, l);
		}
	}
}