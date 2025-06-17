import java.util.List;
import java.util.ArrayList;

public class Graph{
    private int vertices;
    private int[][] adjacencyMatrix;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices){
        this.vertices=vertices;
        adjacencyMatrix=new int[vertices][vertices];
        adjacencyList=new ArrayList<>(vertices);
        for(int i=0;i<vertices;i++){
            adjacencyList.add(new ArrayList<>());
        }
    }    

    public void addEdge(int src,int dst){
        
        adjacencyMatrix[src][dst]=1;
        adjacencyMatrix[dst][src]=1;

        adjacencyList.get(src).add(dst);
        adjacencyList.get(dst).add(src);
    }   

    public void printAdjacencyMatrix(){
        System.out.println("Adjacency Matrix is:");
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void printAdjacencyList(){
        System.out.println("Adjacency List is:");
        for(int i=0;i<vertices;i++){
            System.out.print(i +": ");
            for(int j:adjacencyList.get(i)){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        
        graph.printAdjacencyMatrix();
        graph.printAdjacencyList();
        
    }
}