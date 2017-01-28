/*
* Siddhant Tanpure
* Three Great Candidates
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=765
* 1/28/2017
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG14 {
    public static void getMaxThree(int[] arr){
        Arrays.sort(arr);
        if(arr[0]<0&&arr[1]<0){
            long max1 = arr[0] * arr[1] * arr[arr.length-1];
            long max2 = arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3];
            if(max2>max1){
                System.out.println(max2);
            }else{
                System.out.println(max1);
            }
        }else{
            long max2 = arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3];
            System.out.println(max2);
        }
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int j=0;j<n;j++){
		        arr[j] = sc.nextInt();
		    }
		    getMaxThree(arr);
		}
	}
}
