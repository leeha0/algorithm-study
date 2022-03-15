package programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 */
public class TargetNumber {

    public static int solution(int[] numbers, int target) {
        int bfs = bfs(numbers, target);
        int dfs = dfs(numbers, target, 0, 0);

        return dfs;
    }

    public static int bfs(int[] numbers, int target) {
        int count = 0;
        List<Integer> results = new ArrayList<>();
        results.add(0);

        for (int number : numbers) {
            List<Integer> append = new ArrayList<>();

            for (Integer result : results) {
                append.add(result + number);
                append.add(result - number);
            }

            results = append;
        }

        for (Integer result : results) {
            if (result == target) {
                count++;
            }
        }

        return count;
    }

    public static int dfs(int[] numbers, int target, int depth, int sum) {
        int result = 0;

        if (depth == numbers.length) {
            if (sum == target) {
                return 0;
            }
            return 1;
        } else {
            result += dfs(numbers, target, depth + 1, sum + numbers[depth]);
            result += dfs(numbers, target, depth + 1, sum - numbers[depth]);
        }

        return result;
    }

    public static void main(String[] args) {
        int solution1 = solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(new int[]{4, 1, 2, 1}, 4);
        System.out.println("solution2 = " + solution2);
    }

}
