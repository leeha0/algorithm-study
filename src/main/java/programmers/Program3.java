package programmers;

public class Program3 {

    public static void main(String[] args) {
        int[] a1 = {-5, 0, 2, 1, 2};
        int[][] edges1 = {
            {0, 1},
            {3, 4},
            {2, 3},
            {0, 3}
        };
        long solution1 = solution(a1, edges1);
        System.out.println("solution1 = " + solution1);

        int[] a2 = {0, 1, 0};
        int[][] edges2 = {
            {0, 1},
            {1, 2}
        };
        long solution2 = solution(a2, edges2);
        System.out.println("solution2 = " + solution2);
    }

    public static long solution(int[] a, int[][] edges) {
        long answer = -2;

        if ((a.length < 2 || a.length > 3000)
            || edges.length != a.length - 1) {
            return -1;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < -1000000 | a[i] > 1000000) {
                return 0;
            }
        }

        return answer;
    }
}
