package startup.chapter1;

import java.util.Scanner;

public class ExQ15_TriangleLB {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
    }

    // 왼쪽 아래가 직각인 이등변 삼각형을 출력
    // *
    // **
    // ***
    public static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 왼쪽 위가 직각인 이등변 삼각형을 출력
    // ***
    // **
    // *
    public static void triangleLU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 오른쪽 위가 직각인 이등변 삼각형을 출력
    // ***
    //  **
    //   *
    public static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > n - i; j--) {
                System.out.print("-");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 오른쪽 아래가 직각인 이등변 삼각형을 출력
    //   *
    //  **
    // ***
    public static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
