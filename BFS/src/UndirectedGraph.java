interface UndirectedGraph<Vertex> {
    /** How many edges? */
    public int numEdges();

    /** How many vertices? */
    public int numVertices();

    /** Add a new vertex */
    public void addVertex(Vertex v);

    /** Add an edge */
    public void addEdge(Vertex u, Vertex v);

    /** Remove an edge */
    public void removeEdge(Vertex u, Vertex v);

    /** Return an iterable of vertices adjacent to v */
    public Iterable<Vertex> adj(Vertex v);

    /** Return the degree of v (the number of adjacent vtxes to v) */
    public int deg(Vertex v);

    /** Is there an edge between u and v? */
    public boolean isEdge(Vertex u, Vertex v);
}