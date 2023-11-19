package prak1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        /*
         * Graph graph = new Graph(6);
         * graph.addEdge(0, 1);
         * graph.addEdge(0, 4);
         * graph.addEdge(1, 2);
         * graph.addEdge(1, 3);
         * graph.addEdge(1, 4);
         * graph.addEdge(2, 3);
         * graph.addEdge(3, 4);
         * graph.addEdge(3, 0);
         * graph.printGraph();
         * graph.degree(2);
         * graph.removeEdge(1, 3);
         * graph.printGraph();
         * 
         * 
         * // Tugas nomer 1
         * Scanner sc = new Scanner(System.in);
         * 
         * Graph graph = new Graph(6);
         * 
         * System.out.println("Masukkan lintasan: ");
         * String lintasanInput = sc.nextLine();
         * String[] lintasanArray = lintasanInput.split(" ");
         * 
         * for (String lintasan : lintasanArray) {
         * String[] vertices = lintasan.split(",");
         * int source = Integer.parseInt(vertices[0].trim());
         * int destination = Integer.parseInt(vertices[1].trim());
         * graph.addEdge(source, destination);
         * }
         * 
         * System.out.println("Graf setelah dimasukkan lintasan:");
         * graph.printGraph();
         * 
         * graph.degree(2);
         * 
         * try {
         * System.out.println("Menghapus lintasan antara vertex 1 dan 3");
         * graph.removeEdge(1, 3);
         * System.out.println("Graf setelah lintasan dihapus:");
         * graph.printGraph();
         * graph.addEdge(1, 3);
         * } catch (Exception e) {
         * System.out.println("Exception caught: " + e.getMessage());
         * }
         * 
         * 
         * // Tugas nomer 3
         * int v, e, count = 1, to = 0, from = 0;
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Masukkan Jumlah Vertices: ");
         * v = sc.nextInt();
         * System.out.
         * print("Masukkan Jenis Graph (True untuk directed, False untuk undirected): "
         * );
         * boolean isDirected = sc.nextBoolean();
         * 
         * System.out.println("Masukkan: <source> <destination>");
         * Graph graph = new Graph(v, isDirected);
         * while (count <= v) {
         * to = sc.nextInt();
         * from = sc.nextInt();
         * 
         * graph.addEdge(to, from);
         * count++;
         * }
         * graph.printGraph();
         * graph.degree(2);
         * if (graph.containsEdge(1, 2)) {
         * graph.removeEdge(1, 2);
         * } else {
         * System.out.println("Edge tidak ditemukan: (1 -> 2)");
         * }
         * graph.removeEdge(1, 2);
         * graph.printGraph();
         */

        Scanner sc = new Scanner(System.in); // Declare Scanner

        // Tugas nomer 4
        System.out.print("Masukkan Jumlah Vertices: ");
        int v = sc.nextInt();
        System.out.print("Masukkan Jenis Graph (True untuk directed, False untuk undirected): ");
        boolean isDirected = sc.nextBoolean();

        System.out.println("Masukkan: <source> <destination>");
        Graph<String> graph = new Graph<>(v, isDirected);

        for (int count = 1; count <= v; count++) {
            String to = sc.next();
            String from = sc.next();

            graph.addEdge(to, from);
        }

        graph.printGraph();
        graph.degree("Surabaya");
        graph.removeEdge("Malang", "Surabaya");
        graph.printGraph();
    }
}

