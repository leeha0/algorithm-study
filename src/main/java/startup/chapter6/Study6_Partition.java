package startup.chapter6;

public class Study6_Partition {

    public static void main(String[] args) {
        int[] a = {1, 8, 7, 4, 5, 2, 6, 3, 9};

        partition(a, a.length);

        for (int i : a) {
            System.out.printf("%3d", i);
        }
    }

    public static void partition(int[] a, int n) {
        // 가운데 값을 피봇으로 설정
        int pivot = a[n / 2];
        // 양 쪽 끝 인덱스를 커서로 설정
        int pl = 0;
        int pr = n - 1;

        while (pl < pr) {
            while (pivot > a[pl]) {
                pl++;
            }

            while (pivot < a[pr]) {
                pr--;
            }

            // 교환
            swap(a, pl, pr);
        }

        System.out.println("피벗 = " + pivot);

        System.out.println("피벗 이하 그룹");
        for (int i = 0; i < pl + 1; i++) {
            System.out.printf("%3d", a[i]);
        }
        System.out.println();

        if (pl >= pr) {
            System.out.println("피벗과 일치하는 그룹");
            for (int i = pr; i <= pl; i++) {
                System.out.printf("%3d", a[i]);
            }
            System.out.println();
        }

        System.out.println("피벗 이상 그룹");
        for (int i = pr; i < n; i++) {
            System.out.printf("%3d", a[i]);
        }
        System.out.println();
    }

    public static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
}
