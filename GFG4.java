/* Siddhant Tanpure
* Longest Prefix Suffix
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=1285
* Date: 01/11/2017
*/
// start from the mid of the array and compare it with beginning of the array to detect prefix or suffix
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG4 {
    public static int getMaxPrefixSuffix(char[] temp){
        int i =0,j=0;
        int len=0;
        if((temp.length)%2==0){
            j = (temp.length)/2;
        }else{
            j = (temp.length+1)/2;
        }
        while(j<temp.length){
            if(temp[j]==temp[i]){
                j++;
                i++;
                len =len+1;
            }else{
                i=0;
                len=0;
                if(temp[j]==temp[i]){
                    len =len+1;
                    i++;
                }
                j++;
            }
            
        }
        return len;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++){
		    String s = sc.nextLine();
		    char[] temp = s.toCharArray();
		    int len = getMaxPrefixSuffix(temp);
		  System.out.println(len);
		    
		}
		  
	}
}
