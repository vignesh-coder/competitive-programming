//dijkstra shortest path implementation
//priority queue class: https://github.com/vignesh-coder/competitive-programming/blob/master/PriorityQueue.java

import java.util.*;
class Dijkstra{
    
    static class Pair<T extends Comparable<T>,E> implements Comparable<Pair<T,E>>{
        T first;
        E second;
        Pair(T first,E second){
            this.first=first;
            this.second=second;
        }
        @Override
        public int compareTo(Pair<T,E> o) {
            return first.compareTo(o.first)*-1;
        }
        @Override
        public String toString(){
            return "{ "+first+" , "+second+" }";
        }
    }
   
    static int shortestPath(List<Pair<Integer,Integer>> adj[],int s,int d){

    	int dist[] =  new int[adj.length];
    	for(int i=1;i<adj.length;i++)
    		dist[i]=Integer.MAX_VALUE;
    	dist[s]=0;
    	boolean visited[] = new boolean[adj.length];
    	PriorityQueue<Pair<Integer,Integer>> queue = new PriorityQueue<>();
    	queue.push(new Pair<>(0,s));

    	while(!queue.isEmpty()){

    		int x = queue.pop().second;
    		
    		if(visited[x])
    			continue;

    		visited[x]=true;
    		
    		for(Pair<Integer,Integer> p : adj[x]){

    			int e = p.second;
    			int w = p.first;

    			if(!visited[e]){
    				
    				int prev = dist[e];
    				dist[e] = Math.min(prev,dist[x]+w);

    				if(dist[e]!=prev)
    					queue.push(p);
    			}
    		}
    	}
    	return dist[d];
    }
    
    public static void main(String...args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        List<Pair<Integer,Integer>> adj[] = new List[n+1];
        for(int i = 1;i<=n;i++)
            adj[i] = new LinkedList<>();
        for(int i=0;i<m;i++){
            int u = in.nextInt();
            int v = in.nextInt();
            int w = in.nextInt();
            
            adj[u].add(new Pair<>(w,v));
            adj[v].add(new Pair<>(w,u));
        }
        int s = in.nextInt();
        int d = in.nextInt();
        int minCost = shortestPath(adj,s,d);
        System.out.println(minCost);
    }   
}
