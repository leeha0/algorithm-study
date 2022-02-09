package startup.chapter1;

import java.util.Scanner;

public class ExQ_GaussSum {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("n : ");
        int n = stdIn.nextInt();
        System.out.println("(1 + " + n + ") * 5 = " + (1 + n) * 5);
    }
}
