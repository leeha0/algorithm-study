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
    }

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
    }
}
