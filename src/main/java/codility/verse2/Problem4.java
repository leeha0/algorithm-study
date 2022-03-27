package codility.verse2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Problem4 {

    public static void main(String[] args) {
        boolean solution1 = solution(new int[]{3, 1, 2}, new int[]{2, 3, 1}); // true
        System.out.println("solution1 = " + solution1);

        boolean solution2 = solution(new int[]{1, 2, 1}, new int[]{2, 3, 3}); // false
        System.out.println("solution1 = " + solution2);

        boolean solution3 = solution(new int[]{1, 2, 3, 4}, new int[]{2, 1, 4, 4}); // false
        System.out.println("solution1 = " + solution3);

        boolean solution4 = solution(new int[]{1, 2, 3, 4}, new int[]{2, 1, 4, 3}); // false
        System.out.println("solution1 = " + solution4);

        boolean solution5 = solution(new int[]{1, 2, 2, 3, 3}, new int[]{2, 3, 3, 4, 5}); // false
        System.out.println("solution1 = " + solution5);
    }

    public static boolean solution(int[] A, int[] B) {
        boolean result = false;

        HashMap<Integer, LinkedList<Integer>> adjVertexMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            adjVertexMap.computeIfAbsent(A[i], k -> new LinkedList<>()).add(B[i]);
        }

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[A.length + 1];

        int startVertex = A[0];
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            Integer vertex = stack.pop();
            visited[vertex] = true;

            LinkedList<Integer> adjVertex = adjVertexMap.get(vertex);
            if (adjVertex == null) {
                continue;
            }

            for (Integer adjV : adjVertex) {
                if (startVertex == adjV) {
                    result = true;
                }

                if (!visited[adjV]) {
                    stack.push(adjV);
                }
            }
        }

        for (int i = 1; i < visited.length; i++) {
            result = result && visited[i];
        }

        return result;
    }

}
