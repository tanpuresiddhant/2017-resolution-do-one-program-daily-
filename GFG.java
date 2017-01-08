/*
* Siddhant Tanpure
* Date: 01/08/2017
* Problem: http://www.practice.geeksforgeeks.org/problem-page.php?pid=871
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<t;i++){
		    
		    String temp = sc.nextLine();
		    //System.out.println(temp);
		    char[] s = temp.toCharArray();
		    for(int j =0;j<s.length;j++){
		       // System.out.println(s[j]);
		        if(s[j]=='a'||s[j]=='b'||s[j]=='c'){
		            System.out.print(2);
		        }else if(s[j]=='d'||s[j]=='e'||s[j]=='f'){
		            System.out.print(3);
		        }else if(s[j]=='g'||s[j]=='h'||s[j]=='i'){
		            System.out.print(4);
		        }else if(s[j]=='j'||s[j]=='k'||s[j]=='l'){
		            System.out.print(5);
		        }else if(s[j]=='m'||s[j]=='n'||s[j]=='o'){
		            System.out.print(6);
		        }else if(s[j]=='p'||s[j]=='q'||s[j]=='r'||s[j]=='s'){
		            System.out.print(7);
		        }else if(s[j]=='t'||s[j]=='u'||s[j]=='v'){
		            System.out.print(8);
		        }else if(s[j]=='w'||s[j]=='x'||s[j]=='y'||s[j]=='z'){
		            System.out.print(9);
		        }
		    }
		    System.out.println();
		}
	}
}