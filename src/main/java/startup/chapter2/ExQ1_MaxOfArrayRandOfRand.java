package startup.chapter2;

import java.util.Random;

public class ExQ1_MaxOfArrayRandOfRand {

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("난수로 생성한 배열의 최댓값을 구하시오.");
        int num = rand.nextInt(10);
        System.out.println("사람 수 : " + num);

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
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
