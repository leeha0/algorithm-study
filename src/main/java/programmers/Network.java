package programmers;

import java.util.Stack;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43162
 */
public class Network {

    public static int solution2(int n, int[][] computers) {
        int answer = 0;

        boolean[] isVisited = new boolean[computers.length];

        for (int i = 0; i < computers.length; i++) {
            if (!isVisited[i]) {
                // self-loop 방지
                isVisited[i] = true;
                dfs(computers, isVisited, i);
                answer++;
            }
        }

        return answer;
    }

    private static void dfs(int[][] computers, boolean[] isVisited, int startVertex) {
        for (int i = 0; i < computers.length; i++) {
            if (!isVisited[i] && computers[startVertex][i] == 1) {
                // self-loop 방지
                isVisited[i] = true;
                dfs(computers, isVisited, i);
            }
        }
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        // 모든 정점을 방문해야 함
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                stack.push(i);
                visited[i] = true;
            }

            while (!stack.isEmpty()) {
                Integer currentComputer = stack.pop();

                for (int connectedComputer = 0; connectedComputer < computers[currentComputer].length; connectedComputer++) {
                    if (connectedComputer != currentComputer
                        && computers[currentComputer][connectedComputer] == 1
                        && !visited[connectedComputer]) {
                        stack.push(connectedComputer);
                        visited[connectedComputer] = true;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution1 = solution(3, new int[][]{
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        });
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(3, new int[][]{
            {1, 1, 0},
            {1, 1, 1},
            {0, 1, 1}
        });
        System.out.println("solution2 = " + solution2);
    }

}
