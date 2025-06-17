import java.util.List;
import java.util.ArrayList;

public class DFS{
    private int vertices;
    private int[][] adjacencyMatrix;
    private List<List<Integer>> adjacencyList;

    public DFS(int vertices){
        this.vertices=vertices;
        adjacencyMatrix=new int[vertices][vertices];
        adjacencyList=new ArrayList<>(vertices);
        for(int i=0;i<vertices;i++){
            adjacencyList.add(new ArrayList<>());
        }
    }    

    public void addEdge(int src,int dst){
        
        adjacencyList.get(src).add(dst);
        adjacencyList.get(dst).add(src);
    }   
    private void dfsUtil(int vertex,boolean[] visited){
        visited[vertex]=true;
        System.out.println(vertex +" ");
        for(int adj:adjacencyList.get(vertex)){
            if(!visited[adj]){
                dfsUtil(adj,visited);
            }
        }
    }
       public void dfs(int startVertex) {
       boolean[] visited = new boolean[vertices];
       System.out.print("DFS traversal starting from vertex " + startVertex + ": ");
       dfsUtil(startVertex, visited);
       System.out.println();
   }
   

   
    public static void main(String[] args){
        
        DFS graph = new DFS(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.dfs(0);
        
        
        
        
    }
}