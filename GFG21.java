/* Siddhant Tanpure
* Preorder Traversal and BST
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=719
* 2/08/2017
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG21 {
    public boolean validatePreOrder(int pre[]){
        Stack<Integer> stack = new Stack<Integer>();
        int root = Integer.MIN_VALUE;
        for(int i=0;i<pre.length;i++){
            if(pre[i]<root){
                return false;
            }
            if(!stack.isEmpty()&&stack.peek()<pre[i]){
                root = stack.pop();
            }
            stack.push(pre[i]);
        }
        return true;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int pre[] = new int[n];
		    for(int j=0;j<n;j++){
		        pre[j]=sc.nextInt();
		    }
		    GFG21 gfg = new GFG21();
		    boolean flag = gfg.validatePreOrder(pre);
		    if(flag){
		        System.out.println("1");
		    }else{
		        System.out.println("0");
		    }
		}
	}
}
