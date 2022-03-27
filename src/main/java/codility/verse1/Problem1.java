package codility.verse1;

public class Problem1 {

    public static void main(String[] args) {
        String solution1 = solution("?ab??a");
        String solution2 = solution("bab??a");
        String solution3 = solution("?a?");
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }

    public static String solution(String S) {
        final char dummyChar = 'a';

        char[] chars = S.toCharArray();
        for (int offset = 0; offset < chars.length / 2; offset++) {
            final int backwardOffset = chars.length - 1 - offset;

            char forwardChar = chars[offset];
            char backendChar = chars[backwardOffset];

            if (forwardChar == '?' && backendChar == '?') {
                forwardChar = dummyChar;
                backendChar = dummyChar;
            } else if (forwardChar == '?') {
                forwardChar = backendChar;
            } else if (backendChar == '?') {
                backendChar = forwardChar;
            }

            if (forwardChar != backendChar) {
                return "NO";
            }
            chars[offset] = forwardChar;
            chars[backwardOffset] = backendChar;
        }
        return new String(chars);
    }
}
