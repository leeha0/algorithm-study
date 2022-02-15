package startup.chapter6;

public class Study1_BubbleSort {

    public static void main(String[] args) {
        int[] a = {8, 3, 4, 1, 7, 6, 5, 2};

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }

        for (int i : a) {
            System.out.printf("%3d", i);
        }
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
