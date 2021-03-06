package startup.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 인접 리스트를 이용한 방향 그래프
class DirectedGraph {

    private final int vertexSize;
    private final LinkedList<Integer>[] adj;

    public DirectedGraph(int size) {
        vertexSize = size;
        adj = new LinkedList[size];
        for (int i = 0; i < size; ++i) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v1, int v2) {
        adj[v1].add(v2);
    }

    public void DSFUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.println(vertex + " ");

        for (Integer adjVertex : adj[vertex]) {
            if (!visited[adjVertex]) {
                DSFUtil(adjVertex, visited);
            }
        }
    }

    public void DFS(int vertex) {
        boolean[] visited = new boolean[vertexSize];

        DSFUtil(vertex, visited);
    }

    public void DFS() {
        boolean[] visited = new boolean[vertexSize];

        // 비연결 그래프의 경우 모든 정점 방문 하도록
        for (int i = 0; i < vertexSize; ++i) {
            if (!visited[i]) {
                DSFUtil(i, visited);
            }
        }
    }

    public void DFSWithStack() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertexSize];

        for (int i = 0; i < vertexSize; ++i) {
            if (!visited[i]) {
                stack.push(i);
                visited[i] = true;

                while (!stack.isEmpty()) {
                    Integer vertex = stack.pop();
                    System.out.println(vertex);

                    for (Integer adjVertex : adj[vertex]) {
                        if (!visited[adjVertex]) {
                            stack.push(adjVertex);
                            visited[adjVertex] = true;
                        }
                    }
                }
            }
        }
    }

    public void BFSWithQueue(int vertex) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertexSize];

        queue.add(vertex);
        visited[vertex] = true;

        while (!queue.isEmpty()) {
            vertex = queue.poll();
            System.out.println(vertex);

            for (Integer adjVertex : adj[vertex]) {
                if (!visited[adjVertex]) {
                    queue.add(adjVertex);
                    visited[adjVertex] = true;
                }
            }
        }
    }
}

public class DirectedGraphClient {

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("[DFS] 출발 정점 = 2");
        graph.DFS(2);

        System.out.println("[DFS] 출발 정점 = 없음");
        graph.DFS();

        System.out.println("[DFS] 출발 정점 = 없음 (스택을 통한 탐색)");
        graph.DFSWithStack();

        System.out.println("[BFS] 출발 정점 = 0 (큐를 통한 탐색)");
        graph.BFSWithQueue(0);
    }

}
