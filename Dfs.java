
import java.util.*;

public class Dfs{
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for (int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,3);
        addEdge(graph,1,4);

        boolean[] visited= new boolean[n];
        Dfs(0,graph,visited);
    }
    static void Dfs(int node,ArrayList<ArrayList<Integer>>graph,boolean[]visited)
{
    visited[node]=true;
    System.out.print(node+" ");
    for(int neighbour:graph.get(node)){
        if(!visited[neighbour]){
            Dfs(neighbour,graph,visited);
        }
    }
}
    

static void addEdge(ArrayList<ArrayList<Integer>> graph,int u,int v)
{
      graph.get(u).add(v);
      graph.get(v).add(u);
    }
}


