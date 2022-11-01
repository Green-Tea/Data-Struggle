import java.util.*;

public class BFG{
    static class UndirectedAdjMap<Vertex> implements UndirectedGraph<Vertex> {
        private Map<Vertex, Set<Vertex>> graph;
        public UndirectedAdjMap() {
            this.graph = new HashMap<>();
        }

        @Override
        public int numEdges() {
            int count = 0;
            for (Vertex v : graph.keySet()) count += deg(v);
            return count / 2;
        }

        @Override
        public int numVertices() {
            return graph.size();
        }

        @Override
        public void addVertex(Vertex v) {
            if (!graph.containsKey(v)) {graph.put(v, new HashSet<>());}
        }

        @Override
        public void addEdge(Vertex u, Vertex v) {
            addVertex(u);
            addVertex(v);
            // include u to the set of v
            graph.get(u).add(v);
            // include v to the set of u
            graph.get(v).add(u);
        }

        @Override
        public void removeEdge(Vertex u, Vertex v) {
            graph.get(u).remove(v);
            graph.get(v).remove(u);
        }

        @Override
        public Iterable<Vertex> adj(Vertex v) {
            return graph.get(v);
        }

        @Override
        public int deg(Vertex v) {
            if (graph.containsKey(v)) return graph.get(v).size();
            return 0;
        }

        @Override
        public boolean isEdge(Vertex u, Vertex v) {
            return graph.get(v).contains(u);
        }
    }
    static Map<Integer, Integer> nbrs(UndirectedGraph<Integer> G, Set<Integer> vtxes) {
        Map<Integer, Integer> union = new HashMap<>();
        for (Integer src : vtxes) {
            for (Object dst : G.adj(src))
                union.put((Integer) dst, src);
        }
        return union;
    }

    static Map<Integer, Integer> bfs(UndirectedGraph<Integer> G, int s) {
        // What can be reached 0 hops away? only s itself
        Map<Integer, Integer> queue = new HashMap<>();
        Map<Integer, Integer> visited = new HashMap<>();
        queue.put(s, null); visited.put(s, null);
        while (!queue.isEmpty()) {
            queue = nbrs(G, queue.keySet());
        // remove all that have been visited
            queue.keySet().removeAll(visited.keySet());
            visited.putAll(queue);
        }
        return visited;
    }

    static void findShortest(UndirectedGraph<Integer> G, Integer a, Integer b) {
        Map<Integer, Integer> visited = bfs(G, a);
        // this is so confusing
    }
}