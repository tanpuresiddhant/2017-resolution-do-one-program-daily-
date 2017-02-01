/* Siddhant Tanpure
* Maximum repeating number 
* http://www.practice.geeksforgeeks.org/viewSol.php?subId=1440602&pid=593
* 2/1/2017
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG18 {
    public static void findMaxRepeating(int[] narr, int[] arr){
        int index=Integer.MAX_VALUE;
        int value=0;
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<narr.length;i++){
            //System.out.println(i);
            arr[narr[i]]++;
            
            if(maxValue==arr[narr[i]]&&index>narr[i]){
                //maxValue = arr[narr[i]];
                index = narr[i];
            }
            if(maxValue<arr[narr[i]]){
                maxValue=arr[narr[i]];
                index= narr[i];
            }
            
            
        }
        
        System.out.println(index);
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[k];
		    int narr[] = new int[n];
		    for(int j=0;j<n;j++){
		        narr[j]=sc.nextInt();
		    }
		    findMaxRepeating(narr,arr);
		}
	}
}
