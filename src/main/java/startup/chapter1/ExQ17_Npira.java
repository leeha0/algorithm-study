package startup.chapter1;

import java.util.Scanner;

public class ExQ17_Npira {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("숫자 피라미드를 출력하시오.");
        System.out.print("단 수를 입력하세요. : ");

        n = stdIn.nextInt();
        npira(n);
    }

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
    }
}
