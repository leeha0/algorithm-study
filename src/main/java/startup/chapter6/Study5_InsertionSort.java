package startup.chapter6;

public class Study5_InsertionSort {

    public static void main(String[] args) {
        int[] a = {2, 1, 4, 3, 5};

        for (int i = 1; i < a.length; i++) {
            int tmp = a[i];
            int j = i - 1;

            for (; j >= 0 && tmp < a[j]; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = tmp;
        }

        for (int i : a) {
            System.out.printf("%3d", i);
        }
    }
}
