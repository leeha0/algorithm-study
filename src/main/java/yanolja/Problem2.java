package yanolja;

public class Problem2 {

    public static void main(String[] args) {
        int solution1 = solution(new int[]{2, 6, 8, 5});
        int solution2 = solution(new int[]{1, 5, 5, 2, 6});
        int solution3 = solution(new int[]{1, 1});
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[] blocks) {
        int maxDistance = 0;
        for (int startBlockIndex = 0; startBlockIndex < blocks.length; startBlockIndex++) {
            int distance = calculateDistance(startBlockIndex, blocks);
            if (maxDistance < distance) {
                maxDistance = distance;
            }
        }
        return maxDistance;
    }

    public static int calculateDistance(int startBlockIndex, int[] blocks) {
        int forwardFrogPosition = startBlockIndex;
        int backwardFrogPosition = startBlockIndex;

        for (int blockIndex = startBlockIndex; blockIndex < blocks.length; blockIndex++) {
            final int nextBlockIndex = blockIndex + 1;

            if (nextBlockIndex == blocks.length) {
                break;
            }

            if (blocks[blockIndex] <= blocks[nextBlockIndex]) {
                forwardFrogPosition = nextBlockIndex;
            } else {
                break;
            }
        }

        for (int blockIndex = startBlockIndex; blockIndex > 0; blockIndex--) {
            final int nextBlockIndex = blockIndex - 1;

            if (nextBlockIndex < 0) {
                break;
            }

            if (blocks[blockIndex] <= blocks[nextBlockIndex]) {
                backwardFrogPosition = nextBlockIndex;
            } else {
                break;
            }
        }

        return forwardFrogPosition - backwardFrogPosition + 1;
    }
}
