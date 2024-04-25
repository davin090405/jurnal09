import java.util.ArrayList;
import java.util.List;


public class AdjacencyMatrix {
    int n;
    char[][] a;


    AdjacencyMatrix(int n0) {
        n = n0;
        a = new char[n][n];
    }


    public void addEdge(int i, int j) {
        a[i][j] = 'X'; 
    }


    public void removeEdge(int i, int j) {
        a[i][j] = '\0'; // Menghapus edge dengan menetapkan nilai null character ('\0')
    }


    public boolean hasEdge(int i, int j) {
        return a[i][j] != '\0';
    }


    List<Character> outEdges(int i) {
        List<Character> edges = new ArrayList<>();
        for (int j = 0; j < n; j++)
            if (a[i][j] != '\0')
                edges.add((char) ('A' + j)); // Konversi indeks menjadi huruf
        return edges;
    }


    List<Character> inEdges(int i) {
        List<Character> edges = new ArrayList<>();
        for (int j = 0; j < n; j++)
            if (a[j][i] != '\0')
                edges.add((char) ('A' + j)); // Konversi indeks menjadi huruf
        return edges;
    }


    public void printMatrix() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != '\0')
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
    }
}