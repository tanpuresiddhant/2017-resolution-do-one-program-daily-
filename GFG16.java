/* Siddhant Tanpure
* Number to words
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=669
* 1/30/2017
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG16 {
    private static String one[] = {"","one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
    private static String ten[] = {"","", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
    public static String getTheword(int n, String s){
        String temp="";
        if(n>19){
            temp += ten[n/10] + one[n%10];
        }else{
            temp += one[n];
        }
        if(n>0){
            temp += s;
        }
        return temp;
    }
    public static void numberToWord(long n){
        String result = "";
        result += getTheword((int)(n/10000000), "Crore ");
        
        result += getTheword((int)(n/100000)%100, "lakh ");
        
        result += getTheword((int)(n/1000)%100, "thousand ");
        
        result += getTheword((int)(n/100)%10, "hundred ");
        
        if(n>100 && n%100>0){
            result += "and ";
        }
        result += getTheword((int)(n%100), "");
        System.out.println(result);
        return;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
		    long n = sc.nextLong();
		    numberToWord(n);
		}
	}
}
