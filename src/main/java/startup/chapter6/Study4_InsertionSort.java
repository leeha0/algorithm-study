package startup.chapter6;

public class Study4_InsertionSort {

    public static void main(String[] args) {
        int[] a = {2, 1, 4, 3, 5};

        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int insertPosition = i;
            for (int j = insertPosition; j > 0; j--) {
                if (a[j - 1] > a[i]) {
                    a[i] = a[j - 1];
                    insertPosition = j - 1;
                }
            }

            a[insertPosition] = temp;
        }

        for (int i : a) {
            System.out.printf("%3d", i);
        }
    }
}
