/*
* Siddhant Tanpure
* Check if given four points form a square
* http://www.practice.geeksforgeeks.org/problem-page.php?pid=907
* 1/29/2017
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG15 {
    private static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    
    public static void checkIfSquareOrNot(Point[] p){
        double[] dist = new double[3];
        boolean flag=false;
        Point p1 = p[0];
        for(int i = 1;i<4;i++){
            int result = (int)Math.pow(p1.x-p[i].x,2) + (int) Math.pow(p1.y-p[i].y,2);
            dist[i-1] = Math.sqrt(result);
        }
        
        if(dist[0]==dist[1]){
            int third = (int) Math.pow(dist[0],2) + (int) Math.pow(dist[1],2);
            if(Math.sqrt(third)==dist[2]){
                flag=true;
            }
        }
        if(dist[1]==dist[2]){
            if(flag==false){
                int third = (int) Math.pow(dist[1],2) + (int) Math.pow(dist[2],2);
                if(Math.sqrt(third)==dist[0]){
                    flag=true;
                }
            }
        }
        if(dist[0]==dist[2]){
            if(flag==false){
                int third = (int) Math.pow(dist[0],2) + (int) Math.pow(dist[2],2);
                if(Math.sqrt(third)==dist[1]){
                    flag=true;
                }
            }
        }
        if(flag){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		//code
		int t =sc.nextInt();
		Point[] p = new Point[4]; 
		for(int i=0;i<t;i++){
		    for(int j=0;j<4;j++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    p[j] = new Point(x,y);
		    }
		    checkIfSquareOrNot(p);
		}
	}
}
