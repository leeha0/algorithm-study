package startup.chapter6;

import java.util.Scanner;

public class ExQ2_BubbleSortWithLabel {

    // TODO Ex 6_1 라벨 출력
    // 패스1:
    //  6 4 3 7 1 9 + 8
    //  6 4 3 7 1 - 8 9
    // ...
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }

    private static void bubbleSort(int[] x, int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.println("패스" + (i + 1) + ":");
            int j = n - 1;
            for (int z = 0; z < x.length; z++) {
                boolean exchange = false;
                System.out.printf("%3d", x[z]);

                if (j > i) {
                    if (x[j - 1] > x[j]) {
                        exchange = true;
                        swap(x, j - 1, j);
                    }
                }

                // TODO: 스왑이 발생하기 전 출력이 되어야 함
                if (z == j) {
                    System.out.printf("%s", exchange ? "+" : "-");
                }
                j--;
            }
            System.out.println();
        }
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
