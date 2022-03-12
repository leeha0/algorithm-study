package startup.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Vertex {

    private final int value;
    private boolean visited = false;
    private final List<Vertex> adjacentVertices = new LinkedList<>();

    public Vertex(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getAdjacentVertices() {
        return adjacentVertices;
    }

    public void addAdjacentVertex(Vertex v) {
        adjacentVertices.add(v);
    }

    public void visit() {
        visited = true;
    }

}

class ListGraphSearch {

    private final List<Vertex> vertices;

    public ListGraphSearch(int size) {
        vertices = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            vertices.add(new Vertex(i));
        }
    }

    public Vertex getVertex(int v) {
        return vertices.get(v);
    }

    public void addAdjacentNode(int v1, int v2) {
        vertices.get(v1).addAdjacentVertex(vertices.get(v2));
        vertices.get(v2).addAdjacentVertex(vertices.get(v1));
    }

    public void dfs(Vertex root) {
        System.out.print("DFS : ");
        Stack<Vertex> stack = new Stack<>();
        stack.push(root);

        root.visit();

        while (!stack.empty()) {
            Vertex node = stack.pop();

            for (Vertex adjacentNode : node.getAdjacentVertices()) {
                if (!adjacentNode.isVisited()) {
                    stack.push(adjacentNode);
                    adjacentNode.visit();
                }
            }

            System.out.print(node.getValue() + " -> ");
        }
        System.out.println("END");
    }

    public void recursiveDfs(Vertex root) {
        if (root == null) {
            return;
        }

        root.visit();
        System.out.print(root.getValue() + " -> ");

        for (Vertex adjacentVertex : root.getAdjacentVertices()) {
            if (!adjacentVertex.isVisited()) {
                recursiveDfs(adjacentVertex);
            }
        }
    }

    public void print() {
        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i).getValue());
            List<Vertex> adjacentNodes = vertices.get(i).getAdjacentVertices();
            for (int j = 0; j < adjacentNodes.size(); j++) {
                System.out.print(" -> " + adjacentNodes.get(j).getValue());
            }
            System.out.println();
        }
    }
}

public class GraphSearch {

    public static void main(String[] args) {
        ListGraphSearch listGraphSearch = new ListGraphSearch(5);
        listGraphSearch.addAdjacentNode(0, 1);
        listGraphSearch.addAdjacentNode(1, 2);
        listGraphSearch.addAdjacentNode(2, 3);
        listGraphSearch.addAdjacentNode(3, 4);

        listGraphSearch.print();
        // DFS : 0 -> 1 -> 2 -> 3 -> 4 -> END
        // listGraphSearch.dfs(listGraphSearch.getVertex(0));
        // RDFS : 0 -> 1 -> 2 -> 3 -> 4 -> END
        listGraphSearch.recursiveDfs(listGraphSearch.getVertex(0));
    }

}