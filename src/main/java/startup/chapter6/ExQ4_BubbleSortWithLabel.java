package startup.chapter6;

public class ExQ4_BubbleSortWithLabel {

    public static void main(String[] args) {
        System.out.println("버블 정렬(버전 3)");
        int[] x = {6, 4, 3, 7, 1, 9, 8};

        bubbleSort(x, x.length);
    }

    private static void bubbleSort(int[] x, int n) {
        int swapCount = 0;
        int comparisonCount = 0;

        int pass = 1;
        int k = 0;
        while (k < n - 1) {
            System.out.println("패스" + (pass++) + ":");

            // 마지막으로 요소를 교환한 위치
            int last = n - 1;
            for (int j = n - 1; j > k; j--) {
                boolean swap = false;
                comparisonCount++;
                if (x[j - 1] > x[j]) {
                    swap = true;
                    last = j;
                }

                print(x, j - 1, swap);

                if (swap) {
                    swapCount++;
                    swap(x, j - 1, j);
                }

            }
            k = last;

            System.out.println();
        }

        System.out.println("비교를 " + comparisonCount + "회 했습니다.");
        System.out.println("교환을 " + swapCount + "회 했습니다.");

    }

    private static void print(int[] a, int idx, boolean swap) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d", a[i]);
            if (i == idx) {
                if (swap) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
        }
        System.out.println();
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
