package startup.chapter2;

import java.util.Random;
import java.util.Scanner;

public class Ex2_5_MaxOfArrayRand {

    public static void main(String[] args) {
        // 난수를 사용할 때 생성하는 클래스
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("난수로 생성한 배열의 최댓값을 구하시오.");
        System.out.print("사람 수 : ");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            // 0 부터 n - 1 까지의 난수 발생
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }

    public static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
