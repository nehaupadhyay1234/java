import java.util.*;
public class Classroom22{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
        public Edge(){

        }
        public int getSrc(){
            return src;

        }
        public int getwt(){
            return wt;
        }
    }
    public static class Pair implements Compparable<Pair> {
        int node;
        int dist;
    
    public Pair(int n,int d){
        this.node=n;
        this.dist=d;
    }
    @override
    public int CompareTo(Pair P2){
        return this.dist-P2.dist;
    }
    }
    public static  void dijkstra(ArrayList<Edge> graph[],int src,int V){
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    int dist[]=new int[V];
    for(int i=0;i<V;i++){
        if(i!=src){
            dist[i]=Integer.MAX_VALUE;
        }
    }
    boolean vis[]=new boolean[V];
    pq.add(new Pair(n:0,d:0));
    while(!pq.isEmmpty()){
        Pair curr=pq.remove();
        if(!vis[curr.node]){
            is[curr.node]=true;
            for(int i=0;i<graph[curr.node].size();i++){
                Edge e=graph[curr.node].get(i);
                int u=e.src;
                int v=e.dest;
                if(dist[u]+e.wt<dist[V]){
                    dist[V]=dist[u]+e.wt;
                    pq.add(new Pair(V,dist[V]));
                }
            }
        }
    }
    for(int i=0;i<V;i++){
        System.out.print(dist[i]+" ");
    }
    System.out.println();
    }

















    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(s:0,d:1,w:2));
        graph[1].add(new Edge(s:1,d:2,w:4));
        graph[1].add(new Edge(s:1,d:3,w:7));
        graph[2].add(new Edge(s:1,d:2,w:1)));
        graph[2].add(new Edge(s:2,d:4,w:3));
        graph[2].add(new Edge(s:3,d:5,w:1));
        graph[3].add(new Edge(s:4,d:3,w:2));
        graph[4].add(new Edge(s:4,d:5,w:5));



    }



    public static void main(String args[]){
        int V=6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
         
          dijkstra(graph,src:0,V);
        
    }
}
