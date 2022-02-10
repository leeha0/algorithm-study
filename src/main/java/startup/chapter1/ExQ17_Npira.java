package startup.chapter1;

import java.util.Scanner;

public class ExQ17_Npira {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("숫자 피라미드를 출력하시오.");
        System.out.print("몇 단 삼격형입니까? : ");

        n = stdIn.nextInt();
        npira(n);
        npira2(n);
    }

    //  1
    // 222
    //33333
    public static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }
            for (int j = n; j > n - i; j--) {
                System.out.print(i);
            }
            for (int j = n; j > n - i + 1; j--) {
                System.out.print(i);
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    // i 행에는 (i - 1) * 2 + 1개의 기호를 출력하시오.
    // i 행에 출력하는 i % 10 숫자를 출력하시오.
    public static void npira2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < ((i - 1) * 2 + 1); j++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
        System.out.println();
    }
}
