package startup.chapter1;

import java.util.Scanner;

public class Ex1C_2_Digits {

    // 두자릿수의 양수로 입력을 제한
    // 논리 연산과 드모르간 법칙
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리의 정수를 입력하세요.");

        do {
            System.out.println("입력 : ");
            no = stdIn.nextInt();
        // } while (no < 10 || no > 99);
        // 드모르간 법칙
        } while (!(no >= 10 && no <= 99));

        System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");
    }
}
