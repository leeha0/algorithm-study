package startup.chapter6;

public class Study3_SelectionSort {

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1, 9, 10};
        int min;

        for (int i = 0; i < a.length; i++) {
            min = i;
            // Index Out Of Range 에러가 발생 할 것 같지만 조건부를 만족하지 않아서 발생하지 않음
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            swap(a, i, min);
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
