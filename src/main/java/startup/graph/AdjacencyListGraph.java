package startup.graph;

import java.util.ArrayList;

// 인접 리스트(배열, 리스트)를 사용하여 그래프를 표현하는 방법
class ListGraph {

    private ArrayList<ArrayList<Integer>> listGraph;

    public ListGraph(int size) {
        listGraph = new ArrayList<>();

        for (int i = 0; i < size; i ++) {
            listGraph.add(new ArrayList<>());
        }
    }

    // 양방향 그래프
    public void put(int v1, int v2) {
        listGraph.get(v1).add(v2);
        listGraph.get(v2).add(v1);
    }

    // 단방향 그래프
    public void putSingle(int v1, int v2) {
        listGraph.get(v1).add(v2);
    }

    public void printGraph() {
        for (int i = 0; i < listGraph.size(); i++) {
            System.out.println("정점 " + i + "의 인접리스트");

            for (int j = 0; j < listGraph.get(i).size(); j++) {
                System.out.print(" -> " + listGraph.get(i).get(j));
            }
            System.out.println();
        }
    }

}

public class AdjacencyListGraph {

    public static void main(String[] args) {
        final int size = 4;
        ListGraph listGraph = new ListGraph(size);

        listGraph.put(0, 1);
        listGraph.put(0, 2);
        listGraph.put(0, 3);
        listGraph.put(2, 3);

        listGraph.printGraph();
    }

}


