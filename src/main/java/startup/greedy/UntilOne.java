package startup.greedy;

/**
 * 어떤 수 n이 1이 될 때까지 두 연산 중 하나를 선택하고 연산의 최소 횟수는?
 *
 * - 1 빼기
 * - K로 나누기
 */
public class UntilOne {

    public static void main(String[] args) {
        int n = 25;
        int k = 3;
        int count = 0;

        // 25 - 1 = 24 (1)
        // 24 / 3 = 8 (2)
        // 8 - 2 = 6 (4)
        // 6 / 3 = 2 (5)
        // 2 - 2 = 0 (6)
        while (true) {
            int target = (n / k) * k;
            count += (n - target);
            n = target;

            if (n < k) {
                break;
            }

            count += 1;
            n /= k;
        }
        // 남은 수에서 1 빼기
        count += (n - 1);

        /*
        while (n > 1) {
            if (n % k > 0) {
                n--;
            } else {
                n = n / k;
            }
            count++;
        }
        */

        System.out.println("count = " + count);
    }

}
