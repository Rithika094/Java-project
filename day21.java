
import java.util.ArrayList;

public class day21{
    public static void main(String[] args) {
        int vertices=5;
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
        addEdge(graph,0,1);
        addEdge(graph,1,2);
        addEdge(graph,2,3);
        addEdge(graph,3,4);
        for(int i=0;i<vertices;i++){
            System.out.println(i+ " -> " + graph.get(i));
        }
    }
    static void addEdge(ArrayList<ArrayList<Integer>>graph,int u,int v){
        graph.get(u).add(u);
        graph.get(v).add(v);
    }
}