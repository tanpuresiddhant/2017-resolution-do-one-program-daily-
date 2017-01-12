/*
* Siddhant Tanpure
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=1095
* Next larger element
* Date: 1/11/2016
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG5 {
    public static void printMaxElements(int[] arr, int n){
        boolean flag = true;
        for(int i =0;i<n-1;i++){
            flag = true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print("-1"+" ");
            }
        }
        System.out.print("-1"+" ");
        System.out.println();
    }
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=sc.nextInt();
		    }
		    printMaxElements(arr,n);
		}
	}
}
