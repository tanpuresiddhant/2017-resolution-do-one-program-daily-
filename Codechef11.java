import java.util.*;

public class Codechef11{
     
     public static void dijikstrasAlgo(int[][] graph, int src, int dest){
         int[] distance =new int[6];
         for(int i=0;i<6;i++){
             distance[i]=Integer.MAX_VALUE;
         }
         distance[src]=0;
         
         Queue<Integer> q1 =  new LinkedList<Integer>();
         q1.add(src);
         while(!q1.isEmpty()){
             int v = q1.remove();
             for(int i=0;i<6;i++){
                 if(graph[i][v]!=0){
                    int alt = distance[v]+graph[i][v];
                        if(alt<distance[i]){
                            distance[i]=alt;
                            System.out.println("distance from " + v +" to "+ i + " = " + alt );
                            q1.add(i);
                        }
                 }
             }
         }
         for(int i =0;i<6;i++){
             System.out.println(distance[i]);
         }
     }
        
     public static void main(String []args){
       int[][] graph = {{0,3,4,2,0,0},
		                 {3,0,0,3,0,2},
		                 {4,0,0,1,3,0},
		                 {2,3,1,0,6,3},
		                 {0,0,3,6,0,0},
		                 {0,2,0,3,0,0}};
		
		for(int i=0;i<6;i++){
		    for(int j=0;j<6;j++){
		        System.out.print(graph[i][j]+" ");
		    }
		    System.out.println();
		}
		dijikstrasAlgo(graph,0,5);
     }
}
