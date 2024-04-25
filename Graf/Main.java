public class Main {
    public static void main(String[] args) {
        AdjacencyMatrix myMatrix = new AdjacencyMatrix(9);
        myMatrix.addEdge(0, 3);
        myMatrix.addEdge(0, 1);
        myMatrix.addEdge(0, 4);
        myMatrix.addEdge(1, 4);


        myMatrix.printMatrix();
        
        // Menampilkan incoming edges dan outgoing edges dari node 3
        System.out.println("Incoming edges to node 3: " + myMatrix.inEdges(4));
        // System.out.println("Outgoing edges from node 3: " + myMatrix.outEdges(3));
    }
}