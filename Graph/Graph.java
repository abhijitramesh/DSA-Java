import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    GraphNode[] node;
    int size;

    /**
     * @param n used for defining the size of the graph
     */
    Graph(int n) {
        size = n;
        node = new GraphNode[n];
        for (int i = 0; i < n; i++) {
            node[i] = new GraphNode(i);
        }// Used for indexing the Graph Nodes

    }

    public void addEdge(int from, int to) {
        node[from].adjlist.add(node[to]);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + ":");
            node[i].print();
            System.out.println();
        }
    }

    public void dfs() {
        for (int i = 0; i < size; i++) {
            if (!node[i].visited)
                node[i].dfs();
        }
    }
    public void bfs() {
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        for (int i = 0; i < size; i++) {
            if (!node[i].visited)
                node[i].bfs(queue);
        }
    }
}



