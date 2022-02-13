package startup.chapter6;

public class Study2_ShortcutBubbleSort {

    public static void main(String[] args) {
        int a[] = {4, 3, 2, 1, 5, 6, 7, 8};
//        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int k = a.length - 1;

        while (0 < k) {
            System.out.println("패스");
            int last = 0;
            for (int j = 0; j < k; j++) {
                if (a[j] > a[j + 1]) {
                    System.out.println("Swap: a[" + j + "]=" + a[j] + ", a[" + (j + 1) + "]=" + a[j + 1]);
                    swap(a, j, j + 1);
                    last = j;
                }
            }
            k = last;
            System.out.println("k = " + k);
        }

        for (int i2 : a) {
            System.out.printf("%3d", i2);
        }
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
