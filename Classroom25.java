import java.util.*;
public class Classroom25{
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
    
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void kosarajuAlgo(ArrayList<Edge> graph[],int V){
        //step1
        Stack<Integer> s=new Stack<>();
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSort(graph,i,vis,s);
            }
        }
        //step2
        ArrayList<Edge> transpose[]=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            vis[i]=false;
            transpose[i]=new ArrayList<Edge>();
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src,e.wt));
            }
        }
        //step3
        while(!s.isEmpty()){
            int curr=s.pop();
            if(!vis[curr]){
                dfs(graph,curr,vis);
            }

                
            System.out.println();
            
        }

    }





    public static void main(String args[]){
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosarajuAlgo(graph,V);

    }
}
