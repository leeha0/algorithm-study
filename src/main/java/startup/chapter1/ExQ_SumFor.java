package startup.chapter1;

import java.util.Scanner;

public class ExQ_SumFor {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("n : ");
        int n = stdIn.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(i + (i < n ? " + " : ""));
        }
        System.out.println(" = " + sum);
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
