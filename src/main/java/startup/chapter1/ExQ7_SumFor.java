package startup.chapter1;

import java.util.Scanner;

public class ExQ7_SumFor {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구하는 전체 공식을 출력하시오.");
        System.out.print("n : ");
        int n = stdIn.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(i + (i < n ? " + " : ""));
        }
        System.out.println(" = " + sum);
    }
}
