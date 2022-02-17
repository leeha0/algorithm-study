package startup.chapter6;

public class Ex6_9_QuickSort {

    public static void main(String[] args) {
        int[] a = {5, 8, 4, 2, 6, 1, 3, 9, 7};

        quickSort(a, 0, a.length - 1);

        for (int i : a) {
            System.out.printf("%3d", i);
        }
    }

    public static void quickSort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int pivot = a[(pl + pr) / 2];

        do {
            while (a[pl] < pivot) {
                pl++;
            }
            while (a[pr] > pivot) {
                pr--;
            }
            if (pl <= pr) {
                swap(a, pl++, pr--);
            }
        } while (pl <= pr);

        if (left < pr) {
            quickSort(a, left, pr);
        }
        if (pl < right) {
            quickSort(a, pl, right);
        }
    }

    public static void partition(int[] a, int n) {
        int pl = 0;
        int pr = n - 1;
        int x = a[n / 2];

        do {
            while (a[pl] < x) {
                pl++;
            }
            while (a[pr] > x) {
                pr--;
            }
            if (pl <= pr) {
                swap(a, pl++, pr--);
            }
        } while (pl <= pr);
    }

    public static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
}
