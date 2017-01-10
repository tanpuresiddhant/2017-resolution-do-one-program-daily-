/*
* Siddhant Tanpure
* Date: 01/09/2017
* Problem: http://www.practice.geeksforgeeks.org/problem-page.php?pid=775
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG1 {
    public static int getmax(int[] coins, int n){
        int[][] table = new int[n][n]; 
        int gap, i,j,x,y,z;
        for(gap = 0;gap<n;gap++){
            for(i =0,j=gap;j<n; i++,j++){
                x = ((i+2)<=j)?table[i+2][j]:0;
                y = ((i+1)<=(j-1))?table[i+1][j-1]:0;
                z = (i<=(j-2))?table[i][j-2]:0;
                table[i][j] = Math.max(coins[i]+Math.min(x,y),coins[j]+Math.min(y,z));
            }
        }
        return table[0][n-1];

    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int[] coins = new int[n];
		    for(int j =0;j<n;j++){
		        coins[j]=sc.nextInt();
		    }
		    //int first = 0;
		    int last = coins.length;
		    int max = getmax(coins, last);
		    System.out.println(max);
		}
	}
}