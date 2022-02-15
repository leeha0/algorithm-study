package startup.chapter6;

public class ExQ9_ShellSortWithLabel {

    public static void main(String[] args) {
//        int[] a1 = {9, 1, 4, 2, 7, 6, 3, 5};
        int[] a1 = {9, 1, 4, 2, 7, 6, 3, 5, 10, 13, 15, 5, 3, 4, 45, 7, 32, 1, 3, 6, 2};
        int nx1 = a1.length;

//        int[] a2 = {9, 1, 4, 2, 7, 6, 3, 5};
        int[] a2 = {9, 1, 4, 2, 7, 6, 3, 5, 10, 13, 15, 5, 3, 4, 45, 7, 32, 1, 3, 6, 2};
        int nx2 = a2.length;

        shellSort1(a1, nx1);
        shellSort2(a2, nx2);

        for (int i : a1) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i : a2) {
            System.out.printf("%3d", i);
        }
    }

    public static void shellSort1(int[] a, int n) {
        int shiftCount = 0;
        for (int h = n / 2; h > 0; h /= 2) {
            // n-정렬
            System.out.println(h + "-정렬");
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    // 비교 후 밀어내기
                    shiftCount++;
                    a[j + h] = a[j];
                }
                a[j + h] = tmp;
            }
        }
        System.out.println("총 이동 횟수 : " + shiftCount);
    }

    public static void shellSort2(int[] a, int n) {
        int shiftCount = 0;
        int h;
        for (h = 1; h < n / 9; h = h * 3 + 1)
            ;

        for (; h > 0; h /= 3) {
            // n-정렬
            System.out.println(h + "-정렬");
            for (int i = h; i < n; i++) {
                // 패스
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    // 비교 후 밀어내기
                    shiftCount++;
                    a[j + h] = a[j];
                }
                a[j + h] = tmp;
            }
        }
        System.out.println("총 이동 횟수 : " + shiftCount);
    }
}
