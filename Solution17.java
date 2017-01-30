/* Siddhant Tanpure
* Compare the Triplets
* https://www.hackerrank.com/challenges/compare-the-triplets
* 1/30/2017
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution17 {
    public static void compareTheTriplets(int a0,int a1,int a2,int b0,int b1,int b2){
        int al=0, bob=0;
        if (a0>b0){
            al = al+1;
       }else if(a0<b0){
            bob=bob+1;
        }
        if (a1>b1){
            al = al+1;
        }else if(a1<b1){
            bob=bob+1;
        }
        if (a2>b2){
            al = al+1;
        }else if(a2<b2){
            bob=bob+1;
        }
        System.out.println(al + " " + bob);
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        compareTheTriplets(a0,a1,a2,b0,b1,b2);
    }
}
