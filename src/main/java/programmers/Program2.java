package programmers;

import java.util.Stack;

public class Program2 {

    public static void main(String[] args) {
        String s1 = "[](){}";
        int solution1 = solution(s1);
        System.out.println("solution1 = " + solution1);

        String s2 = "}]()[{";
        int solution2 = solution(s2);
        System.out.println("solution2 = " + solution2);

        String s3 = "[)(]";
        int solution3 = solution(s3);
        System.out.println("solution3 = " + solution3);

        String s4 = "{";
        int solution4 = solution(s4);
        System.out.println("solution4 = " + solution4);
    }

    public static int solution(String s) {
        int answer = 0;

        if (s.length() < 1 || s.length() > 1000) {
            return answer;
        }

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();

            for (int j = i; j < s.length() + i; j++) {
                int index = j >= s.length() ? j - s.length() : j;
                char c = s.charAt(index);

                if (j == i && (c == ')' || c == ']' || c == '}')) {
                    break;
                }

                if (c == '(' || c == '[' || c == '{') {
                    stack.add(c);
                } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    break;
                }

                if (j == s.length() + i - 1 && s.length() > 1) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
