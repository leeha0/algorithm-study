package codility.verse2;

public class Problem2 {

    public static void main(String[] args) {
        int solution1 = solution(4, 3); // 1
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(4, 10); // 4
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(1, 2); // -1
        System.out.println("solution3 = " + solution3);

        int solution4 = solution(10, 5); // 1
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

}
