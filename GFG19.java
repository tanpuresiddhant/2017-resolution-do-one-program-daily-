/* Siddhant Tanpure
* Array to BST
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=505
* 2/1/2017
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
        int num;
        Node left,right;
    }

class GFG19 {
    
    public static Node createBst(int[] arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node();
        root.num=arr[mid];
        //System.out.println(arr[mid]);
        root.left = createBst(arr, start, mid-1);
        root.right = createBst(arr, mid+1, end);
        return root;
    }
    public static void printPreOrder(Node root){
        if(root!=null){
            System.out.print(root.num+" ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
        return;
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int j=0;j<n;j++){
		        arr[j] = sc.nextInt();
		    }
		    Node root;
		    root = createBst(arr, 0 , arr.length-1);
		    printPreOrder(root);
		    System.out.println();
		}
	}
}
