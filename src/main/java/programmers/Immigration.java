package programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43238
 * n : 입국심사를 기다리는 사람 수
 * times : 심사관이 한 명을 심사하는데 걸리는 시간 배열
 *
 * 1 <= n <= 1,000,000,000
 * 1 <= time <= 1,000,000,000
 * 1 <= times.length() <= 100,000
 */
public class Immigration {

    // 실패 케이스 1 - 순차 탐색 접근
//    public static long solution(int n, int[] times) {
//        int[] executeTimes = Arrays.copyOf(times, times.length);
//        long answer = 0;
//
//        for (int i = 0; i < n; i++) {
//            int minIdx = 0;
//            for (int j = 0; j < times.length; j++) {
//                if (executeTimes[minIdx] > executeTimes[j]) {
//                    minIdx = j;
//                }
//            }
//            answer = executeTimes[minIdx];
//            executeTimes[minIdx] = executeTimes[minIdx] + times[minIdx];
//        }
//
//        return answer;

    // 실패 케이스 2 - 정답이 여러개일 경우 정답 오류
//    public static long solution(int n, int[] times) {
//        int max = 0;
//        int min = Integer.MAX_VALUE;
//        for (int time : times) {
//            min = Math.min(min, time);
//            max = Math.max(max, time);
//        }
//
//        int sum = 0;
//        int mod = 0;
//        int pl = min;
//        int pr = n * max;
//        int center = (pl + pr) / 2;
//
//        do {
//            sum = 0;
//            mod = 0;
//            center = (pl + pr) / 2;
//            for (int time : times) {
//                sum += (center / time);
//                mod += (center % time);
//            }
//
//            if (n == sum && mod < n) {
//                break;
//            } else if (n <= sum) {
//                pr = center - 1;
//            } else {
//                pl = center + 1;
//            }
//        } while (true);
//
//        return center;
//    }

    public static long solution(int n, int[] times) {
        long max = 0;
        for (int time : times) {
            max = Math.max(max, time);
        }

        long sum, center;
        long pl = 0;
        long pr = n * max;

        do {
            // lower_bound
            sum = 0;
            center = pl + (pr - pl) / 2;
            for (int time : times) {
                sum += (center / time);
            }

            if (sum >= n) {
                // 값이 같거나 높은 값을 만나면 자기 자신으로 값을 고정
                // pr 중앙 값으로 고정
                pr = center;
            } else {
                // pl 값은 범위를 줄여가며 정답을 향해 이동
                pl = center + 1;
            }
            // pl과 pr이 교차하는 시점이 경우의 수 중 제일 작은 값
        } while (pl < pr);

        return pr;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};

        long solution = solution(n, times);
        System.out.println("solution = " + solution);
    }
}
