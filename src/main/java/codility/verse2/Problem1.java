package codility.verse2;

import java.util.ArrayList;

public class Problem1 {

    public static void main(String[] args) {
        int solution1 = solution("babaa"); // 3
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("bbbab"); // 4
        System.out.println("solution2 = " + solution2);

        int solution3 = solution("bbbaaabbb"); // 0
        System.out.println("solution3 = " + solution3);
    }

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

}
