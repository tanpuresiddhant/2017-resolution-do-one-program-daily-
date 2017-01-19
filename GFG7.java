/* Siddhant Tanpure
* Amount of Water
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=393
* 1/19/2017
*
*/

// solution 1
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG7 {
    public static void calculateWater(int arr[]){
        int left = 0;
        int right = arr.length-1;
        int water = 0 ;
        int maxLeft=0, maxRight=0;
        while(left<=right){
            if(arr[left]<=arr[right]){
                if(maxLeft<=arr[left]){
                    maxLeft = arr[left];
                }else{
                    water = water + (maxLeft - arr[left]);
                }
                left++;
            }else{
                if(maxRight<=arr[right]){
                    maxRight = arr[right];
                }else{
                    water = water + (maxRight-arr[right]);
                }
                right--;
            }
        }
        
        System.out.println(water);
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int j = 0 ;j<n;j++){
		        arr[j]=sc.nextInt();
		       // System.out.println(arr[i]);
		    }
		    calculateWater(arr);
		}
	}
}

/* Solution 2
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void calculateWater(int arr[]){
        int len = arr.length;
        int[] left = new int[len];
        int[] right = new int[len];
       
        left[0] = arr[0];
        for(int i =1;i<len;i++){
            left[i]=Math.max(left[i-1],arr[i]);
            
        }
        
        right[len-1] = arr[len-1];
        for(int i = len-2;i>=0;i--){
            right[i]=Math.max(right[i+1], arr[i]);
            
        }
        int water=0;
        for(int i =0;i<len;i++){
            water += (Math.min(left[i],right[i])-arr[i]); 
        }
        System.out.println(water);
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int j = 0 ;j<n;j++){
		        arr[j]=sc.nextInt();
		       // System.out.println(arr[i]);
		    }
		    calculateWater(arr);
		}
	}
}*/
