/* Siddhant Tanpure
* Missing number in array
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=414
* 2/07/2017
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG20 {
    public void getMissingElement(int[] arr){
        int j=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==j){
                j++;
            }else{
                System.out.println(j);
                break;
            }
        }
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++){
		    int n =sc.nextInt();
		    int arr[] = new int[n-1];
		    for(int j=0;j<n-1;j++){
		        arr[j]=sc.nextInt();
		      //  System.out.print(arr[j]+" ");
		    }
		    GFG20 gfg = new GFG20();
		    gfg.getMissingElement(arr);
		    //System.out.println();
		}
	}
}
