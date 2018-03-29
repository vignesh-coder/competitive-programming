/*
Note : Prim's Minimum Spanning tree algorithm uses 'PriorityQueue' which is also available in this repo.
*/
class PrimAlgo{
    
    static class Pair<T extends Comparable<T>,E> implements Comparable<Pair<T,E>>{
        T first;
        E second;
        Pair(T first,E second){
            this.first=first;
            this.second=second;
        }
        @Override
        public int compareTo(Pair<T,E> o) {
            return first.compareTo(o.first)*-1; // for maximum spanning tree use 'return first.compareTo(o.first);'
        }
        @Override
        public String toString(){
            return "{ "+first+" , "+second+" }";
        }
    }
    
    static int prim(List<Pair<Integer,Integer>> adj[]){
    
        PriorityQueue<Pair<Integer,Integer>> queue = new PriorityQueue<>();
        boolean visited[] = new boolean[adj.length];
        
        queue.push(new Pair<>(0,1));
        int minCost = 0;

        while(!queue.isEmpty()){
            Pair<Integer,Integer> top = queue.pop();
            
            int w = top.first;
            int x = top.second;
            
            if(visited[x]) 
                continue;
            minCost += w;
            visited[x] = true;
            
            for(Pair<Integer,Integer> p : adj[x]){
                if(!visited[p.second])
                    queue.push(p);
            }
        }

        return minCost;
    }
    
    public static void main(String...args){
        
        
        Integer ii = 5;
        Integer j = 6;
        System.out.println(ii.compareTo(j));
        
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
        int minCost = prim(adj);
        System.out.println(minCost);
    }   
}
