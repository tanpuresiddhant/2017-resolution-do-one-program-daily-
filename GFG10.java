/*
* Siddhant Tanpure
* Value equal to index value
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=473
* 1/22/2017
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG10 {
    public static void getValue(int[] arr){
        boolean flag = true;
        for(int i=1;i<arr.length;i++){
            if(i==arr[i]){
                System.out.print(arr[i]+" ");
                flag = false;
            }
        }
        if(flag){
            System.out.print("Not Found");
        }
        //System.out.println();
        return;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
		    int n = sc.nextInt();
		    int[] arr = new int[n+1];
		    for(int j=1;j<n+1;j++){
		        arr[j]=sc.nextInt();
		        //System.out.println(arr[j]);
		        }
		    getValue(arr);
		    System.out.println(" ");
		}
	}
}