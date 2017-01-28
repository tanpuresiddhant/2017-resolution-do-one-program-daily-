/* Siddhant Tanpure
* Number of 1's in smallest repunits
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=863
* 1/27/2017
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void findNumberOfOnesInRepunit(long n){
        long result = 10;
        int count =0;
        while(result!=1){
            result = (result*10) % n;
            //System.out.println(result);
            count++;
        }
        System.out.println(count+1);
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    long k = 9*n;
		    findNumberOfOnesInRepunit(k);
		}
	}
}
