import java.util.*;
public class Classroom17{
    static class Edge{
        int src;
        int dest;
        

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
            
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
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));



    }
    public static void printAllPath(ArrayList<Edge> graph[],boolean vis[],int curr,String Path,int tar){
        if(curr==tar){
            System.out.println(Path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]=true;
                printAllPath(graph,vis,e.dest,Path+e.dest,tar);
                vis[curr]=false;
            }
        }
    }



    public static void main(String args[]){
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
         //print 2's neighbours
        for(int i=0;i<graph[2].size();i++){
          Edge e=graph[2].get(i);
          System.out.print(e.dest+" ");
          int src=0,tar=5;
          printAllPath(graph,new boolean[V],src,0,tar);
        }
    }
}
