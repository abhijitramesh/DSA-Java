public class GraphNodeDriver {

    public static void main(String args[]){
        GraphNode n0 = new GraphNode(0);
        GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);

        n0.adjlist.add(n1);
        n0.adjlist.add(n2);
        n1.adjlist.add(n3);
        n2.adjlist.add(n2);


    }
}
