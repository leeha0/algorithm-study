package startup.chapter6;

public class Ex6_1_BubbleSort {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int length = a.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = length - 1; j > i; j--) {
                if (a[j] > a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

        for (int i : a) {
            System.out.printf("%3d", i);
        }
    }
}
