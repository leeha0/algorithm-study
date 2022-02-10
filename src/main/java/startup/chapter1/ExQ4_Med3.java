package startup.chapter1;

import java.util.Scanner;

public class ExQ4_Med3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b, c;

        System.out.println("세 값의 모든 대소 관계(13가지)를 비교하여 중아값을 구하시오.");
        System.out.print("a : ");
        a = stdIn.nextInt();
        System.out.print("b : ");
        b = stdIn.nextInt();
        System.out.print("c : ");
        c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "이다.");
    }

    public static int med3(int a, int b, int c) {
        if (a > b && b > c) {
            return b;
        } else if (a > b && b == c) {
            return b;
        } else if (a > c && c > b) {
            return c;
        } else if (a == c && c > b) {
            return b;
        } else if (c > a && a > b) {
            return a;
        } else if (a == b && b > c) {
            return c;
        } else if (a == b && b == c) {
            return a;
        } else if (c > a && a == b) {
            return a;
        } else if (b > a && a > c) {
            return a;
        } else if (b > a && a == c) {
            return a;
        } else if (b > c && c > a) {
            return c;
        } else if (b == c && c > a) {
            return a;
        } else if (c > b && b > a) {
            return b;
        }

        return -1;
    }
}
