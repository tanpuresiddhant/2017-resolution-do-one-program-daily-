import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {
    /*
    public static int countNumberOfPathsR(int steps){
     if(steps<0){
         return 0;
     }else if(steps<=1){
         return 1;
     }   
        return countNumberOfPathsR(steps-1) + countNumberOfPathsR(steps-2) + countNumberOfPathsR(steps-3);
    }
     */
    public static int countNumberOfPathsI(int steps){
     if(steps<0){
         return 0;
     }else if(steps<=1){
         return 1;
     }   
        int[] memo =new int[3]; 
        memo[0]=1;
        memo[1]=1;
        memo[2]=2;
        int paths=0;
        int stepsCount = 0;
         for(int i=3;i<steps+1;i++){
             paths = memo[0]+memo[1]+memo[2];
             if(stepsCount>2){
                 stepsCount =0;
                 memo[stepsCount] = paths;
             }else{
                  memo[stepsCount] = paths;
             }
             stepsCount++;
         }
        return paths;
    } 
    /*
    public static int countNumberOfPathsDP(int steps){
     if(steps<0){
         return 0;
     }else if(steps<=1){
         return 1;
     }   
        int[] paths = new int[steps+1]; 
        paths[0]=1;
        paths[1]=1;
        paths[2]=2;
       
         for(int i=3;i<steps+1;i++){
             paths[i]=paths[i-1]+paths[i-2]+paths[i-3];
         }
        return paths[steps];
    }
    
    public static int countNumberOfPathsMemo(int steps, int[] memo){
     if(steps<0){
         return 0;
     }else if(steps==0){
         return 1;
     } 
     if(memo[steps]==0){
         memo[steps]=countNumberOfPathsMemo(steps-1,memo)+countNumberOfPathsMemo(steps-2,memo)+countNumberOfPathsMemo(steps-3,memo);
     }
        return memo[steps];
    }
    */
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
           // int paths = countNumberOfPathsR(n); // using recursion
            //int[] memo = new int[n+1]; // using memorization
           // int paths = countNumberOfPathsMemo(n, memo); // using memorization
           // int paths = countNumberOfPathsDP(n); // using dynamic programming
              int paths = countNumberOfPathsI(n); // using Iterative 
            System.out.println(paths);
        }
    }
}
