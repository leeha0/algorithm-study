package startup.chapter1;

import java.util.Scanner;

public class ExQ14_Square {

    // *****
    // *****
    // *****
    // *****
    // *****
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("입력한 수를 한 변으로 하는 정사각형을 출력하시오.");
        System.out.println("사각형을 출력합니다.");
        System.out.print("단 수 : ");

        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
