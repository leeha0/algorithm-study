package startup.chapter1;

import java.util.Scanner;

public class ExQ9_SumFor {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구하는 전체 공식을 출력하시오.");
        System.out.print("n : ");
        int n = stdIn.nextInt();

        System.out.println("sumOf = " + sumOf(0, n));
    }

    public static int sumOf(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
