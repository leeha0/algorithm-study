package startup.chapter6;

public class Ex6_7_ShellSort2 {

    public static void main(String[] args) {
        int[] a = {9, 1, 4, 2, 7, 6, 3, 5};
        int nx = a.length;

        System.out.println("셸 정렬(버전 2)");
        shellSort(a, nx);

        for (int i : a) {
            System.out.printf("%3d", i);
        }
    }

    public static void shellSort(int[] a, int n) {
        int h;
        for (h = 1; h < n / 9; h = h * 3 + 1)
            ;

        for (; h > 0; h /= 3) {
            // n-정렬
            for (int i = h; i < n; i++) {
                // 패스
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    // 비교 후 밀어내기
                    a[j + h] = a[j];
                }
                a[j + h] = tmp;
            }
        }
    }
}
