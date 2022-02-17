package startup.chapter6;

public class Ex6_8_Partition {

    public static void main(String[] args) {
        int[] a = {1, 8, 7, 4, 5, 2, 6, 3, 9};

        partition(a, a.length);

        for (int i : a) {
            System.out.printf("%3d", i);
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
