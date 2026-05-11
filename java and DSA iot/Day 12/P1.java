import java.util.*;
class Dijkstra_Algorithm {
    static class Pair {
        int node, distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static void dijkstra(int V, ArrayList<ArrayList<Pair>> adj, int S) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        pq.offer(new Pair(S, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;
            int distance = current.distance;

            if (distance > dist[node]) continue;

            for (Pair neighbor : adj.get(node)) {
                int newDist = distance + neighbor.distance;
                if (newDist < dist[neighbor.node]) {
                    dist[neighbor.node] = newDist;
                    pq.offer(new Pair(neighbor.node, newDist));
                }
            }
        }

        // Print the shortest distances from the source
        for (int i = 0; i < V; i++) {
            System.out.println("Distance from source " + S + " to node " + i + " is: " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges to the graph (node, distance)
        adj.get(0).add(new Pair(1, 10));
        adj.get(0).add(new Pair(2, 5));
        adj.get(1).add(new Pair(2, 2));
        adj.get(1).add(new Pair(3, 1));
        adj.get(2).add(new Pair(1, 3));
        adj.get(2).add(new Pair(3, 9));
        adj.get(2).add(new Pair(4, 2));
        adj.get(3).add(new Pair(4, 4));

        int source = 0; // Starting node
        dijkstra(V, adj, source);
    }
}