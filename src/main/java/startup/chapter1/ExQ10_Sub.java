package startup.chapter1;

import java.util.Scanner;

public class ExQ10_Sub {

    // 두 변수 a, b에 정수를 입력하고 b - a를 출력하시오.
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a;
        int b;
        boolean isGreaterThen;

        System.out.print("a의 값 : ");
        a = stdIn.nextInt();

        do {
            System.out.print("b의 값 : ");
            b = stdIn.nextInt();
            isGreaterThen = a < b;

            if (!isGreaterThen) {
                System.out.println("a보다 큰 값을 입력하세요!");
            }
        } while (!isGreaterThen);

        System.out.println("b - a는 " + (b - a) + "입니다.");
    }
}
