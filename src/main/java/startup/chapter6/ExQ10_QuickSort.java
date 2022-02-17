package startup.chapter6;

public class ExQ10_QuickSort {

    public static void main(String[] args) {
        int[] a = {5, 8, 4, 2, 6, 1, 3, 9, 7};

        System.out.println("다음의 형식으로 동작하는 퀵 정렬을 구현하시오.");
        System.out.println("static void quickSort(int[] a, int n)");
        quickSort(a, a.length);

        for (int i : a) {
            System.out.printf("%3d", i);
        }
    }

    // TODO: 흠 ..
    public static void quickSort(int[] a, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int pivot = a[(right - left) / 2];
            int pl = left;
            int pr = right;

            while (a[pl] < pivot) {
                pl++;
            }

            while (a[pr] > pivot) {
                pr--;
            }

            if (pl >= pr) {
                swap(a, pl, pr);
            }
        }
    }

    public static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
}
