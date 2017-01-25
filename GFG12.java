/* Siddhant Tanpure
* Next greater number set digits
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=384
* 1/25/2017
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG12 {
    public static void getNextMax(int[] arr){
       int index=-1;
       int curr =0;
       for(int i=arr.length-1;i>0;i--){
           if(arr[i-1]<arr[i]){
               
               curr =arr[i-1];
               index = i-1;
               break;
           }
       }
       //System.out.println(curr);
       if(index==-1){
           System.out.print("not possible");
           return ;
       }else{
           int min=Integer.MAX_VALUE;
           int minIndex = 0;
           for(int i = index+1;i<arr.length;i++){
               if(min>arr[i]&&arr[i]>curr){
                   min = arr[i];
                   minIndex = i;
               }
           }
           //System.out.println(min);
           int temp = arr[index];
           arr[index] = arr[minIndex];
           arr[minIndex] = temp;
           Arrays.sort(arr, index+1, arr.length);
           for(int j =0;j<arr.length;j++){
		        System.out.print(arr[j]);
		    }
           return;
           
       }
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    String temp = Integer.toString(n);
		    //System.out.println(temp);
		    int[] arr = new int[temp.length()];
		    for(int j =0;j<arr.length;j++){
		        arr[j]= temp.charAt(j)-'0';
		    }
		    getNextMax(arr);
		    System.out.println();
		}
	}
}
