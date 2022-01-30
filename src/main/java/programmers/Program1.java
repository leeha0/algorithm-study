package programmers;

public class Program1 {

    public static void main(String[] args) {
        int[] absolutes1 = {4, 7, 12};
        boolean[] signs1 = {true, false, true};
        int solution1 = solution(absolutes1, signs1);
        System.out.println("solution1 = " + solution1);

        int[] absolutes2 = {1, 2};
        boolean[] signs2 = {false, false, true};
        int solution2 = solution(absolutes2, signs2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        if ((absolutes.length < 1 || absolutes.length > 1000)
            || absolutes.length != signs.length) {
            return answer;
        }

        for (int i = 0; i < absolutes.length; i++) {
            int absolute = absolutes[i];

            if (absolute < 1 | absolute > 1000) {
                return 0;
            }

            if (signs[i]) {
                answer += absolute;
            } else {
                answer -= absolute;
            }
        }
        return answer;
    }
}
