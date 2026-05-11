import java.util.*;

class GraphCycleDirected {
    int V;
    LinkedList<Integer> adjListArray[];

    GraphCycleDirected(int v) {
        this.V = v;
        adjListArray = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjListArray[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int v, int w) {
        adjListArray[v].add(w);
    }
     
    boolean dfs(int node, boolean visited[], boolean recStack[]) {
        if (recStack[node]) {
            return true;
        }
        if (visited[node]) {
            return false;
        }
        visited[node] = true;
        recStack[node] = true;
        List<Integer> children = adjListArray[node];
        for (Integer c : children) {
            if (dfs(c, visited, recStack)) {
                return true;
            }
        }
        recStack[node] = false;
        return false;
    }
    public class GraphCycleDetection {
        public static void main(String args[]) {
            GraphCycleDirected graph = new GraphCycleDirected(4);
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 2);
            graph.addEdge(2, 0);
            graph.addEdge(2, 3);
            graph.addEdge(3, 3);

            boolean visited[] = new boolean[graph.V];
            boolean recStack[] = new boolean[graph.V];
            for (int i = 0; i < graph.V; i++) {
                if (graph.dfs(i, visited, recStack)) {
                    System.out.println("Graph contains cycle");
                    return;
                }
            }
            System.out.println("Graph does not contain cycle");
        }
    }
}