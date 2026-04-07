import java.util.*;
public class Classroom24{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
        public Edge(){

        }
        public int getSrc(){
            return src;

        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,2,6));
        graph[1].add(new Edge(1,3,2));
        graph[2].add(new Edge(2,0,3));
        graph[2].add(new Edge(2,1,8));
        graph[2].add(new Edge(2,3,1));
        graph[3].add(new Edge(3,1,2));
        graph[3].add(new Edge(3,2,9));



    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        public Pair(int n,int c){
            this.node=n;
            this.cost=c;
        }
         @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void primsAlgo(ArrayList<Edge> graph[],int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[V];
        pq.add(new Pair(0,0));
        int mstCost=0;
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            
            if(!vis[curr.node]){
                vis[curr.node]=true;
                mstCost+=curr.cost;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest,e.wt));
                    }
                }
            }
        }
        System.out.println("min cost of mst= "+mstCost);
    }



    public static void main(String args[]){
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
       primsAlgo(graph,V);
    }
}
