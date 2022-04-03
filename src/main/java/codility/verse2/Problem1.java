package codility.verse2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem1 {

    public static void main(String[] args) {
        int solution1 = solution2("babaa"); // 3
        System.out.println("solution1 = " + solution1);

        int solution2 = solution2("bbbab"); // 4
        System.out.println("solution2 = " + solution2);

        int solution3 = solution2("bbbaaabbb"); // 0
        System.out.println("solution3 = " + solution3);
    }

    /*
     * S 문자열은 오직 'a', 'b'만 포함한다
     * S 문자열의 길이는 [1..40,000]
     */
    public static int solution(String S) {
        int result = 0;

        int i = 0;
        int maxBlockLength = 0;
        char[] chars = S.toCharArray();
        ArrayList<Integer> blockLengths = new ArrayList<>();
        for (int j = 0; j < chars.length - 1; j++) {
            if (chars[j] != chars[j + 1]) {
                int blockLength = j + 1 - i;

                blockLengths.add(blockLength);
                if (maxBlockLength < blockLength) {
                    maxBlockLength = blockLength;
                }

                i = j + 1;
            }
        }

        int blockLength = chars.length - i;
        if (maxBlockLength < blockLength) {
            maxBlockLength = blockLength;
        }
        blockLengths.add(blockLength);

        for (Integer length : blockLengths) {
            result += (maxBlockLength - length);
        }

        return result;
    }

    // O(N)
    public static int solution2(String S) {
        int result = 0;

        int fp = 0;
        int ep = 1;
        int length, maxLength = 0;
        char[] chars = S.toCharArray();
        List<Integer> lengths = new LinkedList<>();

        while (ep < S.length()) {
            // if (S.charAt(fp) != S.charAt(ep)) {
            if (chars[fp] != chars[ep]) {
                length = ep - fp;
                lengths.add(length);
                maxLength = Math.max(length, maxLength);
                fp = ep;
            }
            ep++;
        }

        length = ep - fp;
        lengths.add(length);
        maxLength = Math.max(length, maxLength);

        for (Integer l : lengths) {
            result += (maxLength - l);
        }

        return result;
    }

}
