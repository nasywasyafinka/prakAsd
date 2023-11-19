package prak1;
import java.util.ArrayList;

public class Graph<T> {
    private ArrayList<T>[] list;
    private int vertex;
    private boolean isDirected;

    public Graph(int vertex, boolean isDirected) {
        this.vertex = vertex;
        this.isDirected = isDirected;
        list = new ArrayList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new ArrayList<>();
        }
    }

    public void addEdge(T source, T destination) {
        if (isDirected) {
            list[hash(source)].add(destination);
        } else {
            list[hash(destination)].add(source);
        }
    }

    public void degree(T source) throws Exception {
        if (!isDirected) {
            System.out.println("Degree vertex " + source + " : " + list[hash(source)].size());
        } else {
            int totalIn = 0;
            for (int i = 0; i < vertex; i++) {
                for (T vertexValue : list[i]) {
                    if (vertexValue.equals(source)) {
                        ++totalIn;
                    }
                }
            }

            int totalOut = list[hash(source)].size();

            System.out.println("InDegree dari vertex " + source + " : " + totalIn);
            System.out.println("OutDegree dari vertex " + source + " : " + totalOut);
            System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
        }
    }

    public void removeEdge(T source, T destination) throws Exception {
        list[hash(source)].remove(destination);
        System.out.println("Edge removed: (" + source + " -> " + destination + ")");
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (!list[i].isEmpty()) {
                System.out.println("Vertex " + list[i].get(0) + " terhubung dengan: " + list[i].toString());
            }
        }
        System.out.println();
    }

    private int hash(T key) {
        return Math.abs(key.hashCode()) % vertex;
    }
}
