/* Siddhant Tanpure
* Date: 01/08/2017
* 2017-resolution-do-one-program-daily
* Cutting rod dynamic programming
* 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
    public static void cutting_rod(int[] arr, int N){
        int[][] sol = new int[arr.length][N+1];
        
        for(int i =1;i<arr.length;i++){
            for(int j = 1 ; j<N+1;j++){
                if(j>=i){
                if(sol[i-1][j]<=(sol[i][j-i]+arr[i])){ //insert value at location i,j which is greater from location above or j-1 plus arr location 
                    sol[i][j]=(sol[i][j-i]+arr[i]);
                }else{
                    sol[i][j]=sol[i-1][j];
                } 
                }else if(j<i){ //if j is less than i insert value present at above location
                    sol[i][j] = sol[i-1][j];
                }
            }
        }
        
        /* Print the matrix to check values present in the matrix
        /*for(int l = 0 ;l<arr.length;l++){
            for(int m =0;m<N+1;m++){
                System.out.print(sol[l][m]+" ");
            }
            System.out.println();
        }*/
        
        
        /*Traverse the matrix to get the size of the rod which will give the maximum profit */
        boolean flag = true;
        int i = arr.length-1, j = N;
        while(flag){
            if(j==0||i==0){
                flag=false;
            }
            if(sol[i][j]==sol[i-1][j]){
                i = i-1;
            }else {
                j=j-i;
                System.out.print(i+" ");
            }
        }
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int l = sc.nextInt();
		int arr[] = new int[l+1];
		for(int i = 1 ; i< l+1; i++){
		    arr[i]= sc.nextInt();
		 }
		// Codechef c = new Codechef();
		 cutting_rod(arr, N);
	}
}
