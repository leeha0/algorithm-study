package startup.chapter1;

import java.util.Scanner;

public class ExQ16_Spira {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");
        System.out.print("몇 단 삼격형입니까? : ");

        n = stdIn.nextInt();
        spira(n);
        spira2(n);
    }

    //  *
    // ***
    //*****
    public static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }
            for (int j = n; j > n - i; j--) {
                System.out.print("*");
            }
            for (int j = n; j > n - i + 1; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    // i 행에는 (i - 1) * 2 + 1개의 기호를 출력하시오.
    public static void spira2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < ((i - 1) * 2 + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
