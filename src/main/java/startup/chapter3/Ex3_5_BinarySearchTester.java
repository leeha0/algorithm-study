package startup.chapter3;

import java.util.Arrays;

public class Ex3_5_BinarySearchTester {

    public static void main(String[] args) {
        int[] x = {15, 27, 39, 77, 92, 108, 121};
        int key = 39;

        int idx = Arrays.binarySearch(x, key);

        if (idx < 0) {
            System.out.println("요소가 없습니다.");
        } else {
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}
