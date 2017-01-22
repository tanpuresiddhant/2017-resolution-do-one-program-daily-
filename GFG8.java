/*
* Siddhant Tanpure
* Pythagorean Triplet in an array
* http://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/
* 1/21/2017
* Calculate square of all the numbers then sort them and compare each square with other two to check if pythagorean triplet exist or not
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG8 {
    public static void pythagoreanTriplet(int[] arr){
        for(int i =0;i<arr.length;i++){
            arr[i]= (int)Math.pow(arr[i],2);
        }
        Arrays.sort(arr);
        for(int j=arr.length-1;j>=2;j--){
            int s = 0;
            int l = j-1;
            while(s<l){
            if(arr[s]+arr[l]==arr[j]){
                System.out.println("Yes");
                return;
            }
            if(arr[s]+arr[l]<arr[j]){
                s++;
            }else{
                l--;
            }
        }
        }
        System.out.println("No");
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
		    pythagoreanTriplet(arr);
		}
	}
}