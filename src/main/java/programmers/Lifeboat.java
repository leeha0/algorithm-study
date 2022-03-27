package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42885
 */
public class Lifeboat {

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int i = people.length - 1;

        while (i > 0) {
            if (limit >= people[i] + people[i - 1]) {
                answer++;
                i = i - 2;
            } else {
                answer++;
                i = i - 1;
            }
        }

        if (i == 0) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution1 = solution(new int[]{70, 50, 80, 50}, 100);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(new int[]{70, 80, 50}, 100);
        System.out.println("solution2 = " + solution2);
    }

}
