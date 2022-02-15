package startup.chapter6;

import jdk.swing.interop.SwingInterOpUtils;

public class ExQ6_SelectionSortWithLabel {

    // *       +
    // 6 4 8 3 1 9 7
    public static void main(String[] args) {
        System.out.println("선택 정렬의 교환 과정을 출력하시오.");
        System.out.println("정렬하지 않은 부분 첫 번째 요소에 기호 *, 정렬하지 않은 부분 가장 작은 요소에 기호 +");
        int[] a = {6, 4, 8, 3, 1, 9, 7};

        for (int i = 0; i < a.length - 1; i++) {
            // i 는 정렬하지 않은 부분의 첫 번째 요소
            int minIdx = i;
            for (int j = minIdx + 1; j < a.length; j++) {
                if (a[minIdx] > a[j]) {
                    minIdx = j;
                }
            }

            print(a, i, minIdx);
            swap(a, i, minIdx);
        }
    }

    private static void print(int[] a, int firstIdx, int minIdx) {
        for (int i = 0; i < a.length; i++) {
            if (i == firstIdx) {
                System.out.printf("%3s", "*");
            } else if (i == minIdx) {
                System.out.printf("%3s", "+");
            } else {
                System.out.printf("%3s", " ");
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d", a[i]);
        }
        System.out.println();
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
