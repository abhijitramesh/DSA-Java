import java.lang.management.GarbageCollectorMXBean;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphNode {
    int label;
    ArrayList<GraphNode> adjlist;
    LinkedList<GraphNode> queue;
    boolean visited;

    GraphNode(int l){
        label =l;
        adjlist = new ArrayList<GraphNode>();
        queue = new LinkedList<GraphNode>();
        visited = false;
    }
    public void print(){
        for(int i=0;i<adjlist.size();i++){
            System.out.print(adjlist.get(i).label + "->");
        }
    }
    public void dfs(){
        System.out.println(label+ "");
        visited = true;

        for (int i=0;i<adjlist.size();i++){
            if (!adjlist.get(i).visited){
                adjlist.get(i).dfs();
            }
        }
    }
    public void bfs(Queue<GraphNode> queue){
        System.out.print(label+ " ");
        visited = true;
        for(int j=0;j<adjlist.size();j++){
            queue.add(adjlist.get(j));
        }
        GraphNode t = queue.poll();
        if(t!=null&&!t.visited) {
            t.bfs(queue);
        }
    }

}
