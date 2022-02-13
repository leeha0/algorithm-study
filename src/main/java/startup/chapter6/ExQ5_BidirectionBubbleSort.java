package startup.chapter6;

import java.util.Scanner;

public class ExQ5_BidirectionBubbleSort {
    // CocktailSort
    // ShakerSort

    public static void main(String[] args) {

        System.out.println("양방향 버블 정렬을 구현하시오.");
        System.out.println("홀수 번재의 패스틑 가장 작은 요소를 맨 앞으로 옮기고 짝수 번째 패스는 가장 큰 요소를 뒤로 옮긴다.");
        int a[] = {9, 1, 3, 4, 6, 7, 8};
        int sortedNumberOfLeft = 0;
        int sortedNumberOfRight = 0;

        for (int i = 0; i < a.length; i++) {
            // 패스
            int passNumber = i + 1;
            System.out.println("패스" + passNumber + ":");
            if (isOddNumber(passNumber)) {
                // 홀수
                for (int j = a.length - 1 - sortedNumberOfRight; j > sortedNumberOfLeft; j--) {
                    if (a[j] < a[j - 1]) {
                        swap(a, j, j - 1);
                    }
                }
                sortedNumberOfLeft++;
                for (int i1 : a) {
                    System.out.printf("%3d", i1);
                }
                System.out.println();
            } else {
                // 짝수
                for (int j = sortedNumberOfLeft; j < a.length - 1 - sortedNumberOfRight; j++) {
                    if (a[j] > a[j + 1]) {
                        swap(a, j, j + 1);
                    }
                }
                sortedNumberOfRight++;
                for (int i1 : a) {
                    System.out.printf("%3d", i1);
                }
                System.out.println();
            }
        }
    }

    public static void swap(int a[], int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    public static boolean isOddNumber(int n) {
        return n % 2 == 1;
    }

}
