/* Siddhant Tanpure
* Check if a number can be expressed as x^y
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=1600
* 1/25/2017
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int checkxpowy(int n){
        if (n==1) return 1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                for(int j=1;j>0;j++){
                    if(Math.pow(i,j)==n){
                        return 1;
                    }else if(Math.pow(i,j)>n){
                        break;
                    }
                }
            }
        }
        return 0;
    }
	public static void main (String[] args) {
		//code
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int temp = checkxpowy(n);
		    System.out.println(temp);
		}
	}
}
