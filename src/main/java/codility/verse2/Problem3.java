package codility.verse2;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem3 {

    public static void main(String[] args) {
        int solution1 = solution2(5, new int[]{2, 2, 1, 2}, new int[]{1, 3, 4, 4}); // 31
        System.out.println("solution1 = " + solution1);

        int solution2 = solution2(3, new int[]{1}, new int[]{3}); // 5
        System.out.println("solution1 = " + solution2);

        int solution3 = solution2(4, new int[]{1, 3}, new int[]{2, 4}); // 10
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int N, int[] A, int[] B) {
        int result = 0;

        HashMap<Integer, Integer> adjVertexMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int n1 = A[i];
            int n2 = B[i];

            adjVertexMap.merge(n1, 1, Integer::sum);
            adjVertexMap.merge(n2, 1, Integer::sum);
        }

        int[] vertexWeight = new int[N + 1];
        AtomicInteger n = new AtomicInteger(N);
        // Final 값에 대한 람다 캡처링
        // Variable used in lambda expression should be final or effectively final
        adjVertexMap.entrySet().stream()
            .sorted((o1, o2) -> o2.getValue() - o1.getValue())
            .forEach(entry -> vertexWeight[entry.getKey()] = n.getAndDecrement());

        for (int i = 0; i < A.length; i++) {
            int n1 = A[i];
            int n2 = B[i];

            result += (vertexWeight[n1] + vertexWeight[n2]);
        }

        return result;
    }

    // O(N^2)
    public static int solution2(int N, int[] A, int[] B) {
        int result = 0;
        int[] edges = new int[N + 1];
        int[] values = new int[N + 1];

        for (int i = 0; i < A.length; i++) {
            edges[A[i]]++;
            edges[B[i]]++;
        }

        // 두 배열을 교차시켜 비교
        for (int i = 1; i < edges.length; i++) {
            values[i]++;

            for (int j = 1; j < i; j++) {
                if (edges[j] > edges[i]) {
                    values[j]++;
                } else {
                    values[i]++;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            result += (values[A[i]] + values[B[i]]);
        }

        return result;
    }

}
