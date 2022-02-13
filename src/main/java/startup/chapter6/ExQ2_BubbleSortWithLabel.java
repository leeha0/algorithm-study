package startup.chapter6;

public class ExQ2_BubbleSortWithLabel {

    // TODO Ex 6_1 라벨 출력
    // 패스1:
    //  6 4 3 7 1 9 + 8
    //  6 4 3 7 1 - 8 9
    // ...
    public static void main(String[] args) {
        System.out.println("버블 정렬(버전 1)");
        int[] x = {6, 4, 3, 7, 1, 9, 8};
        int nx = x.length;

        bubbleSort(x, nx);
    }

    private static void bubbleSort(int[] x, int n) {
        int swapCount = 0;
        int comparisonCount = 0;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("패스" + (i + 1) + ":");

            for (int j = n - 1; j > i; j--) {
                boolean swap = false;

                comparisonCount++;
                if (x[j] < x[j - 1]) {
                    swap = true;
                }

                print(x, j - 1, swap);

                if (swap) {
                    swapCount++;
                    swap(x, j, j - 1);
                }
            }

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
