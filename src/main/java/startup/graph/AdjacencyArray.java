package startup.graph;

// 인접 행렬을 사용하여 그래프를 표현하는 방법
class ArrayGraph {

    final private int[][] arrayGraph;

    public ArrayGraph(int size) {
        arrayGraph = new int[size][size];
    }

    public void put(int v1, int v2) {
        arrayGraph[v1][v2] = arrayGraph[v2][v1] = 1;
    }

    public void putSingle(int v1, int v2) {
        arrayGraph[v1][v2] = 1;
    }

    public void printGraph() {
        for (int i = 0; i < arrayGraph.length; i++) {
            for (int j = 0; j < arrayGraph[i].length; j++) {
                System.out.print(" " + arrayGraph[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class AdjacencyArray {

    public static void main(String[] args) {
        final int size = 4;
        ArrayGraph arrayGraph = new ArrayGraph(size);

        arrayGraph.put(0, 1);
        arrayGraph.put(0, 2);
        arrayGraph.put(0, 3);
        arrayGraph.put(2, 3);

        arrayGraph.printGraph();
    }
}
