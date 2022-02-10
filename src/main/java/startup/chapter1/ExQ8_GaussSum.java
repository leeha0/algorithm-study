package startup.chapter1;

import java.util.Scanner;

public class ExQ8_GaussSum {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 가우스의 덧셈으로 구하시오.");
        System.out.print("n : ");
        int n = stdIn.nextInt();
        System.out.println("(1 + " + n + ") * 5 = " + (1 + n) * 5);
    }
}
