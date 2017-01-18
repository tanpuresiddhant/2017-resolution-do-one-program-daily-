/*
* Siddhant Tanpure
* Single Number
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=394
* 1/18/2017
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void printSingleElement(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                if(map.get(arr[i])==2){
                    map.put(arr[i], 1);
                }else{
                    map.put(arr[i], 2);
                }
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int j =0;j<arr.length;j++){
		        arr[j]=sc.nextInt();
		    }
		    printSingleElement(arr);
		}
		
	}
}
