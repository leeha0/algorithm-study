package startup.chapter1;

import java.util.Scanner;

public class Ex1_3_JudgeSign {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값의 부호(양수/음수/0)을 판단하시오.");
        System.out.println("정수를 입력하세요. : ");
        int n = stdIn.nextInt();

        if (n > 0) {
            System.out.println("이 수는 양수입니다.");
        } else if (n < 0) {
            System.out.println("이 수는 음수입니다.");
        } else {
            System.out.println("이 수는 0입니다.");
        }
    }
}
