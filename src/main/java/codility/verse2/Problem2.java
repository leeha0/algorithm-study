package codility.verse2;

public class Problem2 {

    public static void main(String[] args) {
        int solution0 = solution2(9, 10); // 2
        System.out.println("solution1 = " + solution0);

        int solution1 = solution2(4, 3); // 1
        System.out.println("solution1 = " + solution1);

        int solution2 = solution2(4, 10); // 4
        System.out.println("solution2 = " + solution2);

        int solution3 = solution2(1, 2); // -1
        System.out.println("solution3 = " + solution3);

        int solution4 = solution2(10, 5); // 1
        System.out.println("solution4 = " + solution4);
    }

    /*
     * N: 1, 2, … N리터 용량의 빈 잔 N개. Range - (Int) [1 .. 1,000,000].
     * K: 정확히 붓고 싶은 물의 양. Range - (Int) [1 .. 1,000,000,000].
     */
    public static int solution(int N, int K) {
        int result = 0;
        int k = K;

        for (int i = N; i > 0; i--) {
            if (i <= k) {
                k -= i;
                result += 1;
            }

            if (k <= 0) {
                break;
            }
        }

        return k > 0 ? -1 : result;
    }

    // O(N)
    public static int solution2(int N, int K) {
        int result = 0;

        // 등차수열의 합
        if ((N * (N + 1) / 2) < K) {
            return -1;
        }

        while (N < K) {
            K -= N;
            result += 1;
            N--;
        }

        // 마지막 한 컵
        return ++result;
    }
}
