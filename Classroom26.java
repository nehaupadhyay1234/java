import java.util.*;
public class Classroom26{
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
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[],int dt[],int low[],int time[],int par){
        vis[curr]=true;
        dt[curr]=low[curr] = ++time;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(e.dest==par){
                continue;

            }else if(!vis[e.dest]){
                dfs(graph,e.dest,vis,dt,low,time,curr);
                low[curr]=Math.min(low[curr],low[e.dest]);
                if(dt[curr]<low[e.dest]){
                    System.out.println("Bridge is:"+curr+"_"+e.dest);
                }
            }else{
                low[curr]=Math.min(low[curr],dt[e.dest]);
            }
        }
    }












    public static void getBridge(ArrayList<Edge> graph[],int V){
        int dt[]=new int[V];
        int low[]=new int[V];
        int time=0;
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(graph,i,vis,dt,low,time,-1);

            }

        }
    }
    
    
    





    public static void main(String args[]){
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getBridge(graph,V);

    }
}
