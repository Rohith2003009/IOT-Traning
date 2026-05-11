import java.util.ArrayList;


public class Graph_1_AL {
    static class Edge{
        int Source;
        int Dest;
        public Edge(int s, int d){
            this.Source = s;
            this.Dest = d;
        }
    }

    public static void createGraph(ArrayListr<Edge> graph){
        for(int i=0; i<5; i++){
            graph.add(new ArrayList<Edge>());
        }

        graph.get(0).add(new Edge(0, 1));
        graph.get(0).add(new Edge(0, 2));

        graph.get(1).add(new Edge(1, 0));
        graph.get(1).add(new Edge(1, 3));

        graph.get(2).add(new Edge(2, 0));
        graph.get(2).add(new Edge(2, 4));

        graph.get(3).add(new Edge(3, 1));
        graph.get(3).add(new Edge(3, 4));

        graph.get(4).add(new Edge(4, 2));
        graph.get(4).add(new Edge(4, 3));
    }
    public static void main(){
        int v = 5;
    }
}
