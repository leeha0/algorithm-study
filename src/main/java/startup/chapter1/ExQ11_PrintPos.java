package startup.chapter1;

import java.util.Scanner;

public class ExQ11_PrintPos {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하시오.");
        System.out.print("n : ");
        int n = stdIn.nextInt();
        int unit = 1;
        int pos = 0;

        while (n / unit > 0) {
            pos++;
            unit = unit * 10;
        }

        System.out.println("그 수는 " + pos + "자리입니다.");
    }
}
