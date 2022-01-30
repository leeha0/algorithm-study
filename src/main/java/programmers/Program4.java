package programmers;

public class Program4 {

    public static void main(String[] args) {
        int n = 5;
        int z = 5;
        int[][] roads = {
            {1, 2, 3},
            {0, 3, 2}
        };
        long[] queries = {0, 1, 2, 3, 4, 5, 6};

        long[] solution = solution(n, z, roads, queries);
        System.out.println("solution = " + solution);
    }

    public static long[] solution(int n, int z, int[][] roads, long[] queries) {
        long[] answer = {};
        return answer;
    }
}
