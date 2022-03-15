package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43163 begin에서 target으로 가장 짧은 변환 과정
 * <p>
 * - 한 번에 한 개의 알파벳만 바꿀 수 있다.
 * - words에 있는 단어로반 변환할 수 있다.
 * <p>
 * hit(begin) -> hot -> dot -> dog -> cog(target) = 4단계
 */
public class WordConversion {

    public static int solution(String begin, String target, String[] words) {
        int answer = 0;

        // 단어별 방문 여부, 레벨
        int[] levels = new int[words.length];
        boolean[] visited = new boolean[words.length];

        Queue<String> queue = new LinkedList<>();
        queue.add(begin);

        while (!queue.isEmpty()) {
            // 큐 가져오기
            String currentWord = queue.poll();
            int currentWordIndex = indexOf(words, currentWord);
            int currentWordLevel = currentWordIndex < 0 ? 0 : levels[currentWordIndex];

            if (currentWord == target) {
                answer = levels[currentWordIndex];
                break;
            }

            // 인접 노드 가져오기
            List<String> adjVertices = findAdjVertices(currentWord, words);
            for (String adjVertex : adjVertices) {
                // 인접 노드 큐에 입력하기
                int adjIndex = indexOf(words, adjVertex);
                boolean isVisited = visited[adjIndex];

                if (!isVisited) {
                    queue.add(adjVertex);
                    visited[adjIndex] = true;
                    levels[adjIndex] = currentWordLevel + 1;
                }
            }
        }

        return answer;
    }

    private static int indexOf(String[] words, String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i] == word) {
                return i;
            }
        }

        return -1;
    }

    private static List<String> findAdjVertices(String currentWord, String[] words) {
        ArrayList<String> adjVertices = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            char[] currentChars = currentWord.toCharArray();
            char[] wordChars = words[i].toCharArray();
            int diffCounter = 0;

            for (int c = 0; c < currentChars.length; c++) {
                char c1 = currentChars[c];
                char c2 = wordChars[c];

                if (c1 != c2) {
                    diffCounter++;
                }
            }

            if (diffCounter == 1) {
                adjVertices.add(words[i]);
            }
        }

        return adjVertices;
    }

    public static void main(String[] args) {
        int solution1 = solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"});
        System.out.println("solution1 = " + solution1); // 4

        int solution2 = solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"});
        System.out.println("solution2 = " + solution2); // 0
    }
}

/*
 * - begin(len = 0)
 *
 * - 인접 노드 조사
 * - 인접 노드 큐에 넣기 (기준 노드의 len + 1)
 * - 인접 노드 방문 표시
 * - 큐 꺼내기
 * - target 노드와 동일한지 비교
 * - 동일하면 길이 반환
 * - 그렇지 않다면 계쏙 탐색
 *
 * - 워드 배열
 * - 방문 여부 배열
 * - 길이 배열
 */
