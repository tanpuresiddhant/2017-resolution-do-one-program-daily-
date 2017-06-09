import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void addNumberToHeap(int num, PriorityQueue<Integer> lower, PriorityQueue<Integer> higher){
        if(lower.size()==0 || num<lower.peek()){
            lower.add(num);
        }else{
            higher.add(num);
        }
    }
    
    public static void rebalanceHeap(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher){
        PriorityQueue<Integer> biggerHeap = lower.size() > higher.size() ? lower : higher;
        PriorityQueue<Integer> smallerHeap = lower.size() > higher.size() ? higher : lower;
        if(biggerHeap.size() - smallerHeap.size() >= 2){
            smallerHeap.add(biggerHeap.poll());
        }
    }
    
    public static double getMedian(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher){
        PriorityQueue<Integer> biggerHeap = lower.size() > higher.size() ? lower : higher;
        PriorityQueue<Integer> smallerHeap = lower.size() > higher.size() ? higher : lower;
        if(biggerHeap.size() == smallerHeap.size()){
            return ((double)biggerHeap.peek() + smallerHeap.peek())/2;
        }else{
            return biggerHeap.peek();
        }
    }
    
    public static void printAllRunningArrayMedian(int[] arr){
        PriorityQueue<Integer> lower = new PriorityQueue<Integer>(new Comparator<Integer>(){
           public int compare(Integer a, Integer b){
               return -1 * a.compareTo(b);
           } 
        });    
        PriorityQueue<Integer> higher = new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            addNumberToHeap(arr[i], lower, higher);
            rebalanceHeap(lower, higher);
            double median = getMedian(lower, higher);
            System.out.println(median);
        }
        
    } 
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printAllRunningArrayMedian(arr);
    }
}
