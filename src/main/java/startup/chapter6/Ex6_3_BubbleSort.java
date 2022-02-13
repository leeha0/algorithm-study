package startup.chapter6;

import java.util.Scanner;

public class Ex6_3_BubbleSort {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬(버전 3)");
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
        int k = 0;
        while (k < n - 1) {
            // 마지막으로 요소를 교환한 위치
            int last = n - 1;
            for (int j = n - 1; j > k; j--) {
                if (x[j - 1] > x[j]) {
                    swap(x, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
