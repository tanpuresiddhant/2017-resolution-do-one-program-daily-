/* Siddhant Tanpure 
* Minimize string value
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=1304
* Date: 1/11/2017
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG3 {
    public static void PrintValue(char[] s, int n){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
        for(int i =0;i<s.length;i++){
            if(map.containsKey(s[i])){
                map.put(s[i],map.get(s[i])+1 );
            }else{
                map.put(s[i],1);
            }
            
        }
        int[] temp = new int[map.size()];
        int j =0;
        int sumOfArry=0;
        for(int i: map.values()){
            sumOfArry = sumOfArry + i;
            temp[j]=i;
            j++;
        }
        if(sumOfArry>n){
            while(n>0){
                int max=Integer.MIN_VALUE;
                int index=0;
            for(j=0;j<temp.length;j++){
                if(temp[j]>max){
                    index = j;
                    max = temp[j];
                }
            }
            temp[index]=temp[index]-1;
            n = n-1;
            }
            int sum =0;
            for(j=0;j<temp.length;j++){
               sum =  sum + (int) Math.pow(temp[j],2);  
            }
            System.out.println(sum);
        }
        else{
        System.out.println(0);
        }
        
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++){
		    sc.nextLine();
		    String temp = sc.nextLine();
		    int n = sc.nextInt();
		    char[] s = temp.toCharArray();
		    PrintValue(s, n);
		}
	}
}
