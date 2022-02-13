package startup.chapter6;

public class ExQ7_InsertionSort {

    public static void main(String[] args) {
        System.out.println("배열의 두 번재 요소(a[1])부터 데이터를 저장하여 삽입을 마치는 조건을 향상시킬 수 있다.");
        int originA[] = {8, 3, 4, 5, 6};
        int a[] = {0, 8, 3, 4, 5, 6};

        //originInsertionSort(originA, originA.length);
        insertionSort(a, a.length);

        for (int i = 1; i < a.length; i++) {
            System.out.printf("%3d", a[i]);
        }

    }

    private static void insertionSort(int a[], int n) {
        for (int i = 1; i < n - 1; i++) {
            int insertPosition = i;
            int insertElement = a[i + 1];
            for (int j = i; j > 0; j--) {
                if (a[j] > a[i + 1]) {
                    a[i + 1] = a[j];
                    insertPosition = j;
                }
            }
            a[insertPosition] = insertElement;
        }
    }

    private static void originInsertionSort(int a[], int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int temp = a[i];
            for (j = i; j > 0 && a[j - 1] > temp; j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
    }
}
