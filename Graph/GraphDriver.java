public class GraphDriver {
public static void main(String args[]){
    Graph g = new Graph(5);

    g.addEdge(0,4);
    g.addEdge(1,4);
    g.addEdge(4,1);
    g.addEdge(2,4);
    g.addEdge(3,4);
    g.addEdge(4,4);


    g.print();
    g.bfs();

}
}
